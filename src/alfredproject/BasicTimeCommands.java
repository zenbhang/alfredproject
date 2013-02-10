/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredproject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ben
 */
public class BasicTimeCommands {
    public static Boolean ThanksIsDeserved = false, ThanksWasReceived = false;
    public static Alfredproject ap = new Alfredproject();
    
    public static void BasicTimeCommands(String command){
        Date date = new Date();
         if(command.contains("time")){
             //outputs time
             //gets time
             date.getTime();
             //sets format
             SimpleDateFormat fr = new SimpleDateFormat ("hh:mm, a");
             //sets Output String
             ap.OutputString = "It is "+ fr.format(date)+ ".";
             
             //task done Thank you is deserved
             ThanksIsDeserved = true;
         }
         if(command.contains("date")){
             //outputs date
             //gets date
             date.getDate();
             //sets format
             SimpleDateFormat fr = new SimpleDateFormat("EEEE, MMMMM dd, yyyy");
             //sets Output String
             ap.OutputString = "It is "+ fr.format(date)+ ".";
             
             //task done Thank you is deserved
             ThanksIsDeserved = true;
         }
    }
}
