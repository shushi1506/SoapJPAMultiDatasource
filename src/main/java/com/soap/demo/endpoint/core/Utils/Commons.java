package com.soap.demo.endpoint.core.Utils;

import com.jcraft.jsch.*;
import com.soap.demo.DefinedConfig;
import com.soap.demo.endpoint.implemented.basic.FileSftp;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.SocketException;
import java.util.*;

/**
 * @author anhbt 5/23/2018
 * com.soap.demo.endpoint.core.Utils
 */
public class Commons {
    Logger log= LogManager.getLogger(Commons.class);
    public StateReponse upLoadFile(String encoded, String fileName, int type) {
        Date t = new Date();
        System.out.println(t.getTime());
        String destinationPath = null;
        StateReponse sp = new StateReponse();
        switch (type) {
            case 1:
                destinationPath = DefinedConfig.SFTP_FOLDER_ROOT + DefinedConfig.SFTP_FOLDER_CO;
                break;
            case 2:
                destinationPath =DefinedConfig.SFTP_FOLDER_ROOT + DefinedConfig.SFTP_FOLDER_CQ;
                break;
            case 3:
                destinationPath =DefinedConfig.SFTP_FOLDER_ROOT + DefinedConfig.SFTP_FOLDER_BH;
                break;
            case 4:
                destinationPath =DefinedConfig.SFTP_FOLDER_ROOT + DefinedConfig.SFTP_FOLDER_HD;
                break;
            case 5:
                destinationPath =DefinedConfig.SFTP_FOLDER_ROOT + DefinedConfig.SFTP_FOLDER_LICENSE;
                break;
            default:
                destinationPath =DefinedConfig.SFTP_FOLDER_ROOT + DefinedConfig.SFTP_FOLDER_CO;
                break;
        }
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        try {
            JSch jsch = new JSch();
            session = jsch.getSession(DefinedConfig.SFTP_USERNAME, DefinedConfig.SFTP_HOST_NAME, DefinedConfig.SFTP_PORT);
            session.setPassword(DefinedConfig.SFTP_PASSWORD);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp) channel;
            channelSftp.cd(destinationPath);
            SftpATTRS attrs = null;
            // check if the directory is already existing
            try {
                attrs = channelSftp.stat(destinationPath + t.getTime() + fileName);
            } catch (Exception e) {
                System.out.println(destinationPath + t.getTime() + fileName + " not found");
            }
            // else upload file
            if (attrs != null) {
                System.out.println("Directory exists IsDir=" + attrs.isDir());
                sp.setErrorcode(DefinedConfig.SFTP_ERROR_CODE_COTANIN_FILE);
                sp.setMessage(DefinedConfig.SFTP_ERROR_MESSAGE_COTANIN_FILE);
            } else {
                channelSftp.put(getByteFromString(encoded), t.getTime() + fileName);
                sp.setErrorcode("00");
                sp.setMessage("Success");
            }
        } catch (JSchException ex) {
            sp.setErrorcode("S02");
            sp.setMessage(ex.getMessage());
        } catch (SftpException e) {
            sp.setErrorcode("S03");
            sp.setMessage(e.getMessage());

        } finally {
            if (channelSftp != null)
                channelSftp.disconnect();
            if (channel != null)
                channel.disconnect();
            if (session != null)
                session.disconnect();
        }
        return sp;
    }

    private ChannelSftp getConnectSftp() throws JSchException {
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        JSch jsch = new JSch();
        session = jsch.getSession(DefinedConfig.SFTP_USERNAME, DefinedConfig.SFTP_HOST_NAME, DefinedConfig.SFTP_PORT);
        session.setPassword(DefinedConfig.SFTP_PASSWORD);
        java.util.Properties config = new java.util.Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect();
        channel = session.openChannel("sftp");
        channel.connect();
        channelSftp = (ChannelSftp) channel;
        return channelSftp;
    }
    public boolean deleteFile(String path){
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        Boolean success;
        try {
            JSch jsch = new JSch();
            session = jsch.getSession(DefinedConfig.SFTP_USERNAME, DefinedConfig.SFTP_HOST_NAME, DefinedConfig.SFTP_PORT);
            session.setPassword(DefinedConfig.SFTP_PASSWORD);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp) channel;
            channelSftp.rm(DefinedConfig.SFTP_FOLDER_ROOT+"/"+path);
            success= true;
        } catch (JSchException e) {
            success= false;
            log.error(e.getMessage());
        } catch (SftpException e) {
            success= false;
            log.error(e.getMessage());
        }finally {
            if (channelSftp != null)
                channelSftp.disconnect();
            if (channel != null)
                channel.disconnect();
            if (session != null)
                session.disconnect();
        }
        return success;
    }
    public boolean deleteFileFtp(String path,String hostName,String userName,String password) throws IOException {
        FTPClient client = new FTPClient();
        boolean temp = false;
        try {
            client.connect(hostName);
            client.login(userName, password);
            temp=client.deleteFile(path);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(client!=null && client.isConnected()){
                client.logout();
                client.disconnect();
            }
        }
        return temp;
    }
    public void showConfig(){
        for (ConfigServerDeleteFile config:getConfigProperties()
                ) {
            System.out.println(config.toString());
        }
    }
    public boolean deleteFileMultiSystem(String path){
        boolean check=false;
        for (ConfigServerDeleteFile config:getConfigProperties()
                ) {
            try {
                if(deleteFileFtp(DefinedConfig.SFTP_FOLDER_ROOT+"/"+path,config.getHostName(),config.getUserName(),config.getPassWord())){
                    check=true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return check;
    }
    public UploadFileSuccess updateFileFtp(String path,FileSftp fileFtp){
        FTPClient client = new FTPClient();
        try {
            client.connect(DefinedConfig.FTP_HOST_NAME);
            client.login(DefinedConfig.FTP_USER_NAME, DefinedConfig.FTP_PASSWORD);
            client.setFileType(FTP.BINARY_FILE_TYPE);
            client.enterLocalPassiveMode();
                try {
                    Date t = new Date();
                    String name=String.valueOf(t.getTime());
                    String destinationPath = null;
                    switch (fileFtp.getType()) {
                        case 1:
                            destinationPath = DefinedConfig.SFTP_FOLDER_CO;
                            break;
                        case 2:
                            destinationPath = DefinedConfig.SFTP_FOLDER_CQ;
                            break;
                        case 3:
                            destinationPath = DefinedConfig.SFTP_FOLDER_BH;
                            break;
                        case 4:
                            destinationPath =DefinedConfig.SFTP_FOLDER_LICENSE;
                            break;
                        case 5:
                            destinationPath = DefinedConfig.SFTP_FOLDER_HD;
                            break;
                        default:
                            destinationPath =DefinedConfig.SFTP_FOLDER_CO;
                            break;
                    }
                    String fileName=fileFtp.getFileName().toUpperCase().replaceAll("[^\\w\\s]","");
                    String firstRemoteFile = DefinedConfig.FTP_FOLDER_ROOT + destinationPath + name +"_"+ fileName+".pdf";
                    log.info(firstRemoteFile);
                    boolean done = client.storeFile(firstRemoteFile, getByteFromString(fileFtp.getEncoded()));
                    boolean check=false;
                    try {
                        for (ConfigServerDeleteFile config:getConfigProperties()
                                ) {
                            if(deleteFileFtp(DefinedConfig.SFTP_FOLDER_ROOT+"/"+path,config.getHostName(),config.getUserName(),config.getPassWord())){
                                check=true;
                            }
                        }
                    }catch (Exception e){
                        log.error(e.getMessage());
                    }
                    if(done) {
                        return new UploadFileSuccess( "https://"+DefinedConfig.SFTP_HOST_NAME + ":" + DefinedConfig.SFTP_PORT_VIEW_FILE + destinationPath + name +"_"+ fileName +".pdf");
                    }
                } catch (Exception ex) {
                    log.error(ex.getMessage());
                }
            try {
                if (client.isConnected()) {
                    client.logout();
                    client.disconnect();
                }
            } catch (IOException ex) {
                log.error(ex.getMessage());
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
        return null;
    }
    public Collection<ConfigServerDeleteFile>getConfigProperties(){
        Properties prop = new Properties();
        InputStream input = null;
        Collection<ConfigServerDeleteFile>cc = null;
        try {
            input = new FileInputStream(DefinedConfig.FILE_CONFIG);
            // load a properties file
            prop.load(input);
            HashMap<String,ConfigServerDeleteFile>hashMap=new HashMap<>();
            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                if(key.startsWith(DefinedConfig.PREFIX_DELETE_CONFIG)){
                    if(hashMap.containsKey(String.valueOf(key.charAt(key.length()-1)))){
                        if(key.contains(DefinedConfig.SUFFIX_DELETE_CONFIG_HOSTNAME)){
                            hashMap.get(String.valueOf(key.charAt(key.length()-1))).setHostName(prop.getProperty(key));
                        }
                        if(key.contains(DefinedConfig.SUFFIX_DELETE_CONFIG_USERNAME)){
                            hashMap.get(String.valueOf(key.charAt(key.length()-1))).setUserName(prop.getProperty(key));
                        }
                        if(key.contains(DefinedConfig.SUFFIX_DELETE_CONFIG_PASSWORD)){
                            hashMap.get(String.valueOf(key.charAt(key.length()-1))).setPassWord(prop.getProperty(key));
                        }
                    }else {
                        ConfigServerDeleteFile t=new ConfigServerDeleteFile();
                        if(key.contains(DefinedConfig.SUFFIX_DELETE_CONFIG_HOSTNAME)){
                            t.setHostName(prop.getProperty(key));
                        }
                        if(key.contains(DefinedConfig.SUFFIX_DELETE_CONFIG_USERNAME)){
                            t.setUserName(prop.getProperty(key));
                        }
                        if(key.contains(DefinedConfig.SUFFIX_DELETE_CONFIG_PASSWORD)){
                            t.setPassWord(prop.getProperty(key));
                        }
                        hashMap.put(String.valueOf(key.charAt(key.length()-1)),t);
                    }
                }
            }
            cc= hashMap.values();
        } catch (IOException ex) {
            log.error(ex.getMessage());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                   log.error(e.getMessage());
                }
            }
        }
        return cc;
    }
    public UploadFileSuccess updateFile(String path,FileSftp fileSftp){
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        try {
            JSch jsch = new JSch();
            session = jsch.getSession(DefinedConfig.SFTP_USERNAME, DefinedConfig.SFTP_HOST_NAME, DefinedConfig.SFTP_PORT);
            session.setPassword(DefinedConfig.SFTP_PASSWORD);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp) channel;
            //upload
            Date t = new Date();
            String name=String.valueOf(t.getTime());
            String destinationPath = null;
            StateReponse sp = new StateReponse();
            switch (fileSftp.getType()) {
                case 1:
                    destinationPath = DefinedConfig.SFTP_FOLDER_CO;
                    break;
                case 2:
                    destinationPath = DefinedConfig.SFTP_FOLDER_CQ;
                    break;
                case 3:
                    destinationPath = DefinedConfig.SFTP_FOLDER_BH;
                    break;
                case 4:
                    destinationPath =DefinedConfig.SFTP_FOLDER_LICENSE;
                    break;
                case 5:
                    destinationPath = DefinedConfig.SFTP_FOLDER_HD;
                    break;
                default:
                    destinationPath =DefinedConfig.SFTP_FOLDER_CO;
                    break;
            }
            String fileName=fileSftp.getFileName().toUpperCase().replaceAll("[^\\w\\s]","");
            channelSftp.cd(DefinedConfig.SFTP_FOLDER_ROOT + destinationPath);
            channelSftp.put(getByteFromString(fileSftp.getEncoded()), name+ "_" + fileName+".pdf");
            channelSftp.rm(DefinedConfig.SFTP_FOLDER_ROOT+"/"+path);
            return new UploadFileSuccess( "https://"+DefinedConfig.SFTP_HOST_NAME + ":" + DefinedConfig.SFTP_PORT_VIEW_FILE + destinationPath + name +"_"+ fileName +".pdf");
        } catch (JSchException e) {
            log.error(e.getMessage());
        } catch (SftpException e) {
            log.error(e.getMessage());
        }finally {
            if (channelSftp != null)
                channelSftp.disconnect();
            if (channel != null)
                channel.disconnect();
            if (session != null)
                session.disconnect();
        }
        return null;
    }

    public List<UploadFileSuccess>upLoadListFileFtp(List<FileSftp>list){
        FTPClient client = new FTPClient();
        List<UploadFileSuccess> listState = new ArrayList<>();
        try {
            client.connect(DefinedConfig.FTP_HOST_NAME);
            client.login(DefinedConfig.FTP_USER_NAME, DefinedConfig.FTP_PASSWORD);
            client.setFileType(FTP.BINARY_FILE_TYPE);
            client.enterLocalPassiveMode();
            for (int i = 0; i < list.size(); i++) {
                FileSftp temp = list.get(i);
                try {
                    Date t = new Date();
                    String name=String.valueOf(t.getTime());
                    String destinationPath = null;
                    switch (temp.getType()) {
                        case 1:
                            destinationPath = DefinedConfig.SFTP_FOLDER_CO;
                            break;
                        case 2:
                            destinationPath = DefinedConfig.SFTP_FOLDER_CQ;
                            break;
                        case 3:
                            destinationPath = DefinedConfig.SFTP_FOLDER_BH;
                            break;
                        case 4:
                            destinationPath =DefinedConfig.SFTP_FOLDER_LICENSE;
                            break;
                        case 5:
                            destinationPath = DefinedConfig.SFTP_FOLDER_HD;
                            break;
                        default:
                            destinationPath =DefinedConfig.SFTP_FOLDER_CO;
                            break;
                    }
                    String fileName=temp.getFileName().toUpperCase().replaceAll("[^\\w\\s]","");
                    String firstRemoteFile = DefinedConfig.FTP_FOLDER_ROOT + destinationPath + name +"_"+ fileName+".pdf";
                    log.info(firstRemoteFile);
                    boolean done = client.storeFile(firstRemoteFile, getByteFromString(temp.getEncoded()));
                    if(done) {
                        listState.add(new UploadFileSuccess("https://" + DefinedConfig.SFTP_HOST_NAME + ":" + DefinedConfig.SFTP_PORT_VIEW_FILE + destinationPath + name + "_" + fileName + ".pdf"));
                    }
                } catch (Exception ex) {
                    log.error(ex.getMessage());
                }
            }

            try {
                if (client.isConnected()) {
                    client.logout();
                    client.disconnect();
                }
            } catch (IOException ex) {
                log.error(ex.getMessage());
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
        return listState;
    }
    public List<UploadFileSuccess> upLoadListFile(List<FileSftp> list) {
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        List<UploadFileSuccess> listState = new ArrayList<>();
        Session session2=null;
        Channel channel2 = null;
        ChannelSftp channelSftp2 = null;
        try {
            JSch jsch = new JSch();
//            JSch jsch2 = new JSch();
            session = jsch.getSession(DefinedConfig.SFTP_USERNAME, DefinedConfig.SFTP_HOST_NAME_1, DefinedConfig.SFTP_PORT);
//            session2 = jsch2.getSession(DefinedConfig.SFTP_USERNAME, DefinedConfig.SFTP_HOST_NAME_2, DefinedConfig.SFTP_PORT);
            session.setPassword(DefinedConfig.SFTP_PASSWORD);
//            session2.setPassword(DefinedConfig.SFTP_PASSWORD);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
//            session2.setConfig(config);
            session.connect();
//            session2.connect();
            channel = session.openChannel("sftp");
//            channel2 = session2.openChannel("sftp");
            channel.connect();
//            channel2.connect();
            channelSftp = (ChannelSftp) channel;
//            channelSftp2 = (ChannelSftp) channel;
            log.error(DefinedConfig.SFTP_USERNAME+"_"+DefinedConfig.SFTP_HOST_NAME_1+"_" + DefinedConfig.SFTP_PORT);
            for (int i = 0; i < list.size(); i++) {
                FileSftp temp = list.get(i);
                try {
                    Date t = new Date();
                    String name=String.valueOf(t.getTime());
                    String destinationPath = null;
                    StateReponse sp = new StateReponse();
                    switch (temp.getType()) {
                        case 1:
                            destinationPath = DefinedConfig.SFTP_FOLDER_CO;
                            break;
                        case 2:
                            destinationPath = DefinedConfig.SFTP_FOLDER_CQ;
                            break;
                        case 3:
                            destinationPath = DefinedConfig.SFTP_FOLDER_BH;
                            break;
                        case 4:
                            destinationPath =DefinedConfig.SFTP_FOLDER_LICENSE;
                            break;
                        case 5:
                            destinationPath = DefinedConfig.SFTP_FOLDER_HD;
                            break;
                        default:
                            destinationPath =DefinedConfig.SFTP_FOLDER_CO;
                            break;
                    }
                    channelSftp.cd(DefinedConfig.SFTP_FOLDER_ROOT + destinationPath);
//                    channelSftp2.cd(DefinedConfig.SFTP_FOLDER_ROOT + destinationPath);
//                    SftpATTRS attrs = null;
                    // check if the directory is already existing
//                    try {
//                        attrs = channelSftp.stat(destinationPath  + t.getTime() + temp.getFileName());
//                    } catch (Exception e) {
//
//                    }
                    // else upload file
//                    if (attrs != null) {
//                        sp.setErrorcode(DefinedConfig.SFTP_ERROR_CODE_COTANIN_FILE);
//                        sp.setMessage(DefinedConfig.SFTP_ERROR_MESSAGE_COTANIN_FILE);
//                    } else {

                    String fileName=temp.getFileName().toUpperCase().replaceAll("[^\\w\\s]","");
                    log.error(fileName);
                    channelSftp.put(getByteFromString(temp.getEncoded()), name+ "_" + fileName +".pdf");
//                    channelSftp2.put(getByteFromString(temp.getEncoded()), name+ "_" + fileName +".pdf");
                    listState.add(new UploadFileSuccess( "http://"+DefinedConfig.SFTP_HOST_NAME + ":" + DefinedConfig.SFTP_PORT_VIEW_FILE + destinationPath + name +"_"+ fileName+".pdf"));
//                        sp.setErrorcode("00");
//                        sp.setMessage("Success");
//                    }
                } catch (Exception ex) {
                    log.error(ex.getMessage());
//                    listState.add(new UploadFileSuccess(temp.getFileName(), "", false, "S10", ex.getMessage()));
                }
            }
        } catch (JSchException ex) {
            log.error(ex.getMessage());
//            listState.add(new UploadFileSuccess(null, null, false, "S01", ex.getMessage()));
        } finally {
            if (channelSftp != null)
                channelSftp.disconnect();
            if (channel != null)
                channel.disconnect();
            if (session != null)
                session.disconnect();
        }
        return listState;
    }

    private ByteArrayInputStream getByteFromString(String encoded) {
        byte[] decoded = Base64.decodeBase64(encoded);
        ByteArrayInputStream bis = new ByteArrayInputStream(decoded);
        return bis;
    }
    public static boolean checkString(String input){
        if(input==null || input.equals("?") || input.isEmpty()){
            return false;
        }
        return true;
    }
    public static boolean checkString(String... params){
        System.out.println(params.length);
        for (String param : params) {
            if (!checkString(param))
                return false;
        }
        return true;
    }
    public static boolean isExpried(long date){
        return new Date().getTime() < date;
    }
}
