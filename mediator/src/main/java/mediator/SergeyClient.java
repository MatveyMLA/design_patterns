package mediator;

public class SergeyClient implements IClient {

	private String name;
	
	public SergeyClient(String name) {
		this.name = name;
	}

	@Override
	public void notifyClient(String info) {
		System.out.println(this.name + " Notified " + info);
	}

	@Override
	public String getName() {
		return this.name;
	}

}
