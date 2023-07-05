package OOXX;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons{
	JButton buttono;
	JButton buttonx;
	JPanel panel;
	JButton button[];
	Buttons(){
		buttono = new JButton();
		buttono.setBounds(50, 70, 100, 100); 
		buttono.setBackground(new Color(0xB5CAA0));
		buttono.setFocusable(false);
		buttono.setText("O");
		buttono.setFont(new Font("Comic sans",Font.BOLD,80));
		//		buttono.setLayout(null);

		buttonx = new JButton();
		buttonx.setBounds(160, 70, 100, 100);
		buttonx.setBackground(new Color(0xB5CAA0));
		buttonx.setFocusable(false);
		buttonx.setText("X");
		buttonx.setFont(new Font("Comic sans",Font.BOLD,80));

		

	}


	public void creatButtons() {
		button = new JButton[9];
		for (int i = 0; i < 9; i++) {
			button[i] = new JButton("Button " + i);
			button[i].setBounds(50, 70, 100, 100); 
			button[i].setBackground(new Color(0xB5CAA0));
			button[i].setFocusable(false);
			button[i].setText("");
			button[i].setFont(new Font("Comic sans",Font.BOLD,80));
//			button[i].addActionListener(this);
		}
	}


	public static void checkgameStatus() {
		switch(OOXX.gamestatus) {
		case 1:
//			MyException e = new MyException();
//			e.setgamestate(1);
			System.out.println("You WIN!!");
			break;
		case 2:
			System.out.println("You Lose :( ");
			break;
		case 3:
			System.out.println("No one Wins :/ ");
			break;
		}
	}

}
