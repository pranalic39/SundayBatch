package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {
public static void main(String[] args) {


	System.setProperty("Webdrver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	
	Alert alt = driver.switchTo().alert();	
	System.out.println(alt.getText());
	alt.accept();
	
	//dismiss on ok button
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.dismiss();
	
	
	
	
	// to fetch the text and dismiss
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	
	Alert alt1 = driver.switchTo().alert();
	
	System.out.println(alt1.getText());
	alt1.dismiss();
	

	
	// to fetch the text and send keys
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	
	Alert alt2 = driver.switchTo().alert();
	
	System.out.println(alt2.getText());
	alt2.sendKeys("Hello world");
	alt2.dismiss();
	
}
}
