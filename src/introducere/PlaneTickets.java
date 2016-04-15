/* 	 ABC DEFG HIJ
 * 1
 * 2
 * 3
 *    in: String[]
 *    out:int (numarul de familii de 3 persoane care mai incap in avion, asezate alaturat)
 * */

package introducere;

public class PlaneTickets {

	public static void main(String[] args) {
		String[] bookedSeats = { "1C", "2B", "3A", "1E", "1F", "2E", "3A", "2H" };
		int n = 5;
		int noOfFamilies = planeTicket(bookedSeats, n);
		System.out.println(
				"The numbers of families of 3 that can book a flight in June :) is  "
						+ noOfFamilies);
	}

	public static int planeTicket(String[] v, int n) {
		int[][] a = new int[n + 1][13];

		// construim matricea ;
		for (int i = 0; i < 13; i++) {
			a[0][i] = 5;
		}
		for (int i = 0; i < n + 1; i++) {
			a[i][0] = 5;
		}
		for (int i = 0; i < n + 1; i++) {
			a[i][4] = 5;
			a[i][9] = 5;
		}
		// fill the matrix with looooooove, and already booked seats
		for (int i = 0; i < v.length; i++) {
			fillMatrix(a, v, i);
		}

		// calculate the number of families the fit in the plane
		int noOfFamilies = 0;
		for (int i = 0; i < n + 1; i++) {
			int j = 0;
			while (j < 11) {
				if ((a[i][j] == 0) && (a[i][j + 1] == 0) && (a[i][j + 2] == 0)) {
					noOfFamilies++;
					j = j + 2;
				} else
					j++;
			}
		}

		// afisam matricea
		// for (int i = 0; i < n + 1; i++) {
		// for (int j = 0; j < 13; j++) {
		// System.out.print(a[i][j] + " ");
		// }
		// System.out.println();
		// }

		return noOfFamilies;

	}

	public static int[][] fillMatrix(int[][] a, String[] v, int i) {
		String seat = "0ABC0DEFG0HJK";
		String s = v[i];
		char loc = s.charAt(1);
		int indexLoc = seat.indexOf(loc);
		int loca = Integer.parseInt(s.substring(0, 1));
		a[loca][indexLoc] = 1;

		return a;
	}

}
