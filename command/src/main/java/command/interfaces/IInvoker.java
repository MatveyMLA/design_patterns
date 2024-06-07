package command.interfaces;

public interface IInvoker {
	void setCommand(ICommand command);
	boolean execCommand();
}
