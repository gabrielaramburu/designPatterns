package chaiofresponsability;

public class TaskB extends ChainExecutor{

	@Override
	public String executeConcreteTask(String s) {
		System.out.println("Excecuting task B: upperCase");
		return s.toUpperCase();
	}

}
