/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.ResultSet;

/**
 *
 * @author shenal
 */
public abstract class Person {

    protected String title,pname,nationality,city,country,contact;
    
    public abstract String addPerson();
    
    public abstract ResultSet viewPerson();
    
    public abstract ResultSet viewPersonDetails(String name);
}
