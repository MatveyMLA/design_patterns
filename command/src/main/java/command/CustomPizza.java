package command;

import java.util.List;

import com.google.common.collect.Lists;

import command.interfaces.IReceiver;

public class CustomPizza extends BasicCommand {

	private String[] ingridients;

	public CustomPizza(IReceiver receiver, String... ingridients) {
		super(receiver);
		this.ingridients = ingridients;
	}
	
	@Override
	public List<String> getParams() {
		return Lists.newArrayList(ingridients);
	}

}
