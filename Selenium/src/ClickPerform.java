import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickPerform {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.fb.com");
	
	Actions act = new Actions(driver);
	act.click().perform(); // build is inbuilt in perform.
	
	//or
	
	act.click().build().perform();
	
	//to click on web element
	
	
	
}
}
