/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shenal
 */
public class Author extends Person implements Manage {

    String execmsg="";
    
        public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    @Override 
    public String addPerson(){
       
        String sql = "INSERT INTO Author(title,name,nationality,city,country,contact)" +
                "VALUES('"+this.title+ "','"+this.pname+ "','"+this.nationality+ "','"+this.city+ "','"+this.country+ "','"+this.contact+"')";
         try{
    DatabaseCon con = new DatabaseCon();
    execmsg=con.insert(sql);
    execmsg="Successful!";
    }
    
    catch(SQLException e){
        execmsg = "Could not add Author!";
    }
    catch(Exception e){
        
        execmsg = e.toString();
    }
    finally{
    return execmsg;
    }
    }
@Override 
    public ResultSet viewPerson(){
    String sql = "SELECT name FROM Author";
    DatabaseCon con = new DatabaseCon();
    ResultSet rs=null;
        try {
            rs = con.select(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getMessage();
        }
       
        return rs;
    }
 @Override  
        public ResultSet viewPersonDetails(String name)
    {
    String sql = "SELECT title,name,nationality,city,country,contact FROM Author WHERE name=?";
    DatabaseCon con = new DatabaseCon();
    ResultSet rs=null;
           try {
            rs = con.select(sql,name);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getMessage();
        }
        
        return rs; 
        
    }

   @Override
    public ResultSet search(String name) {
     String sql = "SELECT title,name,nationality,city,country,contact FROM Author WHERE name LIKE '%"+name+"%'";
    ResultSet rs = null;
     DatabaseCon con = new DatabaseCon();
        try {
            rs = con.select(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getMessage();
        }
        
        return rs; 
    }

    @Override
    public ResultSet sort() {
        String sql = "SELECT name FROM author ORDER BY name ASC";
        ResultSet rs = null;
        DatabaseCon con = new DatabaseCon();
        try {
           rs = con.select(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getMessage();
        }
        
        return rs; 
    
  
    }

    
    
    
}
