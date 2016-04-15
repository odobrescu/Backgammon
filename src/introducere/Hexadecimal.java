package introducere;

import java.util.Scanner;

public class Hexadecimal {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduceti numarul dumneavoastra");
		int a =keyboard.nextInt();
		String hexa = DecToHex(a);
		
		System.out.println( " numarul "+ a+" in hexa este  "+ hexa);
		
	}
		public static String DecToHex(int dec){
			  char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			              'A', 'B', 'C', 'D', 'E', 'F'};
			  String hex = "";
			  while (dec != 0) {
			      int r = dec % 16;
			      hex = hexDigits[r] + hex;
			      dec = dec / 16;
			  }
			  return hex;
			}
	

}
