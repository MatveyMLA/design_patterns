package command;

import java.util.List;

import com.google.common.collect.Lists;

import command.interfaces.IReceiver;

public class BasicPizza extends BasicCommand{
	
	public BasicPizza(IReceiver receiver) {
		super(receiver);
	}

	@Override
	public List<String> getParams() {
		return Lists.newArrayList("Pizza Souce", "Cheese");
	}

}
