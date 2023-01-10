package chaiofresponsability;

public class TaskB extends ChainExecutor{

	public TaskB(ChainExecutor succesor) {
		super(succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeConcreteTask(String s) {
		System.out.println("Excecuting task B: upperCase");
		return s.toUpperCase();
	}

}
