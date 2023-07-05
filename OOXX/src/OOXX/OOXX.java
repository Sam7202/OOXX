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

		//		switch(gamestatus) {
		//			case 1:
		//				System.out.println("You WIN!!");
		//				break;
		//			case 2:
		//				System.out.println("You Lose :( ");
		//				break;
		//			case 3:
		//				System.out.println("No one Wins :/ ");
		//				break;
		//		}
	}
	//	boolean checkRestart() {
	//		System.out.println("Wanna try again? \n'Y' for Yes, or press 'E' to Exit");
	//		char restart = scan.next().charAt(0);
	//		if(restart=='Y') {
	//			return true;
	//		}
	//		else if(restart=='E'){
	//			return false;
	//		}
	//		else {
	//			return false;
	//		}
	//	}
	public static void checkgameStatus() throws MyException{
		switch(gamestatus) {
		case 1:
			MyException e = new MyException();
			e.setgamestate(1);
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
