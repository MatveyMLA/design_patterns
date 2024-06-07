package facade.facades;

import facade.Blai;
import facade.Deliver;
import facade.IBlai;
import facade.IDeliver;
import facade.IOrder;
import facade.IRegistration;
import facade.IStorage;
import facade.IUser;
import facade.Order;
import facade.Registration;
import facade.Storage;
import facade.User;

public class StorageFacade implements IFacade {

	
	private IBlai blai;
	private IDeliver deliver;
	private IStorage storage;
	private IOrder order;
	private IUser user;
	private IRegistration registration;
	
	public StorageFacade() {
		this.blai = new Blai();
		this.deliver = new Deliver();
		this.order = new Order();
		this.registration = new Registration();
		this.storage = new Storage();
		this.user = new User();
		
		
	}

	@Override
	public void getItem() {
		System.err.println("Getting Item:");
		this.order.order();
		this.registration.doRegistration();
		this.storage.store();
		this.deliver.deliver();
	}

	@Override
	public void utilize() {
		System.err.println("Utilizing Item:");
		this.storage.store();
		this.user.use();
		this.blai.doBlai();
	}

}
