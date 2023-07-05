package OOXX;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AmogusFrame extends JFrame{
	AmogusFrame(){
		//		JFrame frame=new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Amogus");
		this.getContentPane().setBackground(new Color(0xB5CAA0));
	
	}
}
