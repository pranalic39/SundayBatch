package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//using date in file name and replace : from date then use it
		
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://fb.com");
		WebElement img = driver.findElement(By.className("fb_logo _8ilh img"));
		
		Date date =  new Date();
		String today = date.toString().replace(";", "-");
		File source2 = (img.getScreenshotAs(OutputType.FILE));
		File destination2 = new File ("./screenshot"+today+".png");
		FileHandler.copy(source2, destination2);
		

}
}