package proxy.client;

import proxy.model.Item;

public interface IItemClient {
	
	void processItem(Long id);
	
	Item orderItem();
	
	void utilizeItem(Item item);

}
