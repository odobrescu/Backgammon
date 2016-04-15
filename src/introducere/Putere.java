package introducere;

public class Putere {

	public static void main(String[] args) {
		int i = 81;
		if (putere(i)) System.out.println("este putere");
					else System.out.println("nu este putere");

	}
public static boolean putere(int i){
	double a = Math.log(i)/Math.log(3);
	if (Math.floor(a)==a) return true;
	else return false;
}
}
