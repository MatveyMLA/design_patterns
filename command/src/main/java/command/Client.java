package command;

import command.interfaces.ICommand;
import command.interfaces.IInvoker;

public class Client implements IInvoker {

	private ICommand command;
	
	

	public Client() {
	}

	public Client(ICommand command) {
		this.command = command;
	}

	@Override
	public void setCommand(ICommand command) {
		this.command = command;
	}

	@Override
	public boolean execCommand() {
		return command.execute();
	}

}
