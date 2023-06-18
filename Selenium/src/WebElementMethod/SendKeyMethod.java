package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement password = driver.findElement(By.id("pass"));
		Thread.sleep(3000);
		
		//highlight the element
		password.click();
		
		//clear method element
		password.clear();
		
		//sendKeys method
		password.sendKeys("Test@123");
	}

}
