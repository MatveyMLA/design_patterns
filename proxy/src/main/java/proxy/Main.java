package proxy;

import proxy.client.IItemClient;
import proxy.client.ItemClient;
import proxy.hbrnt_util.HibernateUtil;
import proxy.model.Item;
import proxy.server.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		initH2();
		processItems();
	}

	private static void processItems() {
		IItemClient client = new ItemClient(Server.getInstance());
		System.err.println("------client------");
		Item item = client.orderItem();
		client.processItem(1l);
		client.utilizeItem(item);
		
		System.err.println("------client PROXY------");
		CacheProxyServer proxyServer = new CacheProxyServer(Server.getInstance());
		IItemClient clientProxy = new ItemClient(proxyServer);
		
		System.out.println(proxyServer.getAmountOfEntitiesInCache());
		System.out.println(proxyServer.getCountOfEntities());
		System.out.println(proxyServer.getItems());
		
		
		Item pItem = clientProxy.orderItem();
		clientProxy.processItem(2l);
		clientProxy.processItem(3l);
		clientProxy.utilizeItem(pItem);
		
		System.out.println(proxyServer.getAmountOfEntitiesInCache());
		System.out.println(proxyServer.getCountOfEntities());
		System.out.println(proxyServer.getItems());
	}

	private static void initH2() {
		var list = new ArrayList<Item>();
		Collections.addAll(list,new Item("ITEM 0", "Desc 0"), 
				new Item("ITEM 1", "Desc 1"), 
				new Item("ITEM 2", "Desc 2"), 
				new Item("ITEM 3", "Desc 3"));
		
		Transaction tr = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			tr = session.beginTransaction();
			list.forEach(item -> session.persist(item));
			
			tr.commit();
			session.close();

		} catch (Exception e) {
			if (Objects.nonNull(tr)) {
				tr.rollback();
			}
			e.printStackTrace();
		}
	}

}
