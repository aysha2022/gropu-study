package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Shared {
	public void click() {
		System.out.println("element click");
	}


	public static Properties readPropfile(String path) throws IOException {
		FileInputStream fi= new FileInputStream(new File(path));//buffering the file path/ready the file
		Properties prop = new Properties();
		prop.load(fi);//load propertise file
		return prop ;		
	}
	
}
