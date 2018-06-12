package com.soap.demo;

import com.soap.demo.endpoint.core.Utils.ConfigServerDeleteFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author anhbt 6/5/2018
 * com.soap.demo
 */
public class testLoadProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("data/app/services/apiqltb/config/configapp.properties");

            // load a properties file
            prop.load(input);
            HashMap<String,ConfigServerDeleteFile>hashMap=new HashMap<>();

            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                if(key.startsWith("qltb.delete")){
                    if(hashMap.containsKey(String.valueOf(key.charAt(key.length()-1)))){
                        if(key.contains("hostname")){
                            hashMap.get(String.valueOf(key.charAt(key.length()-1))).setHostName(prop.getProperty(key));
                        }
                        if(key.contains("username")){
                            hashMap.get(String.valueOf(key.charAt(key.length()-1))).setUserName(prop.getProperty(key));
                        }
                        if(key.contains("password")){
                            hashMap.get(String.valueOf(key.charAt(key.length()-1))).setPassWord(prop.getProperty(key));
                        }
                    }else {
                        ConfigServerDeleteFile t=new ConfigServerDeleteFile();
                        if(key.contains("hostname")){
                            t.setHostName(prop.getProperty(key));
                        }
                        if(key.contains("username")){
                            t.setUserName(prop.getProperty(key));
                        }
                        if(key.contains("password")){
                            t.setPassWord(prop.getProperty(key));
                        }
                        hashMap.put(String.valueOf(key.charAt(key.length()-1)),t);
                    }
                }

                String value = prop.getProperty(key);
                System.out.println("Key : " + key + ", Value : " + value);
            }
            Collection<ConfigServerDeleteFile>cc= hashMap.values();
            for (ConfigServerDeleteFile i:cc
                    ) {
                System.out.println(i.toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
