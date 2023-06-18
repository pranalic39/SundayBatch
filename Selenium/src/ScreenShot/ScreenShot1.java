package ScreenShot;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1
{public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//screenshot of element
	driver.get("https://fb.com");
	WebElement 
	img = driver.findElement(By.className("fb_logo _8ilh img"));
	
	//return type string
	System.out.println(img.getScreenshotAs(OutputType.BASE64));
	//return type number
	System.out.println(img.getScreenshotAs(OutputType.BYTES));
	//return type file > File gets deleted once execution done means file created in temp storage.
	System.out.println(img.getScreenshotAs(OutputType.FILE));
	
	
	//saving screenshot in project > Overwriting problem
	File destination = new File ("./screenshot.png"); // name of the file and only png is acceptable
	File source = (img.getScreenshotAs(OutputType.FILE));
	FileHandler.copy(source, destination);
	
	// to store every screenshot
	
}

}
