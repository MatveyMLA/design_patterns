package tamplate_method;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		var hwf = new WriteHelloWorld();
		hwf.writeToFile();	
		
		var wf = new WriterFromKeyboard();
		
		wf.writeToFile();
	}

}
