package chaiofresponsability;

public class TaskA extends ChainExecutor{

	@Override
	public String executeConcreteTask(String s) {
		System.out.println("executing task A: to lowerCase");
		
		return s.toLowerCase();
	}

}
