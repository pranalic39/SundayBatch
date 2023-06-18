package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		
	
	System.setProperty("WebDriver.Chrome.Driver", "./Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/upload/");
	driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\PranaliChavan\\eclipse\\MultiSelect");
}
}