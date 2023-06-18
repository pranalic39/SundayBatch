package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdrver.chrome.driver", "./chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://text-compare.com/");
	Actions act = new Actions(driver);
	
	driver.findElement(By.id("inputText1")).sendKeys("Welcome to new Parliament");
	Thread.sleep(2000);

	act.keyDown(Keys.CONTROL).keyDown("a").keyUp("a").keyUp(Keys.CONTROL);
	Thread.sleep(2000);
	
	act.keyDown(Keys.CONTROL).keyDown("c").keyUp("c").keyUp(Keys.CONTROL);
	Thread.sleep(2000);
	
	act.keyDown(Keys.CONTROL).keyDown("v").keyUp("v").keyUp(Keys.CONTROL);
	Thread.sleep(2000);
	
	
}
}
