package MultiSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTextFromList {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\PranaliChavan\\eclipse");
	
	WebElement bevarages = driver.findElement(By.id("beverage"));
	
	Select s = new Select (bevarages);
	List<WebElement> alloptions = s.getOptions();
	
	//get all selected elements with using for each loop
	for(WebElement options:alloptions)
	{
		System.out.println(options.getText());
	}
	
	//get all selected options without using for loop
	
	System.out.println(s.getWrappedElement().getText());
}//Main
}//class
