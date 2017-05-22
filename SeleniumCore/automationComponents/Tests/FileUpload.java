package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import utilities.driverClass;

public class FileUpload extends driverClass {

	@Before
	public void setUp() throws Exception {
		driverClass.driver_initialize();
		driver.get("http://the-internet.herokuapp.com/upload");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.cssSelector("#file-upload")).sendKeys("\\\\cifintdev001\\CitrixNAMProfiles01\\FolderRedir\\rcheekati001\\workspace1\\NewProject\\Input\\testData.xlsx");
		driver.findElement(By.cssSelector("#file-submit")).submit();
	}

}
