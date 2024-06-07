package tamplate_method;

import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteHelloWorld extends WriteFile {

	private final String filepath = "src\\main\\resources\\file.txt";
	
	@Override
	protected Path getFileToWrite() {
		return Paths.get(filepath);
	}

	@Override
	protected String getStrToWrite() {
		return "Hello World";
	}

}
