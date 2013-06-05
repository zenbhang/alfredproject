
//Created by Ben Zhang
//The Alfred Project
//
//
//
package alfredproject;
import java.util.*;
import java.text.*;
import java.io.*;
/**
 *
 * @author Ben
 */
public class Alfredproject {
    public static String BotName = "alfred",namestream = "", ThankYouResponse = "you are welcome, sir", command = "", OutputString = "", GoodbyeResponse = "Good Bye, Sir";
    public static String FinishingStatement = "It is done",ZipCode="55447";
    public static Boolean HasLoaded = false, TimetoShutdown = false;
    public static GUI start = new GUI();
    public static void main(String[] args) throws IOException {
      start.show();
      //Put up start message
      start.OutputBox.setText("Welcome to the Alfred Project!");
      //if name identified in stream then ReadInput() starts
      
      //otherwise ReadInput will be manually started by btnSend.
      
      //Load() is activated to create file and/or read it
      if(!HasLoaded){
      LoadIO lo = new LoadIO();
      
      //fix this later
      lo.Load();
      HasLoaded = true;

      }
    }
    public static void ReadInput(){
        //Waits for identifyer, should be stream not string
      
//override command from window.
      command = start.InputBox.getText();
//makes command lower case to be read.
      command= command.toLowerCase();
      
//Case: thank you detected
      Commands cc = new Commands();
      if(command.contains("thanks")||command.contains("thank you")){
          
          if(cc.ThanksIsDeserved = true){
              OutputString = ThankYouResponse;
              //sets thanksisdeserved to none. :(
              cc.ThanksIsDeserved = false;
              //sets text again
              start.OutputBox.setText(OutputString);
              Voice();
              cc.ThanksWasReceived = true;
              start.InputBox.setText("");
          }
      }
      
//Case: Alfred's name is called with command.
      //&& prevents repeating thank you
      if(command.contains(BotName) && !cc.ThanksWasReceived){
          //setText blank
          start.InputBox.setText("");
          //command stream continues
            //put command stream here
          //append command string
          //finds letters before Alfred's Name
          int index = command.indexOf(BotName);
          //adds letters after and the space
          index = index + BotName.length() + 1;
          //failsafe for thank you case
          command = command + " ";
          //reads output after (cuts string)
          command = command.substring(index);
//sends to method CommandInput()
          CommandInput(command);
          Voice();
          ShutdownCheck();
      }  
     //namestream =
      //
      //puts command in lowercase 
    }
    public static void CommandInput(String command){
        //recognizes inputs and follows through
        
        //basic functions
            //all commands up
            Commands cc = new Commands();
            cc.All(command);
            
            //sets text again
            start.OutputBox.setText(OutputString);
            
            
           
            
    }
    public static void Voice(){
        //sends to voice
           TextToVoice ttv = new TextToVoice();
          ttv.call(OutputString);
    }
    public static void ShutdownCheck(){
            //shuts down alfred
            //command to be used remotely
        if(TimetoShutdown){
            start.setVisible(false);
            start.dispose();
            System.exit(0);
        }
    }
    
}
