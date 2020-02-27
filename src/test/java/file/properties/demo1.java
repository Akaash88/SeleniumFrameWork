package file.properties;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

 class demo1{
	static Properties prop = new Properties();
	
	public static void loadF() {

		
		try {
			InputStream input = new FileInputStream("E:\\Software Testing\\Automation\\SeliniumFrameWork\\src\\test\\java\\Trial\\config.properties");
			prop.load(input);
			Demo1_test.setBrowser(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void writeF() {
		OutputStream output;
		try {
			output = new FileOutputStream("E:\\Software Testing\\Automation\\SeliniumFrameWork\\src\\test\\java\\Trial\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.setProperty("test","pass565");
			prop.store(output, "completd");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
	
	
	
	}
	
	




