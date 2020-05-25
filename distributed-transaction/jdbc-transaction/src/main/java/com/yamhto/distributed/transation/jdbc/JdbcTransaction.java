package com.yamhto.distributed.transation.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author yamhto
 * @className: JdbcTransaction.java
 * @package com.yamhto.distributed.com.yamhto.distributed.jdbc
 * @description: 通过JBDC实现事务
 * @date 2020/5/23 21:51
 */
public class JdbcTransaction {

    public static final Logger LOG = LoggerFactory.getLogger(JdbcTransaction.class);

    public static void main(String[] args) {

        JdbcTransaction();

    }

    private static void JdbcTransaction() {

        LOG.debug("事务开始");

        final Connection conn = MySqlConnUtils.getConn();
        PreparedStatement statement = null;
        try {
            conn.setAutoCommit(false);

            String SQL = "update people set age=? where username=?";
            statement = conn.prepareStatement(SQL);
            statement.setString(1, "2");
            statement.setString(2, "ym");
            statement.executeUpdate();

            error();

            String SQL2 = "update people set age=? where username=?";
            statement = conn.prepareStatement(SQL2);
            statement.setString(1, "2");
            statement.setString(2, "wb");
            statement.executeUpdate();


            conn.commit();

        } catch (Exception e) {
            LOG.error("事务出错，进行回滚操作");
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            MySqlConnUtils.close(conn, statement);

            LOG.debug("事务结束");
        }
    }

    private static void error() {
        System.out.println("ERROR");
        throw new RuntimeException("Error");
    }
}
