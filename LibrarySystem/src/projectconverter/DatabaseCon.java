/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Chath
 */
public class DatabaseCon {
  

    
    public String insert(String sql) throws ClassNotFoundException, SQLException
    {
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
    java.sql.Statement stmt = conn.createStatement();
    String status = Integer.toString(stmt.executeUpdate(sql));
    conn.close();
    return status;
    }
}
