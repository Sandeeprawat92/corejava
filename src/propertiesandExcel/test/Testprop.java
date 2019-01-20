package propertiesandExcel.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testprop {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\propertiesandExcel\\object.properties");
		prop.load(fis);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("course"));
		System.out.println(System.getProperty("user.dir"));
	}

}
