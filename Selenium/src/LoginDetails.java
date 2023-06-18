import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDetails {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Chrome.Driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.name("pwd"));
	WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Login']"));
	
	username.sendKeys("fadfsfd");
	password.sendKeys("fdjkalf");
	loginbutton.click();
	
	Thread.sleep(3000);
	
	username.sendKeys("admin");
	password.sendKeys("manager");
	loginbutton.click();
	
	//here we get error of element  not found because of page refresh selenium is unable to find previously saved element
	
}
}
