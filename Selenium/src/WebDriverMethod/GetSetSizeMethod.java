package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetSizeMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.fb.com");
			System.out.println(driver.manage().window().getSize());
			
			Dimension d = new Dimension(2000,388);
			driver.manage().window().setSize(d);
}
}
