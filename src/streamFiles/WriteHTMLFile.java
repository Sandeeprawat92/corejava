package streamFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteHTMLFile {
	public static void main(String[] args) throws IOException {
		// stream connectivity
		File file = new File("C:\\Users\\lenovo\\Desktop\\jmeter\\myText.html");
		FileWriter fwriter = new FileWriter(file);
		// To append in the sama file
		// FileWriter fwriter = new FileWriter(file, true)
		BufferedWriter writer = new BufferedWriter(fwriter);

		writer.write("<html> <body> <title>Training selenium</title> </body> </html> ");
		System.out.println("File created");

	}
}
