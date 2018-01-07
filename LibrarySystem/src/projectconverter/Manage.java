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
public interface Manage {
    
    public abstract ResultSet search(String name);
    public abstract ResultSet sort();
    
}
