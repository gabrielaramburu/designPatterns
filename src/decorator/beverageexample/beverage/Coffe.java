package decorator.beverageexample.beverage;

public class Coffe implements Beverage{


	@Override
	public String desc() {
		return "Te";
	}

	@Override
	public double cost() {
		return 1.50;
	}

}
