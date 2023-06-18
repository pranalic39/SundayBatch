package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com");
	List<WebElement> allradiobuttons = driver.findElements(By.xpath("//input[@type=radio]"));
	
	//using for loop
	for (int i=0; i<allradiobuttons.size();i++)
	{
		allradiobuttons.get(i).click();
		Thread.sleep(1000);
	}
	
}
}
