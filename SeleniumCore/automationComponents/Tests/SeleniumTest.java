package Tests;

import org.testng.annotations.Test;

import pageFactories.loginPage;
import utilities.constant;
import utilities.driverClass;
import utilities.excelUtil;

import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class SeleniumTest extends driverClass {
	
	public static Logger logr=Logger.getLogger("TestLogger");
	public static Logger logr_1=Logger.getLogger("second_logr");
  @Test
  public void login() {
	loginPage lgpage=PageFactory.initElements(driver, loginPage.class);  
	String usrn=excelUtil.getCellData(1, 1); 
	lgpage.userName.sendKeys(usrn);
	logr.info("This is a test message");
	lgpage.pwd.sendKeys(excelUtil.getCellData(1, 2));
	logr_1.info("Hi Password data is passed");
	lgpage.remember.click();
	logr_1.fatal("This is fatal message");
	lgpage.login.submit();
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  driverClass.driver_initialize();
	  driver.get(constant.URL);
	  driver.findElement(By.xpath(""));
	  PropertyConfigurator.configure("log4j.properties");
	  excelUtil.createExcelFile(constant.filePath, "Data");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

}
