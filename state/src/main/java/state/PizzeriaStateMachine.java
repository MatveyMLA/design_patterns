package state;

public class PizzeriaStateMachine {
	public void turnOnOwen(){
		Owen.getInstance().setState(new HotState());
	}
	
	public void turnOffOwen(){
		Owen.getInstance().setState(new ColdState());
	}
	
	public void forgotToTurnHeatter(){
		Owen.getInstance().setState(new OverState());
	}
	
	public void getPizza() throws Exception {
		Owen.getInstance().bake();
	}
}
