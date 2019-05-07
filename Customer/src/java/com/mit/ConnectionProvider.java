/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit;

import java.sql.*;

/**
 *
 * @author kusur
 */
public class ConnectionProvider implements Provider {

    static Connection con = null;

    public static Connection getCon() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connected to postgresql server successfully.");
        } catch (ClassNotFoundException ex) {
            System.out.println("ConnectionProvider " + ex);
        }
        return con;
    }

}
