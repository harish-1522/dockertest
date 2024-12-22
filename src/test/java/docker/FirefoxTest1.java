package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest1 {
	
	
	@Test
	
	public void test1() throws MalformedURLException, InterruptedException {
		
		// Specify the Docker container URL
        String gridUrl = "http://localhost:4444/wd/hub";
			
        // Set up Chrome WebDriver
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setBrowserName("chrome");
        capabilities.setBrowserName("firefox");
               
        // Create a RemoteWebDriver instance using Docker URL and Chrome capabilities
        RemoteWebDriver driver = new RemoteWebDriver(capabilities);
        
        // Perform actions on the browser using WebDriver API
        driver.get("https://www.google.com");
        System.out.println("Page Title is: " + driver.getTitle());
        Thread.sleep(1000);
        driver.quit();;
	}
		
}
