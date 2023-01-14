package decorator.beverageexample.beverage;

public class Tea implements Beverage{

	
	@Override
	public String desc() {
		return "Tea";
	}

	@Override
	public double cost() {
		return 0.70;
	}

}
