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
            Alfredproject ap = new Alfredproject();
            try{
            String searcher = "";
            
            //botname
            searcher=reader.readLine();
            //testing purposes
            System.out.println(searcher);
            
            //finds botname
            searcher = searcher.substring(8);
            //fills in botname
            ap.BotName=searcher;
            
            //thankyouresponse
            //reads next line
            searcher = reader.readLine();
            //test
            System.out.println(searcher);
            //"thankyouresponse " is 17 chars
            searcher = searcher.substring(17);
            ap.ThankYouResponse= searcher;
            
            //finishing statement
            searcher = reader.readLine();
            System.out.println(searcher);
            searcher = searcher.substring(19);
            ap.FinishingStatement= searcher;
            
            //"zipcode or Weathercode "
            searcher = reader.readLine();
            System.out.println(searcher);
            searcher=searcher.substring(23);
            ap.ZipCode=searcher;
            
            //catch exceptions
            }catch(IndexOutOfBoundsException e){}        
            }
        
        //still have to add voice changer
        //
        //
        
    }
    private static void FirstTimeCheck() throws IOException{
        SaveIO save = new SaveIO();
        save.Save();
    }

}
