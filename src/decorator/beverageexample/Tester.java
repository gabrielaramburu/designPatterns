package decorator.beverageexample;

import decorator.beverageexample.beverage.Tea;
import decorator.beverageexample.condiment.Mocha;
import decorator.beverageexample.condiment.Soy;

public class Tester {

	public static void main(String[] args) {
		double cost = new Mocha(
				new Soy(
						new Tea())).cost();
		System.out.println("Tea with mocha and soy:" + cost);
		
		cost = new Soy(
						new Tea()).cost();
		System.out.println("Tea with soy:" + cost);
		
		cost = new Mocha(
				new Mocha(
				new Soy(
				new Tea()))).cost();
		System.out.println("Tea with double mocha and soy:" + cost);
	}

}
