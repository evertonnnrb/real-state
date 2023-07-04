package com.realstate.jdbc;

import com.realstate.excpetion.DBException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection createConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/realstate",
                    "root","root");
        } catch (SQLException e) {
            throw new DBException(e);
        }
    }

    public static void closeConnection() {
        if (createConnection() != null) {
            try {
                createConnection().close();
            } catch (SQLException e) {
                throw new DBException(e);
            }
        }
    }
}
