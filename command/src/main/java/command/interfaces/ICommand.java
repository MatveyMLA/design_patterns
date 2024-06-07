package command.interfaces;

import java.util.List;

public interface ICommand {
	boolean execute();
	List<String> getParams();
}
