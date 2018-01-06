/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.SQLException;

/**
 *
 * @author Chath
 */
public class Prog {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Book b1 = new Book();
        System.out.println(b1.addBook("ad", "ad", "ad", "ad", 1));
        
    }
}
