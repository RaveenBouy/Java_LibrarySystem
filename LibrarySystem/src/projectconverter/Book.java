/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chath
 */
public class Book implements Manage{
    
    private String bkname,description,authName,genre;
    private int availability;
    
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setName(String bkname) {
        this.bkname = bkname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    

    public String addBook() throws ClassNotFoundException, SQLException
    {
    String msg="-1";
    String sql = "INSERT INTO book(name,description,authName,genre,availability) "
            + "VALUES('"+bkname+"','"+description+"','"+authName+"','"+genre+"'," +availability+")";
    try{
    DatabaseCon con = new DatabaseCon();
    msg=con.insert(sql);
    msg= "Success!";
    }
    
    catch(SQLException e){
        msg = "failed to add book!";
    }
    catch(Exception e){
        
        msg = e.toString();
    }
    finally{
    return msg;
    }
    }
    
    public static ResultSet getBooks() throws ClassNotFoundException, SQLException    {
    String sql = "SELECT name FROM book";
    DatabaseCon con = new DatabaseCon();
    return con.select(sql);
    }

    public static ResultSet getBookDetails(String name) throws ClassNotFoundException, SQLException {
        //
        //selecting book from list will send name of book which is then used in where clause of sql
        //overload select methodin DatabaseCon
    String sql = "SELECT name,description,authName,genre,availability FROM book WHERE name=?";
    DatabaseCon con = new DatabaseCon();
    return con.select(sql,name);
    }
 

    @Override
    public ResultSet search(String name) {
     String sql = "SELECT name,description,authName,genre,availability FROM book WHERE name LIKE '%"+name+"%'";
    ResultSet rs = null;
     DatabaseCon con = new DatabaseCon();
        try {
            rs = con.select(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        return rs; }
    }

    @Override
    public ResultSet sort() {
        String sql = "SELECT name FROM book SORT BY ASC";
        ResultSet rs = null;
        DatabaseCon con = new DatabaseCon();
        try {
           rs = con.select(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        return rs; }
    }
}