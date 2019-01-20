package streamFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WritetextFile {

	public static void main(String[] args) throws IOException {
		// stream connectivity
		File file = new File("C:\\Users\\lenovo\\Desktop\\jmeter\\myText.txt");
		FileWriter fwriter = new FileWriter(file);
		// To append in the sama file
		// FileWriter fwriter = new FileWriter(file, true)
		BufferedWriter writer = new BufferedWriter(fwriter);

		// for(int i =0; i<4; i++){
		// for(int j=0; j<3; j++){
		//
		// writer.write(j + ",");
		//
		// }
		// }

		// writing inside
		// the file
		writer.write("My first line");
		writer.newLine();
		writer.write("USA");
		writer.newLine();
		writer.write("Automation testing training");

		// close the stream.

		writer.close();
		System.out.println("File created ");
	}

}
