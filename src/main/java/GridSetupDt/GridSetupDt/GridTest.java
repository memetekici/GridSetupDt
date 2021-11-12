package GridSetupDt.GridSetupDt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
	public static void main(String[] args) throws MalformedURLException {
		
		//Define Desired capabilities
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.ANY);
		cap.setBrowserName("chrome");
		
		//Merge desired capabilities
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		//Create String variable to store hub url
		String hubUrl = "http://192.168.0.2:4444/wd/hub";
		
		//Create a driver object
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
		
		//Type test codes
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
