package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//need entire text to identify the element.
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Sell"));
		System.out.println("Element Identified");
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("xyz"));
		System.out.println("Element Identified");
		
	}

}
