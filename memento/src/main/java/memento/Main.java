package memento;

public class Main {

	public static void main(String[] args) {
		var care = new CareTaker();
		var redactor = new Redactor("Shalom");
		redactor.addToText("Pravoslavnie");
		care.addToHistory(redactor.save());
		redactor.addToText("Jerusalem");
		
		System.err.println(redactor.getText());
		
		redactor.restore(care.getLastState());
		
		System.out.println(redactor.getText());
		
	
		
		
	}

}
