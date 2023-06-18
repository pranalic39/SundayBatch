package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) {
	System.getProperty("webdriver.chrome.driver", "./chormedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.get("http://google.com/");
	driver.get("https://gmail.com/");
	
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	
	driver.navigate().to("https://gmail.com/");
	//manage methods
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.manage().window().fullscreen();
	
	
	
	}
}
