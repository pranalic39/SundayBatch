package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot4 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		//Taking screenshot of entire screen
		
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://fb.com");
		
		//typecasing between siblings
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//covert : to - as it is not accepting in file name
		Date date =  new Date();
		String today = date.toString().replace(";", "-");
		
		File source2 = ts.getScreenshotAs(OutputType.FILE);
		File destination2 = new File ("./screenshot"+today+".png");
		FileHandler.copy(source2, destination2);
		

}

}
