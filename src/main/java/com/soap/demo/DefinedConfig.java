package com.soap.demo;

/**
 * Created by anhbt on 5/5/2018.
 */
public class DefinedConfig {
    public static final String NAME_SPACE="http://api.qltb";
//    public static final String NAME_SPACE_="http://teca.qltb";
    public static final String DB_ORACLE_QLCB_URL = "jdbc:oracle:thin:@db-qlcb.bhxh.vn:1521:dbtd";
    public static final String DB_ORACLE_QLCB_USER = "qlcb2";
    public static final String DB_ORACLE_QLCB_PASS = "qlcb";

    public static final String DB_ORACLE_QLTB_URL = "jdbc:oracle:thin:@db-qltb.bhxh.vn:1521:dbtd";
    public static final String DB_ORACLE_QLTB_USER = "qltb";
    public static final String DB_ORACLE_QLTB_PASS = "qltb";

    //for sftp server
    public static final String SFTP_HOST_NAME = "qltbfiles.baohiemxahoi.gov.vn";
    public static final int SFTP_PORT = 22;
    public static final int SFTP_PORT_VIEW_FILE = 8082;
    public static final String SFTP_USERNAME = "qltb";
    public static final String SFTP_PASSWORD = "Oracle_123456a#";
    public static final String SFTP_FOLDER_ROOT = "/data/app/files";
    public static final String SFTP_FOLDER_CO = "/chungtu_co/";
    public static final String SFTP_FOLDER_CQ = "/chungtu_cq/";
    public static final String SFTP_FOLDER_BH = "/baohanh/";
    public static final String SFTP_FOLDER_HD = "/hopdong/";
    public static final String SFTP_FOLDER_LICENSE = "/license/";
    public static final String SFTP_ERROR_CODE_COTANIN_FILE = "S01";
    public static final String SFTP_ERROR_MESSAGE_COTANIN_FILE = "File ";


    public static final String INPUT_INVALID = "Input Invalid";
    public static final String NOT_FOUND_ERROR_CODE = "01";
    public static final String NOT_FOUND_ERROR_MESSAGE = "Not found";
    public static final String HIBERNATE_ERROR_MESSAGE = "";
    public static final String HIBERNATE_ERROR_CODE = "001";
}
