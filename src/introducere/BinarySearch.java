package introducere;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vect = { 1, 5, 7, 7 ,9, 10, 12, 14, 18, 25};
		int a=12;
		int poz= binarySearch(vect,a);
		if (poz==-1){
			System.out.println(a+ " nu exista in vector ");
		}
		else{
			System.out.println(a+ " este pe pozitia "+ poz);
		}
		
		
	}
	
	public static int binarySearch(int[] v, int a){
		
		int n=v.length-1; int i=0;
		if (v.length == 0) {
			return -1;
		}
		int mij=-1;
		while(i<=n){
			mij= (n-i)/2+i;
			if (a==v[mij] )  {
				return mij;	
			}
			else if (a>v[mij]) {
				i=mij+1;
				
			}
			else{
				n=mij-1;
			}
			
		}
		return -1;	
	}

}
