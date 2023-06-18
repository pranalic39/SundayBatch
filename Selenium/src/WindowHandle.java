import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("WebDriver.Chrome.Driver", "./Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	System.out.println(driver.getWindowHandles());
	System.out.println(driver.getWindowHandle());
}
}
