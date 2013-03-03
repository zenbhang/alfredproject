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
        
        //lock computer
    }
    private static void determiner(String command){
        if(command.contains("turn off")||command.contains("shut down")&&!command.contains("computer")){
            //shuts down alfred
            TurnOff();
        }else{
            if(command.contains("lock")&&command.contains("computer")){
                LockComputer();
            }else{
                if(command.contains("computer")&&command.contains("sleep")){
                    SleepComputer();
                }
            }
        }
    }
    private static void TurnOff(){
        //command closes alfred
        ap.OutputString = ap.GoodbyeResponse;
        ap.TimetoShutdown = true;
    }
    private static void LockComputer(){
        //locks computer
        ap.OutputString = ap.FinishingStatement;
        //to finish later likely to simulate keypresses of windows-L
    }
    private static void SleepComputer(){
        //puts computer to sleep
        ap.OutputString = ap.FinishingStatement;
        //to finish later likely to simulate keypresses of fn-f1
    }
}
