package streamFiles.ReadFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
	public static void main(String[] args) throws IOException {

		// stream

		File file = new File("C:\\Users\\lenovo\\Desktop\\jmeter\\myText.txt");

		FileReader read = new FileReader(file);
		BufferedReader reader = new BufferedReader(read);

		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);

		}
		 reader.close();

		// String line = reader.readLine();
		// String line2 = reader.readLine();
		//
		// System.out.println(line);
		//
		// System.out.println(line2);

	}

}
