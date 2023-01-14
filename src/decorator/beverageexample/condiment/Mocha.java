package decorator.beverageexample.condiment;

import decorator.beverageexample.beverage.Beverage;

public class Mocha extends Condiment{

	public Mocha(Beverage beverage) {
		this.wrappedBeverage = beverage;
	}

	@Override
	public double cost() {
		System.out.println("Adding Mocha");
		return this.wrappedBeverage.cost() + 0.2;
	}

	@Override
	public String desc() {
		return "Mocha";
	}

}
