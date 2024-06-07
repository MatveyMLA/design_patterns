package proxy.server;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import proxy.model.Item;

public class CacheProxyServer implements IServer {
	
	private IServer server;
	private HashMap<Long, Item> cache;

	public CacheProxyServer(IServer server) {
		System.out.println(this.getClass().getName());
		this.server = server;
		this.cache = new HashMap<Long, Item>();
	}

	@Override
	public Item getItem(long id) {
		System.out.println(this.getClass().getName());
		if(cache.containsKey(id)) {
			return cache.get(id);
		}
		var item = server.getItem(id);
		cache.put(id, item);
		
		return item;
	}

	@Override
	public List<Item> getItems() {
		System.out.println(this.getClass().getName());
		if(getCountOfEntities() == getAmountOfEntitiesInCache()) {
			return cache.values().stream().toList();
		}
		var items = server.getItems();
		items.stream().collect(Collectors.toMap(item -> item.getId(), item -> item));
		
		return items;
	}

	@Override
	public void cancelItem(Item item) {
		System.out.println(this.getClass().getName());
		cache.remove(item);
		server.cancelItem(item);
	}
	
	@Override
	public Item addItem(String name, String desc) {
		System.out.println(this.getClass().getName());
		var item = server.addItem(name, desc);
		cache.put(item.getId(), item);
		return item;
	}

	public void clearCache() {
		System.out.println(this.getClass().getName());
		this.cache.clear();
	}
	
	public int getAmountOfEntitiesInCache() {
		System.out.println(this.getClass().getName());
		return this.cache.size();
	}

	@Override
	public long getCountOfEntities() {
		System.out.println(this.getClass().getName());
		return this.server.getCountOfEntities();
	}
}
