package com.soap.demo.endpoint.core.Utils;

/**
 * @author anhbt 6/5/2018
 * com.soap.demo.endpoint.core.Utils
 */
public class ConfigServerDeleteFile {
    private String hostName;
    private String userName;
    private String passWord;

    public ConfigServerDeleteFile() {
        hostName="";
        userName="";
        passWord="";
    }

    public ConfigServerDeleteFile(String hostName, String userName, String passWord) {
        this.hostName = hostName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "ConfigServerDeleteFile{" +
                "hostName='" + hostName + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
