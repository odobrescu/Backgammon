// problema  8 din C08 - Introducere

package introducere;

public class Zar {
	
	public static void main(String[] args) {
//		int a = (int)(Math.random()*6+1);
//		int b = (int)(Math.random()*6+1);
//		
//		System.out.println("Felicitari! Ai dat  "+ a + " -- "+ b);
//	

		// Posibil angajat; caz 1: e progr, stie engleza, caz 2 : nu e progr, stie engleza, 
		// caz 3: e progr, nu stie engleza, caz 4: nu e progr, nu stie engleza
		
//		boolean e=true;
//		boolean p = true;
//	
//		if (p&&e) System.out.println("a fost angajat pe salariu mare");
//			else if (!(p | e)) System.out.println(" nu a fost angajat");
//				else  System.out.println("a fost angajat, pe salariu mic"); 
//		
//		if (p^e)System.out.println("a fost angajat, salariu mic");
//		else if ( p) System.out.println("a fost angajat, salariu mare");
//		else System.out.println("nu a fost angajat");
		
		int a= 10;
		
		switch (a){
		case 10: System.out.println("1bon");
		case 9: System.out.println("2bon");
		case 8: System.out.println("3bon");
		case 7: System.out.println("4bon");
		case 6: System.out.println("5bon");
		}

	}

}
