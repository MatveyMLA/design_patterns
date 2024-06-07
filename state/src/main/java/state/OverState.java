package state;

public class OverState implements IOwenState {

	@Override
	public void bake() throws Exception {
		throw new Exception("HMMM, IT WILL BURN IT! ");
	}

}
