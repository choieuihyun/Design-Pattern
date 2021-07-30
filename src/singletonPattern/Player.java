package singletonPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	
	
	public static void main(String [] args) {
		
		WareHouse wh = WareHouse.getInstance();
		WareHouse wh2 = WareHouse.getInstance();
		
		Character blaster = wh.additem();
		Character scouter = wh.additem();
	
		System.out.println(blaster.getItem());
		System.out.println(scouter.getItem());
		
		System.out.println(blaster.getItem() == scouter.getItem());
	

	}

}

	



	

