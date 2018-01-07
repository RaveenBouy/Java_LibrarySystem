/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

/**
 *
 * @author shenal
 */
public class Fine {
    
    private final int penalty =5;
    private final int borrowDayLimit=7;
    private int fine;
    public int calcFine(int noOfDays){
    
    if(noOfDays>borrowDayLimit)
    {
    fine=(noOfDays-borrowDayLimit)*penalty;
    }
    return fine;
    }
    
}
