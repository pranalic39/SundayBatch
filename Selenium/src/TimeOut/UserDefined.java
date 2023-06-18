package TimeOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDefined {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	
	for(int i=0; i<=100; i++)
	{
		try {
			driver.findElement(By.name("username")).sendKeys("Hello");
			System.out.println(i);
			break;
		}
		catch (Exception e)
		{
		}
		}
	}//main
	
}//class

