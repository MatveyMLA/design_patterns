package state;

public class Owen implements IOwen {
	
	private static Owen instance = new Owen();
	
	private IOwenState state;
	 
	private Owen() {
		this.state = new ColdState();
	}
	
	public static Owen getInstance() {
		return instance;
	}
	
	@Override
	public void bake() throws Exception {
		this.state.bake();
	}
	
	public void setState(IOwenState state) {
		this.state = state;
	}
}
