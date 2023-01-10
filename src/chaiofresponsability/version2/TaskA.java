package chaiofresponsability.version2;

 class TaskA extends ChainExecutorV2<String> {

	@Override
	public String executeConcreteTask(String inputValue) {
		System.out.println("executing task A: to lowerCase");

		return inputValue.toLowerCase();
	}

}
