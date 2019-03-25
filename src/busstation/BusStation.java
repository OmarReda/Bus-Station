
package busstation;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class BusStation {

 
    public static void main(String[] args) {
      new Welcome().setVisible(true);
      File record = new File ("Recording.wav");
      playrecord (record);
    }
    
    static void playrecord (File sound){
    try {
    Clip clip = AudioSystem.getClip();
    clip.open(AudioSystem.getAudioInputStream(sound));
    clip.start();
    
    Thread.sleep(clip.getMicrosecondLength()/1000);
    }catch (Exception e){}
    
    }
    
}
