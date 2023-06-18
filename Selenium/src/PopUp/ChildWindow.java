package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("WebDriver.Chrome.Driver", "./Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	driver.findElement(By.xpath("//img(@alt='Literature & Fiction')")).click();
	
	driver.findElement(By.xpath("//img(@alt='Literature & Fiction')")).click();
			
	Set<String> allwindow = driver.getWindowHandles();
	
	Thread.sleep(2000);
	for(String singlewindow:allwindow)
		driver.switchTo().window(singlewindow);
	driver.close();

}
}
