package streamFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVfile {

	public static void main(String[] args) throws IOException {
		// stream connectivity
		File file = new File("C:\\Users\\lenovo\\Desktop\\jmeter\\myText.csv");
		FileWriter fwriter = new FileWriter(file);
		// To append in the same file
		// FileWriter fwriter = new FileWriter(file, true)
		BufferedWriter writer = new BufferedWriter(fwriter);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {

				writer.write(j + ",");

			}
		}

	}
}
