package OOXX;

import java.util.Scanner;

public class OOXX {
	Scanner scan=new Scanner(System.in);
	//	System.out.println("Chose 'O' or 'X' ");//Should present on GUI
	static String choice;
	static String aichoice;
	static int aiposition;
	static int gamestatus;
	static int position;//read action from button

	static Game game=new Game();
	public static void resetGameStatus(){
		OOXX.gamestatus=0;
	}
	public static void start(){
		//		game.build(choice);
		game.setchoice(choice);
		game.setaichoice();
		//here to add a GUI
		OOXX.aichoice=game.aichoice;


		game.userSetPosition(OOXX.position);//use button to set choice
		gamestatus=game.checkGameStatus();
		game.aiSetPosition();
		aiposition=game.getaiposition();
		gamestatus=game.checkGameStatus();
		//and present on GUI
	}
}
