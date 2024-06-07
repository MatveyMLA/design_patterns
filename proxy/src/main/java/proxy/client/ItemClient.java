package proxy.client;

import java.util.Date;

import proxy.model.Item;
import proxy.server.IServer;

public class ItemClient implements IItemClient {
	
	
	private IServer server;
	

	public ItemClient(IServer server) {
		this.server = server;
	}

	@Override
	public void processItem(Long id) {
		var item = server.getItem(id);
		
		System.out.println("Processing item....." + item.getName());
		
		server.cancelItem(item);
	}

	@Override
	public Item orderItem() {
		
		var item = server.addItem("item" + server.getCountOfEntities() + 1, "new item added: " + new Date());
		System.out.println("Ordre SUCCESFULLY ADDED: " + item);
		return item;
		
	}

	@Override
	public void utilizeItem(Item item) {
		server.cancelItem(item);
	}

}
