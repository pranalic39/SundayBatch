package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//before entering user name and password
		WebElement submit = driver.findElement(By.id("u_0_5_UQ"));
		System.out.println(submit.isEnabled());
		
		//after entering user name and password
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("afdsfs");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("fafasfd");
		Thread.sleep(3000);
		
		System.out.println(submit.isEnabled());
		
	}

}
