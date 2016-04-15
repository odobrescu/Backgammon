package introducere;

public class Binar {

	public static void main(String[] args) {
		long a= (long) ((Math.random()* 4_294_967_296L)+1);
		short a1= 11;
		short a2 = 21;
		short a3= (short)(a1+a2);
		System.out.println( a );
		
		String binar = Long.toBinaryString(a);
		System.out.println("binarul lui "+ a+" este  "+ binar);
	}
	
}
