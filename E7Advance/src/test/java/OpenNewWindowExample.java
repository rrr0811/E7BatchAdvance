
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindowExample {
	public static void main(String[] args) {
		// Instantiate a WebDriver object 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open the website
		driver.get("https://parivahan.gov.in/parivahan/");
		String parentWindowId=driver.getWindowHandle();
		
		//Opening new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");

		// Get all window handles
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		// Switch to the new window
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		
		// Now you're in the new window, to open a new Tab
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open();");
	}
}
