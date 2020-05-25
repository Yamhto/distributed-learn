package com.yamhto.distributed.transation.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @author yamhto
 * @className: MySqlConnUtils.java
 * @package com.yamhto.distributed.com.yamhto.distributed.jdbc
 * @description: 连接Mysql工具
 * @date 2020/5/23 21:52
 */
public class MySqlConnUtils {

    public static final String driver = "com.mysql.jdbc.Driver";

    public static final String url = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC";

    public static final String username = "root";

    public static final String password = "123456";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void close(AutoCloseable... closes) {
        Arrays.asList(closes).forEach(close -> {
            try {
                if (null != close) {
                    close.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


}
