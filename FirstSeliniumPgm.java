import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeliniumPgm {

	public static void main(String[] args) {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		// what is the difference between driver.get and driver.navigate().to
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The title is -- " + title);
		String URL = driver.getCurrentUrl();
		System.out.println("The URL is --- " + URL);
		String psource = driver.getPageSource();
		System.out.println("The page source is --- " + psource);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();// used to forcefully close the site when using the old method
		//driver.quit();// difference between quit and close

	}
}