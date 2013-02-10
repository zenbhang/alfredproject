/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alfredproject;
import com.sun.speech.freetts.FreeTTS;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
import java.io.FileInputStream;

/**
 *
 * @author Ben
 */
public class TextToVoice {
    public void call(String OutputString){
        //calls upon the output string
        Voice voice;
        VoiceManager vm= VoiceManager.getInstance();
        //chooses voice
        voice = vm.getVoice("kevin16");
        voice.allocate();
        voice.speak(OutputString);
        voice.deallocate();
     
        
    }
}
