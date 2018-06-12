package com.soap.demo.endpoint.core.api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;

/**
 * @author anhbt 6/12/2018
 * com.soap.demo.endpoint.core.api
 */
public class GenerateKeysRSA {
    private KeyPairGenerator keyGen;
    private KeyPair pair;
    private PrivateKey privateKey;
    private PublicKey publicKey;

    public GenerateKeysRSA(int keylength) throws NoSuchAlgorithmException, NoSuchProviderException {
        this.keyGen = KeyPairGenerator.getInstance("RSA");
        this.keyGen.initialize(keylength);
    }

    public void createKeys() {
        this.pair = this.keyGen.generateKeyPair();
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public void writeToFile(String path, byte[] key) throws IOException {
        File f = new File(path);
        f.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(f);
        fos.write(key);
        fos.flush();
        fos.close();
    }
//    public static void main(String[] args) {
//        GenerateKeysRSA gk;
//        try {
//            gk = new GenerateKeysRSA(1024);
//            gk.createKeys();
//            gk.writeToFile("KeyPair/publicKey1", gk.getPublicKey().getEncoded());
//            gk.writeToFile("KeyPair/privateKey1", gk.getPrivateKey().getEncoded());
//        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
//            System.err.println(e.getMessage());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//
//    }
}
