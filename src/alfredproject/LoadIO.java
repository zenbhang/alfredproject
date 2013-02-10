/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredproject;
import java.util.*;
import java.io.*;
/**
 *
 * @author Ben
 */
public class LoadIO {
    public static File settings= new File("settings.txt");
    public static void Load() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(settings));

        //makes settings file if it does not exist
        if(!settings.exists()){
            FirstTimeCheck();
        }
        //otherwise
        
        while(reader.readLine()!=null){
            String searcher = "";
            searcher=reader.readLine();
            //testing purposes
            System.out.println(searcher);
            //end of testing
            Loader(searcher);   
        }
        
        //still have to add voice changer
        //
        //
        
    }
    private static void FirstTimeCheck() throws IOException{
        SaveIO save = new SaveIO();
        save.Save();
    }
    private static void Loader(String searcher){
        Alfredproject ap = new Alfredproject();
        int index = searcher.indexOf("BotName ");
        ap.BotName = searcher.substring(index);
        index = searcher.indexOf("ThankYouResponse ");
        ap.ThankYouResponse = searcher.substring(index);
        
    }
}
