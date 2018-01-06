/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Chath
 */
public class Book {
    
    
    public String addBook(String name,String description,String authName, String genre, int availability) throws ClassNotFoundException, SQLException
    {
    String msg="-1";
    String sql = "INSERT INTO book(name,description,authName,genre,availability) "
            + "VALUES('"+name+"','"+description+"','"+authName+"','"+genre+"'," +availability+")";
    try{
    DatabaseCon con = new DatabaseCon();
    msg=con.insert(sql);
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
}
