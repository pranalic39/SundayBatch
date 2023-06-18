package WebDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetPositionMethod {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https:/www.fb.com");
	System.out.println(driver.manage().window().getPosition());
	
	Point p = new Point(200,300);
	driver.manage().window().setPosition(p);
	
	
}
}
