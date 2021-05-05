/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodical;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

/**
 *
 * @author Augustin
 */
public class music {

    /**
     *
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public static void bgmusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("src\\res\\bgms.wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file); 
        Clip clip = AudioSystem.getClip();
        clip.open(audiostream);
        
        clip.start();
    }
    
    /**
     *
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public static void correct() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file2 = new File("src\\res\\applause_y.wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file2); 
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audiostream);
        
        clip2.start();
    }
    
    /**
     *
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public static void wrong() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file3 = new File("src\\res\\boom_x.wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file3); 
        Clip clip3 = AudioSystem.getClip();
        clip3.open(audiostream);
        
        clip3.start();
    }
    
}
