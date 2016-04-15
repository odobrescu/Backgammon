package introducere;

import java.util.Scanner;

public class Pin {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String PIN="9999";
		int i=0;
		do { 
			
			System.out.println("Introduceti PIN-ul dumneavoastra");
			 String a =keyboard.nextLine();
			if (PIN.equals(a)) {
				System.out.println("PIN-ul introdus este corect !"); break;
			}
			if (i==2) System.out.println( " card Blocat");
						else System.out.println("Pinul introdus este gresit! Mai aveti  "+ (2-i) + " incercari");
			i++;
		} while(i<3);
		
	keyboard.close();
	}

}
