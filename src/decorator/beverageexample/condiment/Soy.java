package decorator.beverageexample.condiment;

import decorator.beverageexample.beverage.Beverage;

public class Soy extends Condiment{

	public Soy(Beverage beverage) {
		this.wrappedBeverage = beverage;
		
	}

	@Override
	public double cost() {
		System.out.println("Adding Soy");
		return this.wrappedBeverage.cost() + 0.5;
	}

	@Override
	public String desc() {
		return "Soy";
	}

}
