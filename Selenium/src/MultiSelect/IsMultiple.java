package MultiSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("");
	WebElement beverage = driver.findElement(By.id("beverage"));
	
	Select s = new Select(beverage);
	
	
	System.out.println(beverage.isSelected());
	
	
}
}
