package command;

import command.interfaces.ICommand;
import command.interfaces.IReceiver;

public abstract class BasicCommand implements ICommand {

	protected IReceiver receiver;

	public BasicCommand(IReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public boolean execute() {
		return receiver.process(getParams());
	}
}
