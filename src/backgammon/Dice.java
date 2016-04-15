package backgammon;

public class Dice {
	public static int count = 0;
	public int rollDice(){
		return (int)(Math.random()*5+1);
	}
	
	public int[] rollDices(){
		 int [] roll = new int[2];
		 roll[0] = rollDice();
		 roll[1] =  rollDice();
		// if (count% 2 == 0){
			 System.out.println( " Ai dat   "+ roll[0] + " - "+roll[1]); 
//		 } else {
//			 System.out.println(" Este randul computer-ului. A dat  " + roll[0] + " - "+roll[1]);
//		 }
		// count++;
		
		return roll;
	}
}
