package backgammon;

import java.util.ArrayList;
import java.util.Scanner;

public class Piece {
	public Scanner sc = new Scanner(System.in);
	private String color;
	static int move;
	static int piece;
	
	public Piece(String s) {
		setColor(s);
	}

	public String toString() {
		return color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWhite(Piece p) {

		if (p.getColor() == " W") {
			return true;
		}
		return false;
	}

}
