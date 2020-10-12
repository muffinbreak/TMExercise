package configuration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import pages.BaseTest;

public class PropertiesFile {

	static Properties prop = new Properties();
	static InputStream input; 
	static String projectPath = System.getProperty("user.dir");
	static String browser = null;
	static String URL = null;
	
	public static void getProperties() {
		
		try {						
			input = new FileInputStream(projectPath + "/src/test/java/configuration/config.properties");
			prop.load(input);

			browser = prop.getProperty("browser");
	
			BaseTest.browserName = browser;

		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	
	public static void getURL() {
		try {						
			input = new FileInputStream(projectPath + "/src/test/java/configuration/config.properties");

			prop.load(input);

			URL = prop.getProperty("url");
	
			BaseTest.url = URL;

		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}	
	}
	

	public static void setProperties() {

		try {
			OutputStream output = new FileOutputStream(projectPath + "/src/test/java/configuration/config.properties");
			
			prop.setProperty("browser", "firefox");
			
			prop.store(output, null);
			browser = prop.getProperty("browser");
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
