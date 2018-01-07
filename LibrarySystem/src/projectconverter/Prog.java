/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Chath
 */
public class Prog {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Book b1 = new Book();
         //System.out.println(b1.addBook("ad", "ad", "ad", "ad", 1));
          //Author a1 = new Author();
         //a1.setTitle("mr.");
         //a1.setName("shehan faka");
         //a1.setNationality("thambi");
         //a1.setCity("walgama");
         //a1.setCountry("Saudi Kingdom");
         //a1.setContact("0779237123");
         //System.out.println(a1.addPerson());
         ResultSet rs= b1.search("prog");
         while(rs.next()){
         System.out.print(rs.getString(1)+":");
         System.out.println(rs.getString(2));
         System.out.print(rs.getString(3)+":");
         System.out.println(rs.getString(4));
         //System.out.print(rs.getString(5)+":");
         //System.out.println(rs.getString(6));
         
         
         }
         
    }
}
