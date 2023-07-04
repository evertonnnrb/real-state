package com.realstate.excpetion;

import java.sql.SQLException;

public class DBException extends RuntimeException {
    public DBException(String msg){
        super(msg);
    }

    public DBException(SQLException e) {
        super(e);
    }
}
