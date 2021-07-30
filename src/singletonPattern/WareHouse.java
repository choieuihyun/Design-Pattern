package singletonPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class WareHouse {
	
	private static WareHouse warehouse = new WareHouse();
	
	private WareHouse() {
		System.out.println("Singleton Instance Created");
	}
	
	public static WareHouse getInstance() {
		return warehouse;
	}
	

	public Character additem() {
		Character character = new Character();
		return character;
	}



}


	

		