package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	System.setProperty("Webdrver.chrome.driver", "./chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://jqueryui.com/droppable");
	driver.switchTo().frame(0);
	
	WebElement source = driver.findElement(By.id(null));
	 WebElement destination = driver.findElement(By.id(null));
	 
	 Actions act = new Actions(driver);
	 act.dragAndDrop(source, destination).perform();
	 
	 // drag and drop to cordinates from source
	 
	 act.dragAndDropBy(source, 10, 100).perform();
	 
	 //using click and hold method
	 act.click(source).moveToElement(destination).release().perform();
	 
	 driver.close();
	 
}
}
