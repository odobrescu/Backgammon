package introducere;

public class Recursivitate {

	public static void main(String[] args) {
		// System.out.println( factorial(5));
		// System.out.println( "The bunnies have "+ bunnyEars(5) + " big bloppy
		// ears");
		int n = 5;
		 System.out.println("the " + n+"th elemnet of the Fibonacci Sequence is "+ fibonacci(n));

		// System.out.println( "The mutant bunnies have "+ mutantBunnyEars(5) +
		// " big bloppy ears");
		// System.out.println("the " + n+"th row has "+ triangles(n) + " number
		// of blocks ");

		// System.out.println(" 12345 are suma cifrelor " + digits(12345));

//		System.out.println(" 717 are numarul de aparitii  " + count7(717 ));
		

//		System.out.println(" 888818 are numarul de aparitii  " + count8(888818 ));
		
//		System.out.println(" n la puterea m este  " + powerN(3,4) );
		
//		String s= "ih";
//		System.out.println( "  in stringul :  "+ s+"  , x apare de  " + countX(s,s.length()-1)+ " ori");
//		int[] a= {1,3};
//		int n=0;
//		System.out.print( "  in vectorul : {1 ,3,6} ");
//		if (array6(a, n)){
//			System.out.println(" apare 6");
//		}
//		else{
//			System.out.println("nu apare 6");
//		}
		
		//stars(5);
		
	}
	
	
	

	/* Factorial */
	public static int factorial(int x) {
		System.out.println(x);
		if (x == 1) {

			return 1;
		}

		return x * factorial(x - 1);
	}

	/* Bunny Ears */
	public static int bunnyEars(int x) {
		if (x == 0) {
			return 0;
		}

		return 2 + bunnyEars(x - 1);
	}

	/* Fibonacci */
	public static int fibonacci(int x) {
		if (x == 1) {
			return 0;
		}
		if (x == 2) {
			return 1;
		}

		return fibonacci(x - 1) + fibonacci(x - 2);
	}

	/* Mutant Bunnies */
	public static int mutantBunnyEars(int x) {
		if (x == 0) {
			return 0;
		}
		return 3 - (x % 2) + mutantBunnyEars(x - 1);
	}

	/* Triangles */
	public static int triangles(int x) {
		if (x == 0) {
			return 0;
		}
		return x + triangles(x - 1);
	}

	/* Sum of a number's digits */
	public static int digits(int x) {
		if (x == 0) {
			return 0;
		}
		return (x % 10) + digits(x / 10);
	}

	/* Count the number of apparences of 7 */
	public static int count7(int x) {
		if (x == 0) {
			return 0;
		}
		if (x % 10 == 7) {
			return 1+ count7(x / 10);
		}
		else
			return count7(x / 10);
	}
	
	/* Count the number of apparences of 8 */
	public static int count8(int x) {
		if (x == 0) {
			return 0;
		}
		if (x % 10 == 8) {
			if ((x/100)%10 == 8 ){
				return 2+ count8(x/10);
			}else{
				return 1+ count8(x / 10);
			}
		}
			return count8(x / 10);
	}
	
	/* power N */
	public static int powerN(int n, int x) {
		if (x == 1) {
			return n;
		}
		return n * powerN(n,x - 1);
	}
	
	/* number of 'x' in a String  */
	public static int countX(String s ,int n) {
		if (n == -1) return 0;
		if (s.charAt(n)=='x') {
			return 1+ countX(s,n-1);
		}
		return 0+countX(s,n-1);
	}
	
	/* Is there 6 in an array? */
	public static boolean array6(int[] a ,int n) {
		if (n>=a.length) return false;
		if (a[n]==6) {return true;
		}
		return false ||(array6(a, n+1));
			
		}
	
	
	/*    5*   */
//	
//		public static void stars (int n) {
//				int k = n;
//				
//				if (n==0) {
//					return;
//				}
//				else {
//					
//					while(k!=0) {
//					System.out.print("*");
//					k--;
//					}
//					System.out.println();
//					stars(n-1);
//					
//				}
		
		

	
	
	}

