package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class propertiesFile {
	
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("src/test/java/Config/config.properties");
		properties.load(fileInputStream);
		fileInputStream.close();
		
		//to get the values from prop
		
		String age = properties.getProperty("age");
		String name =properties.getProperty("name");
		String email =properties.getProperty("email");
		
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);		
		
		//capture the properties
		Set<String> keys =properties.stringPropertyNames();
		System.out.println(keys);
		
		//capture the values
		
		Collection<Object> values=properties.values();
		System.out.println(values);
		
		for (String key : properties.stringPropertyNames()) {
			System.out.println("Key: " + key + ", Value: " + properties.getProperty(key));
		
		}
		
	}
	
}
