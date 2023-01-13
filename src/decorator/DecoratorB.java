package decorator;

public class DecoratorB extends DecoratorBase{

	public DecoratorB(MyInterface wrapper) {
		super(wrapper);
		
	}

	@Override
	public void doSomethingVeryImportant() {
		System.out.println("executing DecoratorB");
	}

}
