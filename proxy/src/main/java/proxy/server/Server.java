package proxy.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.Transaction;

import proxy.hbrnt_util.HibernateUtil;
import proxy.model.Item;

public class Server implements IServer {
	
	private static Server instance = new Server();
	
	public static IServer getInstance() {
		return instance;
	}

	private Server() {}
	
	@Override
	public Item getItem(long id) {
		System.out.println(this.getClass().getName());
		Item item = null;

		try (var session = HibernateUtil.getSessionFactory().openSession()) {

			item = session.createQuery(String.format("from Item where id = %d", id), Item.class).getSingleResult();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return item;

	}

	@Override
	public void cancelItem(Item item) {
		System.out.println(this.getClass().getName());
		try (var session = HibernateUtil.getSessionFactory().openSession()) {

			session.remove(item);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Item> getItems() {
		System.out.println(this.getClass().getName());
		var list = new ArrayList<Item>();

		try (var session = HibernateUtil.getSessionFactory().openSession()) {

			list.addAll(session.createQuery("from Item", Item.class).list());
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public long getCountOfEntities() {
//		System.out.println(this.getClass().getName());
		long count = -1;
		try (var session = HibernateUtil.getSessionFactory().openSession()) {

			Long id = session.createNativeQuery("select count(*) from Item", Long.class).uniqueResult();
			session.close();
			return id;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public Item addItem(String name, String desc) {
		System.out.println(this.getClass().getName());
		Transaction tr = null;
		Item item = null;
		try (var session = HibernateUtil.getSessionFactory().openSession()) {

			tr = session.beginTransaction();
			Long id = (Long) session.save(new Item(name, desc));
			tr.commit();
			
			item = getItem(id);

			session.close();
		} catch (Exception e) {
			if (Objects.nonNull(tr)) {
				tr.rollback();
			}
			e.printStackTrace();
		}
		
		return item;
	}

}
