package OOXX;


import java.util.*;

public class Game {
	String choice;
	String aichoice;

	int position=0;
	int aiposition=0;
	static ArrayList<Integer> userpositionlist = new ArrayList<Integer>();
	static ArrayList<Integer> aipositionlist = new ArrayList<Integer>();

	public char ch[][]={
			{'1','|','2','|','3'},
			{'-','+','-','+','-'},
			{'4','|','5','|','6'},
			{'-','+','-','+','-'},
			{'7','|','8','|','9'}

	};
	void userSetPosition(int position) {
		switch(position) {
		case 0:
			ch[0][0]=choice.charAt(0);
			break;
		case 1:
			ch[0][2]=choice.charAt(0);
			break;
		case 2:
			ch[0][4]=choice.charAt(0);
			break;
		case 3:
			ch[2][0]=choice.charAt(0);
			break;
		case 4:
			ch[2][2]=choice.charAt(0);
			break;
		case 5:
			ch[2][4]=choice.charAt(0);
			break;
		case 6:
			ch[4][0]=choice.charAt(0);
			break;
		case 7:
			ch[4][2]=choice.charAt(0);
			break;
		case 8:
			ch[4][4]=choice.charAt(0);
			break;
		}
		userpositionlist.add(position);
	}
	void aiSetPosition() {
		if(empty()) {
			Random random=new Random();
			aiposition=random.nextInt(9);
			while(checkAiPosition(aiposition)) {
				aiposition=random.nextInt(9);
			}
			switch(aiposition) {
			case 0:
				ch[0][0]=aichoice.charAt(0);
				break;
			case 1:
				ch[0][2]=aichoice.charAt(0);
				break;
			case 2:
				ch[0][4]=aichoice.charAt(0);
				break;
			case 3:
				ch[2][0]=aichoice.charAt(0);
				break;
			case 4:
				ch[2][2]=aichoice.charAt(0);
				break;
			case 5:
				ch[2][4]=aichoice.charAt(0);
				break;
			case 6:
				ch[4][0]=aichoice.charAt(0);
				break;
			case 7:
				ch[4][2]=aichoice.charAt(0);
				break;
			case 8:
				ch[4][4]=aichoice.charAt(0);
				break;
			}
			aipositionlist.add(aiposition);
		}
	}
	public int getaiposition(){
		return aiposition;
	}
	public boolean empty() {
		if(userpositionlist.size()==5 && aipositionlist.size()==4) {
			return false;
		}
		else {
			return true;
		}
	}
	boolean checkAiPosition(int aiposition) {
		for(int checkuser:userpositionlist) {
			if(checkuser==aiposition) {
				return true;
			}
		}
		for(int checkrepeat:aipositionlist) {
			if(checkrepeat==aiposition) {
				return true;
			}
		}
		return false;
	}
	void setaichoice() {
		if(this.choice.equals("X")) {
			aichoice="O";
		}
		else {
			aichoice="X";
		}
	}
	int checkGameStatus() {
		for(int i=0;i<3;i++) {
			if(ch[2*i][0]==ch[2*i][2] && ch[2*i][2]==ch[2*i][4]) {
				if(ch[2*i][0]==choice.charAt(0)) {
					return 1;//user Wins
				}
				else {
					return 2;//ai Wins
				}
			}//row end
			else if(ch[0][2*i]==ch[2][2*i] && ch[2][2*i]==ch[4][2*i]) {
				if(ch[0][2*i]==choice.charAt(0)) {
					return 1;//user Wins
				}
				else {
					return 2;//ai Wins
				}
			}//column end
			else if(ch[0][0]==ch[2][2] && ch[2][2]==ch[4][4]) {
				if(ch[0][0]==choice.charAt(0)) {
					return 1;//user Wins
				}
				else {
					return 2;//ai Wins
				}
			}
			else if(ch[0][4]==ch[2][2] && ch[2][2]==ch[4][0]) {
				if(ch[0][4]==choice.charAt(0)) {
					return 1;//user Wins
				}
				else {
					return 2;//ai Wins
				}
			}

		}
		if(userpositionlist.size()==5) {
			return 3;
		}//No one Wins
		return 0;
	}
	public void setchoice(String choice) {
		this.choice=choice;
		
	}
	public static boolean checkUserPosition(int i) {
		for(int usedposition:userpositionlist) {
			if(i==usedposition) {
				return false;
			}
		}
		for(int aiusedposition:aipositionlist) {
			if(i==aiusedposition) {
				return false;
			}
		}
		return true;
	}

}
