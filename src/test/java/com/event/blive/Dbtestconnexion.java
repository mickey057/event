package com.event.blive;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Dbtestconnexion {

    @Autowired
    private DataSource datasource;

    @Test
    public void testConnection() throws SQLException {
        Connection connection = datasource.getConnection();
        assertTrue(connection.isValid(0));
    }

}

