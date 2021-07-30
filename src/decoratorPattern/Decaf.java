package decoratorPattern;

public class Decaf extends Beverage {

	public Decaf() {
		
		description = "Decaf";
		
	}
	
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.0;
	}

}
