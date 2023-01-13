package decorator;

public class DecoratorA extends DecoratorBase{

	public DecoratorA(MyInterface wrapper) {
		super(wrapper);
	}

	@Override
	public void doSomethingVeryImportant() {
		System.out.println("executing DecoratorA");
	}

}
