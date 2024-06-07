package proxy.server;

import java.util.List;

import proxy.model.Item;

public interface IServer {
	
	Item getItem(long id);
	
	List<Item> getItems();
	
	void cancelItem(Item item);
	
	long getCountOfEntities();

	Item addItem(String name, String desc);

}
