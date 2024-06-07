package command.interfaces;

import java.util.List;

public interface IReceiver {
	boolean process(List<String> params);
}
