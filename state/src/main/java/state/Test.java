package state;

public interface Test {
	default void ps() {
		System.err.println("Default");
	}
	
	public static void main(String[] args) {
		Test tst = new Test() {};
		
		tst.ps();
		
		
	}
}
