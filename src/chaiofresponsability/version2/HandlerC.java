package chaiofresponsability.version2;

public class TaskC extends ChainExecutorV2<Integer>{

	@Override
	public Integer executeConcreteTask(Integer inputValue) {
		System.out.println("multiplying by 2");
		return Math.multiplyExact(inputValue, 2);
	}

}
