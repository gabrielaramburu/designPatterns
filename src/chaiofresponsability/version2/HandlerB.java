package chaiofresponsability.version2;

 class TaskB extends ChainExecutorV2<String> {

	@Override
	public String executeConcreteTask(String inputValue) {
		System.out.println("executing task B: to upperrCase");

		return inputValue.toUpperCase();
	}

}
