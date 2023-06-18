package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationAlert {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("disable-notification");
	option.addArguments("incognito");
	
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://www.irctc.co.in/nget/train-search");
	
}
}
