package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsForEach {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize()
	
	driver.get("https://www.google.com");
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	
	//to fetch elements using for each loop
	
	for(WebElement link:alllinks)
	{
		System.out.println(link.getText());
	}
}
}
