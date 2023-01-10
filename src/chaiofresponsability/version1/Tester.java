package chaiofresponsability.version1;

public class Tester {

	public static void main(String[] args) {
		TaskB tb = new TaskB();
		TaskA ta = new TaskA();
		
		tb.setSuccessor(ta);
		System.out.println(tb.execute("This is an example"));
		
//		ta.setSuccessor(tb);
//		System.out.println(ta.execute("This is an example"));
	}

}
