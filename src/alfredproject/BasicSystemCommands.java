/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredproject;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

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
        //try statement for robot input windows - L
        //doesn't work so far.
        try{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_L);
        
        //sets timer
            Timer timer= new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run(){
                    //blank for timer
                }
            },1000);
        //end of timer results in release of keys
            
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_L);
        
        }catch (Exception e){
            e.printStackTrace();
        }
        //output statement
        ap.OutputString = ap.FinishingStatement;
        
    }
    private static void SleepComputer(){
        //puts computer to sleep
        ap.OutputString = ap.FinishingStatement;
        //to finish later likely to simulate keypresses of fn-f1
        
    }
}
