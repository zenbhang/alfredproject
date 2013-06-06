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
        //opens forecast in browser
        Alfredproject ap = new Alfredproject();
        BareBonesBrowserLauncher bbbl = new BareBonesBrowserLauncher();
        String url="";
        url="www.wunderground.com/cgi-bin/findweather/hdfForecast?query=";
        url = url+ap.ZipCode;
        bbbl.openURL(url);
        
    }
    private static void Climate(){
        //do later, for now it just redirects to weather
        Weather();
        
        
    }
}
