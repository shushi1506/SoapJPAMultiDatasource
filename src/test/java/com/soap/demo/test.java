package com.soap.demo;

import com.soap.demo.endpoint.core.Utils.Commons;
import com.soap.demo.endpoint.core.api.Pkcs12Crypto;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author anhbt 6/12/2018
 * com.soap.demo
 */
public class test {
    public static void main(String[] args) throws Exception {
//        Calendar calendar=new GregorianCalendar();
//        calendar.add(Calendar.MINUTE,30);
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.getTimeInMillis());
//        Pkcs12Crypto pkcs12Crypto=new Pkcs12Crypto();
//        String en=(pkcs12Crypto.encryptText("Hello baby_"+calendar.getTimeInMillis(), pkcs12Crypto.getPublicKey("/data/service.p12", "Oracle_123456a#", "service.private.seteda")));
//        System.out.println("Encode:"+ en);
//        String de=pkcs12Crypto.decryptText(en,pkcs12Crypto.getPrivateKey("/data/service.p12", "Oracle_123456a#", "service.private.seteda"));
//        System.out.println("Decode:"+ de);
//        String[]j=de.split("_");
//        System.out.println(j[j.length-1]);
//        Date t = new Date();
//        t.setTime(Long.valueOf(j[j.length-1]));
//        System.out.println(t);
        Commons cm=new Commons();cm.showConfig();
    }
}
