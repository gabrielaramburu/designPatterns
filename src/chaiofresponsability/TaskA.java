package chaiofresponsability;

public class TaskA extends ChainExecutor{

	

	public TaskA(ChainExecutor succesor) {
		super(succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeConcreteTask(String s) {
		System.out.println("executing task A: to lowerCase");
		
		return s.toLowerCase();
	}

}
