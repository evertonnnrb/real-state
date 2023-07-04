package com.realstate.jdbc;

import org.junit.Assert;
import org.junit.Test;

public class TestConnection {
    @Test
    public void testShouldReturnInstanceOfConnection(){
        Assert.assertNotNull(ConnectionFactory.createConnection());
    }
}
