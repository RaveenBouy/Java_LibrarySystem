/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Chath
 */
public class DatabaseCon {
  

    public static Connection getConnection() throws ClassNotFoundException, SQLException{
     Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
    return conn;
    }
    public String insert(String sql) throws ClassNotFoundException, SQLException
    {
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
    java.sql.Statement stmt = conn.createStatement();
    String status = Integer.toString(stmt.executeUpdate(sql));
    conn.close();
    return status;
    }
    
        public ResultSet select(String sql) throws ClassNotFoundException, SQLException
    {
    Connection conn = getConnection();
    java.sql.Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    //conn.close();
    return rs;
    }
     public ResultSet select(String sql,String name) throws ClassNotFoundException, SQLException
    {
    Connection conn = getConnection();
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, name);
    ResultSet rs = pstmt.executeQuery();
    //conn.close();
    return rs;
    }
     
      public ResultSet select(String sql,String name, int no) throws ClassNotFoundException, SQLException
    {
    Connection conn = getConnection();
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, no);
    pstmt.setString(2, name);  
    ResultSet rs = pstmt.executeQuery();
    //conn.close();
    return rs;
    }
}
