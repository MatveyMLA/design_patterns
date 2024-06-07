package command;

import static org.apache.commons.collections4.CollectionUtils.isNotEmpty;

import java.util.List;

import command.interfaces.IReceiver;

public class Cook implements IReceiver {

	@Override
	public boolean process(List<String> params) {
		
		if(isNotEmpty(params)) {
			System.out.println("Cooking pizza with:");
			params.forEach(System.out::println);
			return true;
		}
		return false;
	}

}
