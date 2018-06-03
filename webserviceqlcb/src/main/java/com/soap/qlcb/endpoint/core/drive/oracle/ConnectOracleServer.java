package com.soap.qlcb.endpoint.core.drive.oracle;



import com.soap.qlcb.DefinedConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by PC-DELL55 on 7/7/2017.
 */
public class ConnectOracleServer {
    public Connection connected (String db_oracle_url,
                          String db_oracle_user,
                          String db_oracle_password)
    {
        Connection connection = null;
        try {
//            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection(db_oracle_url,db_oracle_user,db_oracle_password);
//            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void closed( Connection conn){
        if(conn != null){
            try {
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnectionOracleQLCB() {
        ConnectOracleServer connectOracleServer = new ConnectOracleServer();
        return connectOracleServer.connected(DefinedConfig.DB_ORACLE_QLCB_URL, DefinedConfig.DB_ORACLE_QLCB_USER, DefinedConfig.DB_ORACLE_QLCB_PASS);
    }
}
