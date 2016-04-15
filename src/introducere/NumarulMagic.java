/*			Calculatorul trebuie sa ghiceasca un numar la care v-ati gandit voi (intre 1 si 100).
		Hint: el propune un numar aleator. Intreaba daca numarul la care s-a gandit userul este mai mare sau
		mai mic decat numarul propus de el. Daca este mai mare, va cauta un numar aleator intre numarul
		propus anterior si 100. Daca este mai mic, va cauta un numar aleator intre numarul propus anterior si
		0. Bonus pentru eficienta programului: cel de al doilea numar propus sa fie la jumatatea intervalului.
*/
package introducere;

import java.util.Scanner;

public class NumarulMagic {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("O sa incerc sa ghicesc numarul tau. Daca am ghicit apasa D. Daca numarul pe care l-am ghicit este mai mic decat numarul tau apasa tasta N. Daca numarul este mai mare, apasa tasta M");
		int i =1; int f=100;
		boolean gasit=false;
		int g;
		do{ 
			g = (i+f)/2;
			System.out.println( "Este "+ g +"  numarul tau? D/N/M");
			String a =keyboard.nextLine();
			
			if ("d".equals(a)) gasit=true;
			else if ("n".equals(a)) f=g;
			else i=g;
		}while (!gasit);
		System.out.println("Numarul este " + g);
		
	}

}
