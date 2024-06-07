package adapter;
//ADAPTER
public class Service implements IService {
	
	private Shirut shirut;
	
	public Service(String serviceName, String nameOfSecondService) {
		this.shirut = new Shirut(serviceName, nameOfSecondService);
	}

	@Override
	public void doThis() {
		this.shirut.taseEtZe();
	}

	@Override
	public void doThisTo() {
		this.shirut.taseEtZeGam();
	}

}
