package backgammon;

import java.util.ArrayList;

public class Backgammon {
	
	
	public static void main(String[] args) {
		//public static ArrayList[] board = new ArrayList[26];
		Board.initializeGame();
		Board.showBoard();
		Board.play();
	}

	}
