package mediator;

public interface IMediator {
	
	void inform(ServiceType serviceType, IClient client);
}
