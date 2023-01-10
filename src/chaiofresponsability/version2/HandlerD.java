package chaiofresponsability.version2;

public class TaskD extends ChainExecutorV2<Integer>{

	@Override
	public Integer executeConcreteTask(Integer inputValue) {
		System.out.println("substracting  2");
		return Math.subtractExact(inputValue, 2);
	}

}
