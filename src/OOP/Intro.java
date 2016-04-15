package OOP;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		
	    SuperMarket cora = new SuperMarket("CORA");
		SuperMarket decathlon = new SuperMarket("DECATHLON");
	
		cora.sucursala[0] = new Store("Berceni");
		cora.sucursala[1] = new Store("Unirii");
		cora.sucursala[2] = new Store("Lujerului");
		
		decathlon.sucursala[0] = new Store("Dr Taberei");
		decathlon.sucursala[1] = new Store("Universitate");
		decathlon.sucursala[2] = new Store("Baneasa");
		
		cora.sucursala[0].prod[0] =  new Products("oua");
		cora.sucursala[0].prod[1] =  new Products("lapte");
		cora.sucursala[0].prod[2] =  new Products("sampon");
		cora.sucursala[1].prod[0] =  new Products("branza");
		cora.sucursala[1].prod[1] =  new Products("deodorant");
		cora.sucursala[1].prod[2] =  new Products("sampon");
		cora.sucursala[2].prod[0] =  new Products("oua");
		cora.sucursala[2].prod[1] =  new Products("lapte");
		cora.sucursala[2].prod[2] =  new Products("sampon");
		

		decathlon.sucursala[0].prod[0] =  new Products("role");
		decathlon.sucursala[0].prod[1] =  new Products("racheta tenis");
		decathlon.sucursala[0].prod[2] =  new Products("minge basket");
		decathlon.sucursala[1].prod[0] =  new Products("role");
		decathlon.sucursala[1].prod[1] =  new Products("placa snowboard");
		decathlon.sucursala[1].prod[2] =  new Products("deodorant");
		decathlon.sucursala[2].prod[0] =  new Products("racheta tenis");
		decathlon.sucursala[2].prod[1] =  new Products("minge fotbal");
		decathlon.sucursala[2].prod[2] =  new Products("gantere 5kg");
		
//		for (int i=0 ; i< cora.sucursala.length; i++){
//			System.out.print( );
//		}
	
	}

}
