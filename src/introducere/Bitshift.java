package introducere;

public class Bitshift {

	public static void main(String[] args) {
//		 int red  = 144;
//		 int green = 254;
//		 int blue = 16;
//		 int value;
//		 
//		 int red1= red<<16;
//		 int green1= green<<8;
//		 value = red1|green1|blue;
//		 
//		 System.out.println(Integer.toBinaryString(value));
//		 
		String[] culori = {"roz", "albastru", "rosu", "galben", null,  "violet", null, "negru"};
//		System.out.println( (int)(Math.random()*27 + 10));
//		
//		int i= 0;
//		System.out.println( i++);
//		System.out.println(++i);
		
//		System.out.println(goGreen(culori));
		
		//int[][][] a = {{1,2},{100,101,102},{-50,-49,-48,-47}};
		String [][] multiArr = {{"panseluta","mac"},{"vulpe", "iepuras", null, "caprioara"},{null,
			"Bucuresti", "Ierusalim"}};
		
		int[][][] threeDimArr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } ,{ { 8, 6 }, { 7, 8 } },{ {9, 6 }, { 7, 8 } }};
		
//		for (int i=0; i<multiArr.length;i++){
//			for (int j=0; j<multiArr[i].length;j++){
//				System.out.print( multiArr[i][j]+ "  ");
//			}
//			System.out.println();
		
		for (int i=0; i<threeDimArr.length;i++){
			for (int j=0; j<threeDimArr[i].length;j++){
				for (int z=0; z< threeDimArr[i][j].length;z++){
					
				System.out.print( threeDimArr[i][j][z]+ "  ");
			}
//			System.out.println(); 
			}
			System.out.println();
		}
	}
	
	
		public static int goGreen( String[] culori){

			for ( int i=0; i<culori.length; i++){

			if ("verde".equals(culori[i])) {return  i;}
			

			}
			return -1;


			}
		


}
