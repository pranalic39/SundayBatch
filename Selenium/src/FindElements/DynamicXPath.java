package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromeDriver", "./chrome.driver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//by attribute
		driver.findElement(By.ByXPath())
		
}
}