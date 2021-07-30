package singletonPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
	
	public static ArrayList<String> pwh = new ArrayList<String>();
	
	public ArrayList<String> getItem() {
		
		int i = 0;
		
		while(i < 100) {
			
			Scanner sc = new Scanner(System.in);
			
			if(pwh.contains("stop")) {
				pwh.remove("stop");
				break;
			}
			
			pwh.add(sc.next());
			
			i++;
			
		}
		
		return pwh;
		
	}
		
		
}
