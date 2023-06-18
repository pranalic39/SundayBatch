package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		//before entering user name and password
		WebElement submit = driver.findElement(By.name("login"));
		System.out.println(submit.isEnabled());
		
		//after entering user name and password
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("afdsfs");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("fafasfd");
		
		System.out.println(submit.isEnabled());
		System.out.println(submit.isSelected());
	}

}
