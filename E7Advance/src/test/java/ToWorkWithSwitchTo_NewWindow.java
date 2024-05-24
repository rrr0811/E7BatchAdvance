import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSwitchTo_NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parentWinId = driver.getWindowHandle();
		System.out.println(parentWinId);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.skillrary.com/");
		driver.switchTo().window(parentWinId).manage().window().minimize();
		Set<String> allWinIds = driver.getWindowHandles();
		allWinIds.remove(parentWinId);
		List<String> l=new ArrayList<String>(allWinIds);
		System.out.println(l);
		driver.switchTo().window(l.get(0));
		driver.switchTo().newWindow(WindowType.TAB);
	}
}
