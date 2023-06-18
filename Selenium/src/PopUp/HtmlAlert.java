package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlAlert {
public static void main(String[] args) {
	System.setProperty("WebDriver.Chrome.Driver", "./Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()=✕]")).click();
	
	
}
}
