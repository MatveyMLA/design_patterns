package chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		
		var helpType = HelpType.getByNum(Integer.valueOf(args[0]));
		
		System.out.println("Call " + helpType);
		
		Handler.handle(helpType);
		
	}

}
