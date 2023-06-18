package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("email"));
		System.out.println("Element Identified");
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("xyz"));
		System.out.println("Element Identified");
		
	}

}
