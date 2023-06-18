package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKey {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		WebElement password = driver.findElement(By.name("password"));
		

		Actions act = new Actions(driver);

		//to send data to element without clicking on it
		act.sendKeys("hello");
		
		Thread.sleep(3000);
		//to send data to web element
		act.sendKeys(password, "hello").perform();
		
		//to perform right click
		act.contextClick().perform();
		
		//right click on argument > it will perform right click on specified web element.
		act.contextClick(password);
		
		
	}
	}

}
