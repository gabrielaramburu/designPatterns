package chaiofresponsability;

public class Tester {

	public static void main(String[] args) {
		TaskB tb = new TaskB(null);
		TaskA ta = new TaskA(tb);
		
		System.out.println(ta.execute("This is an example"));
	}

}
