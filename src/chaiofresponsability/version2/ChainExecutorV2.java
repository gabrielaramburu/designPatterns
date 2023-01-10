package chaiofresponsability.version2;

public abstract class ChainExecutorV2<T> {
	private ChainExecutorV2<T> successor;
	
	public void setSuccessor(ChainExecutorV2<T> successor) {
		this.successor = successor;
	}
	
	public T executeChain(T inputValue) {
		T result = this.executeConcreteTask(inputValue);
		if (this.successor != null) {
			return this.successor.executeChain(result);
		} else return result;
	}
	
	
	public abstract T executeConcreteTask(T inputValue);
}
