package docker;

import java.io.IOException;

import org.testng.annotations.Test;

public class setup_dockerGrid {
	
	@Test(priority =1)
	public void startDockerGrid() throws IOException, InterruptedException {
		// Start Docker Grid
		Runtime.getRuntime().exec("cmd /c start start_dockertest.bat");
		Thread.sleep(10000);
    }
	
	@Test(priority =2)
	public void stopDockerGrid() throws IOException, InterruptedException {
		// Start Docker Grid
		Runtime.getRuntime().exec("cmd /c start stop_dockerTest.bat");
		Thread.sleep(10000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
    }
	

}
