package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareTitleNUrl {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//to check the whether title is same or not
	String actualtitle = driver.getTitle();
	String expectedtitle = "Facebook – log in or sign up";
	
	if (actualtitle.equals(expectedtitle))
		System.out.println("Pass");
	else
		System.out.println("Fail");
	
	//to check the whether title is same or not
	String actualurl = driver.getCurrentUrl();
	String expectedurl = "https://www.facebook.com/";
	
	if(actualurl.equals(expectedurl))
		System.out.println("Pass");
	else
		System.out.println("Fail");
	
	
}
}
