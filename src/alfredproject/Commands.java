/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredproject;
/**
 *
 * @author Ben
 */
public class Commands {
    //initializes the main
    
    
    //thanks is deserved
    public static Boolean ThanksIsDeserved = false, ThanksWasReceived = false;
    //time commands
    public static void All(String command){
        //all commands 
        //initialize first
        BasicTimeCommands btc = new BasicTimeCommands();
        BasicWebCommands bwc = new BasicWebCommands();
        BasicSystemCommands bsc = new BasicSystemCommands();
        
        //run command after
        btc.BasicTimeCommands(command);
        bwc.BasicWebCommands(command);
        bsc.BasicSystemCommands(command);
        
        
    }
    
    
   
}

