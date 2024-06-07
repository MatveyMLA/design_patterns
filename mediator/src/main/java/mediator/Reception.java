	package mediator;

public class Reception implements IMediator {

	@Override
	public void inform(ServiceType serviceType, IClient client) {
		IService service = serviceFabric(serviceType);
		service.serve(client.getName());
		client.notifyClient(" Served ");
	}

	private IService serviceFabric(ServiceType service) {
		return switch (service) {
		case TAXI -> TaxiService.getInstance();
		case FLOWER -> FlowerService.getInstance();
		case HOUSEHOLD -> HouseHoldService.getInstance();
		default -> throw new IllegalArgumentException("Unexpected value: " + service);
		};
	}

}
