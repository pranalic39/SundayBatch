package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username") 	WebElement username; 
	@FindBy(name= "pwd") WebElement password;
	@FindBy(xpath="//div[text()='Login']") WebElement loginbtn;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
