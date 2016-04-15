package introducere;

public class BubbleSort {

	public static void main(String[] args) {
		int[] vect = { 4, 4, 1, 3, -2, 2, -5 };
		// int[] vect={5,2};
		System.out.print(" vectorul este         ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + "  ");
		}
		System.out.println();
		int[] a = bSort(vect);
		System.out.print(" vectorul sortat este  ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

	}

	public static int[] bSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (j > (a.length - i)) {
					continue;
				}
				if (a[j] > a[j + 1]) {
					int aux;
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}

			}
		}
		return a;
	}
}
