package pageFactories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class loginPage {
	

		@FindBy(id="log")
		public WebElement userName;
		
		@FindBy(id="pwd")
		public WebElement pwd;
		
		@FindBy(id="rememberme")
		public WebElement remember;
		
		@FindBy(id="login")
		public WebElement login;
	

}
