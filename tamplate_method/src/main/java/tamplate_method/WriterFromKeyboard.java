package tamplate_method;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriterFromKeyboard extends WriteFile {

	private final String filepath = "src\\main\\resources\\keyboard_string.txt";

	@Override
	protected Path getFileToWrite() {
		return Paths.get(filepath);
	}

	@Override
	protected String getStrToWrite() {
		var myObj = new Scanner(System.in);
		System.out.println("Enter text you want to write to the file: ");

		var text = "That is what you wrote to the File: " + myObj.nextLine();
		return text;
	}

}
