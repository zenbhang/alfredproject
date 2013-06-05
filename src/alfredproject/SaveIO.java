/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredproject;

/**
 *
 * @author Ben
 */
import java.io.*;
import java.util.*;
public class SaveIO {
    public static File settings= new File("settings.txt");
    public static void Save() throws IOException{      
        BufferedWriter writer = null;
        try{
        if(settings.exists()){
        settings.delete();
        }
        settings.createNewFile();
        writer = new BufferedWriter(new FileWriter(settings));
        Alfredproject ap = new Alfredproject();
        //writes first
        writer.write("BotName "+ap.BotName);
        writer.newLine();
        writer.write("ThankYouResponse " + ap.ThankYouResponse);
        writer.newLine();
        writer.write("FinishingStatement "+ap.FinishingStatement);
        //writer.write("BotVoice"); add in later
        }catch (IOException e){
            System.err.println(e);
        }
        finally{
        if (writer != null) writer.close();
        }
            
        }
    
    }
    


