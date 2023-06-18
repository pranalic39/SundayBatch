package MultiSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValues {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("C:\\Users\\PranaliChavan\\eclipse");
	WebElement beverage = driver.findElement(By.id("beverage"));
	
	Select s = new Select(beverage);
	System.out.println(beverage.isSelected());
	
	//Select option by index
	s.selectByIndex(0);
	Thread.sleep(3000);

	//Select option by value
	s.selectByValue("tea");
	Thread.sleep(3000);
	

	//Select option by visible text
	s.selectByVisibleText("milk");
	Thread.sleep(3000);
	
	}
}
