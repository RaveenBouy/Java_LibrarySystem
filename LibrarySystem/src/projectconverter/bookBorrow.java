/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chath
 */
public class bookBorrow {
 
    private String memberName;
    private String bookName;
    private int returnedAfter; 
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setReturnedAfter(int returnedAfter) {
        this.returnedAfter = returnedAfter;
    }
    
    
        public String addRecord() throws ClassNotFoundException, SQLException
        {
            
        String msg="-1";
        String sql = "INSERT INTO bookborrow(membername,bookname) "
        + "VALUES('"+memberName+"','"+bookName+"');";
       try{
        DatabaseCon con = new DatabaseCon();
        msg = con.insert(sql);
         }
    
    catch(SQLException e){
        msg = e.toString();
    }
    catch(ClassNotFoundException e){
        
        msg = e.toString();
    }
    catch(Exception e){
    msg=e.toString();
    }
    return msg;
        }


    public ResultSet returnBook(String mName,int no) throws ClassNotFoundException, SQLException
    {
    //setMemberName (),set must be used before updating
    String sql = "UPDATE bookborrow SET returnedAfter=? WHERE (memberName=? AND retunedAfter<0) ";
    DatabaseCon con = new DatabaseCon();
    return con.select(sql,mName,no);
    }
    
    
    public static ResultSet getBorrowed() throws ClassNotFoundException, SQLException    {
    String sql = "SELECT bookName,memberName,borrowedDate FROM bookborrow";
    DatabaseCon con = new DatabaseCon();
    return con.select(sql);
    }
    
    
    
    
}
