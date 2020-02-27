package programs;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("E:/Software Testing/Automation/SeliniumFrameWork/src/main/resources/Read.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String UserName = prop.getProperty("username");
		String Password = prop.getProperty("Password");
		String Subject = prop.getProperty("Subject");
		
		System.out.println(UserName);
		System.out.println(Password);
		System.out.println(Subject);

	}

}
