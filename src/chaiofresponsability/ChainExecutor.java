package chaiofresponsability;

public abstract class ChainExecutor {
	private ChainExecutor successor;
	
	public void setSuccessor(ChainExecutor successor) {
		this.successor = successor; 
	}
	
	public String execute(String s) {
		String result = this.executeConcreteTask(s);
		if (successor != null) {
			return successor.execute(result);
		} else return result;
	}
	
	public abstract String executeConcreteTask(String s);
	
	
}
