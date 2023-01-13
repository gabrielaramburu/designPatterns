package decorator;

public class Tester {

	public static void main(String[] args) {
		
		new DecoratorB(
				new DecoratorA(
						new MyObject())).doSomethingVeryImportant();
	}

}
