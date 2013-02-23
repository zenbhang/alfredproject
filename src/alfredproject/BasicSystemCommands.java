/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredproject;

/**
 *
 * @author Ben
 */
public class BasicSystemCommands {
public static Alfredproject ap = new Alfredproject();

    
    public static void BasicSystemCommands(String command){
        
        determiner(command);
        //Turn off Alfred command
        
        //turn off computer
        
        //sleep mode
        
        
    }
    private static void determiner(String command){
        if(command.contains("turn off")||command.contains("shut down")&&!command.contains("computer")){
            //shuts down alfred
            TurnOff();
        }else{
            
        }
    }
    private static void TurnOff(){
        //command closes alfred
        ap.OutputString = ap.GoodbyeResponse;
        ap.TimetoShutdown = true;
    }
}
