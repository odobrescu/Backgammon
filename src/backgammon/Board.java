package backgammon;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	static ArrayList[] board = new ArrayList[26];
	static int whereToMove;
	static int toMove;
	static int count = 0;

	public static void showBoard() {
		for (int i = 1; i <= 12; i++) {

			if (i < 10) {
				System.out.print(i + " |");
			} else {
				System.out.print(i + "|");
			}
			for (int j = 0; j < 15; j++) {
				try {
					System.out.print(((Piece) board[i].get(j)).getColor());
				} catch (NullPointerException e) {
					System.out.print(" ");
				} catch (IndexOutOfBoundsException e) {
					System.out.print(" ");
				}
			}

			for (int j = 14; j >= 0; j--) {
				try {
					System.out.print(((Piece) board[25 - i].get(j)).getColor());
				} catch (NullPointerException e) {
					System.out.print(" ");
				} catch (IndexOutOfBoundsException e) {
					System.out.print(" ");
				}
			}
			System.out.print("|" + (25 - i));
			if (i == 6) {
				System.out.println();
				for (int j = 0; j <= 35; j++) {
					System.out.print("=");
				}
			}
			System.out.println();
		}
	}

	public static void initializeGame() {

		for (int i = 0; i < 26; i++) {
			board[i] = new ArrayList();
		}

		board[1].add(new Piece("W"));
		board[1].add(new Piece("W"));

		board[12].add(new Piece("W"));
		board[12].add(new Piece("W"));
		board[12].add(new Piece("W"));
		board[12].add(new Piece("W"));
		board[12].add(new Piece("W"));

		board[17].add(new Piece("W"));
		board[17].add(new Piece("W"));
		board[17].add(new Piece("W"));

		board[19].add(new Piece("W"));
		board[19].add(new Piece("W"));
		board[19].add(new Piece("W"));
		board[19].add(new Piece("W"));
		board[19].add(new Piece("W"));

		board[24].add(new Piece("B"));
		board[24].add(new Piece("B"));

		board[13].add(new Piece("B"));
		board[13].add(new Piece("B"));
		board[13].add(new Piece("B"));
		board[13].add(new Piece("B"));
		board[13].add(new Piece("B"));

		board[8].add(new Piece("B"));
		board[8].add(new Piece("B"));
		board[8].add(new Piece("B"));

		board[6].add(new Piece("B"));
		board[6].add(new Piece("B"));
		board[6].add(new Piece("B"));
		board[6].add(new Piece("B"));
		board[6].add(new Piece("B"));
	}

	public static void movePlayer() {
		Dice d = new Dice();

		int[] roll = d.rollDices();
		int movements = 2;
		if (roll[0] == roll[1]) {
			movements = 4;
		}
		Scanner sc = new Scanner(System.in);
		while (movements != 0){
			
		boolean corect = false;
		do {
			// the do while asks for moves until you insert a valid move
			System.out.println("Introdu  pozitia piesei pe care vrei s-o muti  ");
			toMove = sc.nextInt();

			if (toMove < 1 || toMove > 24) {
				System.out.println(" pozitia introdusa este invalida. Incearca din nou");
				continue;
			}
			if (board[toMove ].isEmpty()) {
				System.out.println("esti pe o casuta goala. Incearca din nou");
				continue;
			}

			System.out.println("Introdu  pozitia unde vrei s-o muti  ");
			whereToMove = sc.nextInt();

			if (!(roll[0] + toMove  == whereToMove || roll[1] + toMove  == whereToMove)) {
				System.out.println(" ai introdus o mutare gresita. incearca din nou");
			} else {
				corect = true;
			}

		} while (corect == false);

		if (isValid(whereToMove)) {
			Piece clona = new Piece ("");
			clona = (Piece) (board[toMove].get(board[toMove].size()- 1));
			board[whereToMove].add(clona);
			board[toMove ].remove(clona);
		}
		movements--;
		showBoard();
		}

		sc.close();
		//return board;
	}

	public static boolean isValid(int whereToMove) {
		// method checks if a piece is can be moved with j pos

		if (board[whereToMove].isEmpty()) {
			return true;
		} else {
			Piece n= new Piece("");
			n = (Piece)(board[whereToMove].get(board[whereToMove].size() - 1));
			if (n.getColor() == "W") {
				return true;
				
			} else {
				if (board[whereToMove].size()> 1) {
					return false;
				}else {
					return true;
				}
			}
		}

		
	}

	public static boolean canMove(ArrayList[] board, int i) {
		// method that checks if the piece exist

		if (board[i].isEmpty()) {
			return false;
		}
		Piece p = (Piece) (board[i].get(board[i].size() - 1));

		if (p.isWhite(p)) {
			return true;
		}
		return false;
	}



	public static void play() {
		 movePlayer();
		

	}
}
