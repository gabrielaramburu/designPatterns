package decorator;

public abstract class DecoratorBase implements MyInterface{
	private MyInterface wrapper;
	
	public DecoratorBase(MyInterface wrapper) {
		this.wrapper = wrapper;
		this.wrapper.doSomethingVeryImportant();
	}
	
	
}
