package OOXX;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Amogus {
	Amogus(String text) {
		boolean drop=false;
		int time=0;

		AmogusLabel mylabel = new AmogusLabel(text);
		AmogusFrame myframe = new AmogusFrame();
		myframe.add(mylabel);//Do things same with frame.add(label) 

		File file = new File(".//assets/AmongUsTrapRemix.wav");
//		InputStream inputStream  = getClass().getClassLoader().getResourceAsStream("AmongUsTrapRemix.wav");
		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);

			clip.start();

			clip.loop(100);


			if(time%10==0) {
				mylabel.setForeground(getrandomclor());//the time frequency
			}
			time++;
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//add music
	}

	private static Color getrandomclor() {
		Random rand=new Random();
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		return new Color(r,g,b);


	}
}
