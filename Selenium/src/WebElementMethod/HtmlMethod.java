package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://fb.com");
	
	WebElement loginbtn= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	
	//to fetch tagname
	System.out.println(loginbtn.getTagName());
	
	//to fetch text
	System.out.println(loginbtn.getText());
	
	//to fetch attribute
	System.out.println(loginbtn.getAttribute("id"));
	
}
}
