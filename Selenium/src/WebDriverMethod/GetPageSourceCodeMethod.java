package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCodeMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getPageSource());
	
}
}
