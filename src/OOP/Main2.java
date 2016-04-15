package OOP;

import java.util.ArrayList;

public class Main2 {
	
	// making a non param array list 
    	ArrayList myList = new ArrayList();
}

class Player {

	private String name;
	private int score;

	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		String regex = "[A-Z][a-z]+";
		
		
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public boolean setScore(int score) {

		if (score >= 0) {
			this.score = score;
			return true;
		}
		return false;
	}

}
