package com.soap.demo.endpoint.core.Utils;

import com.jcraft.jsch.*;
import com.soap.demo.DefinedConfig;
import com.soap.demo.endpoint.implemented.basic.FileSftp;
import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
                    destinationPath = DefinedConfig.SFTP_FOLDER_HD;
                    break;
                case 5:
                    destinationPath =DefinedConfig.SFTP_FOLDER_LICENSE;
                    break;
                default:
                    destinationPath =DefinedConfig.SFTP_FOLDER_CO;
                    break;
            }
            String fileName=fileSftp.getFileName().toUpperCase().replaceAll("[^\\w\\s]","");
            channelSftp.cd(DefinedConfig.SFTP_FOLDER_ROOT + destinationPath);
            channelSftp.put(getByteFromString(fileSftp.getEncoded()), name+ "_" + fileName+".pdf");
            channelSftp.rm(DefinedConfig.SFTP_FOLDER_ROOT+"/"+path);
            return new UploadFileSuccess( "http://"+DefinedConfig.SFTP_HOST_NAME + ":" + DefinedConfig.SFTP_PORT_VIEW_FILE + destinationPath + name +"_"+ fileName +".pdf");
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

    public List<UploadFileSuccess> upLoadListFile(List<FileSftp> list) {
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        List<UploadFileSuccess> listState = new ArrayList<>();
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
                            destinationPath = DefinedConfig.SFTP_FOLDER_HD;
                            break;
                        case 5:
                            destinationPath =DefinedConfig.SFTP_FOLDER_LICENSE;
                            break;
                        default:
                            destinationPath =DefinedConfig.SFTP_FOLDER_CO;
                            break;
                    }
                    channelSftp.cd(DefinedConfig.SFTP_FOLDER_ROOT + destinationPath);
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
                    channelSftp.put(getByteFromString(temp.getEncoded()), name+ "_" + fileName +".pdf");
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
}
