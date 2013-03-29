/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredproject;

/**
 *
 * @author Ben
 */
public class BasicWeatherCommands {
    public static void BasicWeatherCommands(String command){
        determiner(command);
    }
    private static void determiner(String command){
        if(command.contains("weather")){
            Weather();
        }else{
            if(command.contains("climate") || command.contains("temperature") || command.contains("temp")){
                Climate();
            }
        }
    }
    private static void Weather(){
        
        
    }
    private static void Climate(){
        
        
    }
}
