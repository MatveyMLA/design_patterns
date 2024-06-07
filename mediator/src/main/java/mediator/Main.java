package mediator;

public class Main {

	public static void main(String[] args) {
		IMediator reception = new Reception();
		
		IClient client = new SergeyClient("Sergey");
		IClient clientV = new VanyaClient("Vanya");
		
		reception.inform(ServiceType.TAXI, client);
		reception.inform(ServiceType.FLOWER, clientV);
	}

}
