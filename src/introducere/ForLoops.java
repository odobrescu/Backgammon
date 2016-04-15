package introducere;

public class ForLoops {

	public static void main(String[] args) {
		// 1 ex  /introducere-20
//		for (int  i=0;i<10;i++){
//			for(int j=0;j<10;j++){
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
		// 2nd ex /introducere-20
//		for (int  i=0;i<10;i++){
//			for(int j=0;j<10;j++){
//				if (i==j){
//					System.out.print("1");
//				}
//				else{
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
//		
		// 3d ex /introducere-20
//		for (int  i=0;i<10;i++){
//			for(int j=0;j<10;j++){
//				if (i+1==j){
//					System.out.print("1");
//				}
//				else{
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
		
		// 4th ex /introducere-20
//				for (int  i=0;i<10;i++){
//					for(int j=0;j<10;j++){
//						if (j==(9-i)){
//							System.out.print("1");
//						}
//						else{
//							System.out.print("0");
//						}
//					}
//					System.out.println();
//				}
		
		// 5th ex /introducere-20
//				for (int  i=0;i<6;i++){
//					for( int j=0 ;j<i+1;j++){
//						System.out.print(i);
//					}
//					System.out.println();
//				}
		//6th ex	
//				for (int  i=0;i<6;i++){
//					for( int j=0 ;j<6-i;j++){
//						System.out.print(i);
//					}
//					System.out.println();
//				}
//			
		/*                  1
		 *                2 1 2
		 *              3 2 1 2 3
		 *            4 3 2 1 2 3 4
		 *            ..............    
		 * */
		
//		int piramida= 9;
//		for (int i=1;i<=piramida;i++){
//			// spaces before the numbers
//			for( int j=0;j<piramida- i;j++){
//				System.out.print(" ");
//			}
//			//first half of numbers,
//			for (int k =i+1 ;k>1;k--){
//				System.out.print(k-1);
//			}
//			//
//			for (int k =2 ;k<=i;k++){
//				System.out.print(k);
//			}
//			System.out.println();
//		}
	}

}
