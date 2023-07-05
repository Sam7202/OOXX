package OOXX;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AmogusLabel extends JLabel{
	AmogusLabel(String text){
		ImageIcon imageIcon = new ImageIcon("Amogus.png");
		Image image=imageIcon.getImage();
		Image newing=image.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH);
		imageIcon=new ImageIcon(newing);//resize Icon

//		boolean drop=false;
//		int time=0;
//		JLabel label = new JLabel();
		this.setText(text);
		this.setIcon(imageIcon);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setHorizontalAlignment(JLabel.CENTER);;
		this.setForeground(Color.BLACK);
		this.setFont(new Font("MV Boli",Font.CENTER_BASELINE, 50));
	}
}
