package decorator.beverageexample.condiment;

import decorator.beverageexample.beverage.Beverage;

public abstract class Condiment implements Beverage {
	//it could be an interface but this field should be moved to each 
	//decorator
	Beverage wrappedBeverage;
	
	
	public abstract double cost();
}
