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
public class CustomerDAO {
    static Connection conn;
    static PreparedStatement pst;
    
    public static int insertCustomer(CustomerBean u){
        int status = 0; 
        try {
            conn= ConnectionProvider.getCon();
            pst= conn.prepareStatement("INSERT INTO app.employee  VALUES (?,?)");
            pst.setString(1, u.getName());
            pst.setString(2, u.getSurname());
            status=pst.executeUpdate();
            conn.close();
            System.out.println(String.format("Executed insert statement. Affected %d rows", status));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
