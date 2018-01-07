/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author shenal
 */
public class Author implements Person,Manage {

    String execmsg="Unsuccessful!";
    @Override
    public String addPerson(String title, String name, String nationality, String city, String country, String contact) {
       
        String sql = "INSERT INTO Author(title,name,nationality,city,country,contact)" +
                "VALUES('"+title+ "','"+name+ "','"+nationality+ "','"+city+ "','"+country+ "','"+contact+"')";
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
    public void viewPerson() {
        
    }

    @Override
    public void search() {
       
    }

    @Override
    public void sort() {
        
    }
    
  
      

    
    
    
}
