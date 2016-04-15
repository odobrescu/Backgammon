/* 
 * Varianta 1: O metodă primește arrayul 4 2 -3 3 1 -2 -5. Ea parcurge arrayul astfel: începe cu indexul 0. Apoi
merge x căsuțe în față sau în spate în funcție de valoarea din index. Dacă pe indexul 0 scrie 4, merge 4 căsuțe în
față. Dacă scrie -3 merge 3 căsuțe înapoi. Se presupune că metoda nu știe câte elemente are array-ul.
Să se afișeze de câte ori face salturi până când iese din array, sau -1 dacă nu iese din array niciodată.
Varianta 2: se primește arrayul: 4 4 1 3 -2 2 -5

*/
package introducere;

public class ArraysExe {

	public static void main(String[] args) {
		// int[] vect = {4, 2, -3, 3, 1,-2,-5};
		int[] vect = { 4, 4, 1, 3, -2, 2, -5 };
		// int[] vect={5,2};
		int a = jumps(vect);
		if (a == -1) {
			System.out.println(" Mingea nu mai iese din vector ");
		} else {
			System.out.println(" Mingea iese din vector in " + a + " pasi  ");
		}

	}

	public static int jumps(int[] v) {
		int count = 1;
		// create a new vector "w", with the same length as the original input vecter. 
		// In w we will mark each time our index visited the 
		int[] w = new int[v.length];
		
		
		if (v.length == 0) {
			return 0;
		} else {
			int index = 0;

			boolean visited = false;
			while (!visited) {
				index = index + v[index];
				if (index >= v.length || index < 0)
					break;
				
				w[index]++;
				if (w[index] > 1) {
					visited = true;
				}

				count++;
			}
			if (visited)
				return -1;

		}
		return count;
	}

}
