package tamplate_method;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class WriteFile {
	
	public void writeToFile() throws IOException {
		
		var file = getFileToWrite(); 
		
		var bytes = getStrToWrite().getBytes();
		
		Files.write(file, bytes);
		
		String read = Files.readAllLines(file).get(0);
		
		System.out.println(read);
	}
	
	protected abstract Path getFileToWrite();

	protected abstract String getStrToWrite();
	
	
}
