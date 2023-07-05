package OOXX;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import javax.sound.sampled.*;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OOXXFrame extends JFrame implements ActionListener{
	Buttons buttons;
	JPanel panel;
	boolean start=false;
	boolean end = false;
	OOXXFrame() {

		buttons = new Buttons();
		buttons.buttono.addActionListener(this);
		buttons.buttonx.addActionListener(this);
		
		panel = new JPanel();
		panel.setVisible(true);
		panel.setBounds(0, 0, 320, 320);	
		panel.setBackground(Color.GRAY);
		panel.setLayout( new GridBagLayout() );
		panel.add(buttons.buttono,new GridBagConstraints());
		panel.add(buttons.buttonx,new GridBagConstraints());
		
		this.setVisible(true);
		this.setSize(320,320);
		this.setTitle("OOXX");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttons.buttono) {
			panel.removeAll();
			panel.revalidate();
			panel.repaint();
			OOXX.choice="O";
			OOXX.gamestatus=0;
			creatPlayingInterface();
			//set user choice O
		}            
		else if(e.getSource()==buttons.buttonx) {
			panel.removeAll();
			panel.revalidate();
			panel.repaint();
			OOXX.choice="X";
			OOXX.gamestatus=0;
			creatPlayingInterface();
			//set user X
		}

		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons.button[i] && Game.checkUserPosition(i)) {
					buttons.button[i].setText(OOXX.choice);
					OOXX.position=i;
					OOXX.start();
					checkGameStatus();
					buttons.button[OOXX.aiposition].setText(OOXX.aichoice);//fix
			}
		}

		//set user choice X
	}

	public void creatPlayingInterface(){
		buttons.creatButtons();
		panel.setLayout(new GridLayout(3,3,5,5));

		for(int i=0;i<9;i++) {
			buttons.button[i].addActionListener(this);
			panel.add(buttons.button[i]);

		}
	}
	public void checkGameStatus() {
		switch(OOXX.gamestatus) {
		case 1:
			System.out.println(" You WIN!!");
			new Amogus("You WIN!!");
			break;
		case 2:
			System.out.println(" You Lose :( ");
			new Amogus("You Lose :( ");
			break;
		case 3:
			System.out.println(" No one Wins :/ ");
			new Amogus(" No one Wins :/ ");
			break;
			
		default:
			return;
		}
		//if the game has end then close the frame
			this.dispose();
	}
}


