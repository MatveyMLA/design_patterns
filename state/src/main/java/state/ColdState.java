package state;

public class ColdState implements IOwenState {

	@Override
	public void bake() throws Exception {
		throw new Exception("IT HASN'T HEATEN YET! ");
	}

}
