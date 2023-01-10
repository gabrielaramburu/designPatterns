package chaiofresponsability.version2;

public class TesterV2 {

	public static void main(String[] args) {
		ChainExecutorV2<String> taskA = new TaskA();
		ChainExecutorV2<String> taskB = new TaskB();
		
		taskA.setSuccessor(taskB);
		System.out.println(taskA.executeChain("This is a test"));

	}

}
