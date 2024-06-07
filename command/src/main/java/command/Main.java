package command;

import command.interfaces.IInvoker;

public class Main {

	public static void main(String[] args) {
		IInvoker client = new Client(new BasicPizza(new Cook()));
		client.execCommand();
		
		client.setCommand(new CustomPizza(new Cook(), "Pinapple", "Bakon"));
		client.execCommand();
	}

}
