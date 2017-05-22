package utilities;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class driverClass {

	public static WebDriver driver;
	
	public static WebDriver driver_initialize(){
		
		
		
		System.setProperty("webdriver.chrome.driver", "////cifintdev001//CitrixNAMProfiles01//FolderRedir//rcheekati001//workspace1//NewProject//Drivers//chromedriver.exe");
		//Proxy pr=new Proxy();
		//pr.setHttpProxy("127.0.0.1:8080");
		//DesiredCapabilities dc= new DesiredCapabilities();
		//dc.setCapability(CapabilityType.PROXY, pr);
		driver=new ChromeDriver();
		
		return driver;
	}
	
}
