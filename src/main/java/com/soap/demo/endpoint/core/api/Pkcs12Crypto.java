package com.soap.demo.endpoint.core.api;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.*;
import java.security.cert.CertificateException;

/**
 * @author anhbt 6/12/2018
 * com.soap.demo.endpoint.core.api
 */
public class Pkcs12Crypto {
    public byte[] encryptData(String msg, PublicKey publicKey) {
        // specify mode and padding instead of relying on defaults (use OAEP if available!)
        Cipher encrypt = null;
        try {
            encrypt = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
        // init with the *public key*!
        try {
            encrypt.init(Cipher.ENCRYPT_MODE, publicKey);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        // encrypt with known character encoding, you should probably use hybrid cryptography instead
        try {
            byte[] encryptedMessage = encrypt.doFinal(msg.getBytes(Charset.forName("UTF-8")));
            return encryptedMessage;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String encryptText(String msg, PublicKey publicKey) {
        // specify mode and padding instead of relying on defaults (use OAEP if available!)
        Cipher encrypt = null;
        try {
            encrypt = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
        // init with the *public key*!
        try {
            encrypt.init(Cipher.ENCRYPT_MODE, publicKey);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        // encrypt with known character encoding, you should probably use hybrid cryptography instead
        try {
            byte[] encryptedMessage = encrypt.doFinal(msg.getBytes(Charset.forName("UTF-8")));
            return Base64.encodeBase64String(encryptedMessage);
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String decryptData(byte[] encryptedMessage, Key privateKey) {
        Cipher decrypt = null;
        try {
            decrypt = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
        try {
            decrypt.init(Cipher.DECRYPT_MODE, privateKey);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        String decryptedMessage = null;
        try {
            decryptedMessage = new String(decrypt.doFinal(encryptedMessage), Charset.forName("UTF-8"));
            return decryptedMessage;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String decryptText(String encryptedMessage, Key privateKey) {
        Cipher decrypt = null;
        try {
            decrypt = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
        try {
            decrypt.init(Cipher.DECRYPT_MODE, privateKey);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        String decryptedMessage = null;
        try {
            decryptedMessage = new String(decrypt.doFinal(Base64.decodeBase64(encryptedMessage)), Charset.forName("UTF-8"));
            return decryptedMessage;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public PrivateKey getPrivateKey(String fileKey, String password, String alias) throws Exception {
        KeyStore kspkcs12 = KeyStore.getInstance("PKCS12");
        kspkcs12.load(new FileInputStream(fileKey), password.toCharArray());
        Key pk = null;
        if (kspkcs12.containsAlias(alias)) {
            if (kspkcs12.isKeyEntry(alias)) {
                pk = (PrivateKey) kspkcs12.getKey(alias, password.toCharArray());
            }
        }
        if (pk == null) {
            System.out.println("Can't find pk");
            return null;
        }
        return (PrivateKey) pk;
    }

    public PublicKey getPublicKey(String fileKey, String password, String alias) throws Exception {
        KeyStore kspkcs12 = KeyStore.getInstance("PKCS12");
        kspkcs12.load(new FileInputStream(fileKey), password.toCharArray());
        java.security.cert.Certificate cert = null;
        if (kspkcs12.containsAlias(alias)) {
            if (kspkcs12.isKeyEntry(alias)) {
                cert = kspkcs12.getCertificate(alias);
            }
        }
        if (cert == null) {
            System.out.println("Can't find cert");
            return null;
        }
        return cert.getPublicKey();
    }
}
