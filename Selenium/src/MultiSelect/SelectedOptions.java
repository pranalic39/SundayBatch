package MultiSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedOptions {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\PranaliChavan\\eclipse");
	
	WebElement bevarages = driver.findElement(By.id("beverage"));
	
	Select s = new Select (bevarages);
	List<WebElement> selectedoptions = s.getAllSelectedOptions();
	s.selectByIndex(0);
	s.selectByIndex(4);
	
	for(WebElement options:selectedoptions)
	{
		System.out.println(options.getText());
	}
	//to fetch selected options
	System.out.println(s.getFirstSelectedOption());
	
	driver.close();
	
	
}//Main
}//class
