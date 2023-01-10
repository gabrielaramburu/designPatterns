package chaiofresponsability;

public abstract class ChainExecutor {
	private ChainExecutor succesor;
	
	public ChainExecutor(ChainExecutor succesor) {
		this.succesor = succesor;
	}
	
	public String execute(String s) {
		String result = this.executeConcreteTask(s);
		if (succesor != null) {
			return succesor.execute(result);
		} else return result;
	}
	
	public abstract String executeConcreteTask(String s);
	
	
}
