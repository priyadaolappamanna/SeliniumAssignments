import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorssel {

	public static void main(String[] args)  {
		//WebDriver driver=WebDriverManager.chromedriver().create();
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.navigate().to("https://www.saucedemo.com");
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("user-name")).click();
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).submit();
		driver.findElement(By.className("bm-burger-button")).click();
		driver.findElement(By.id("inventory_sidebar_link")).click();
		
		//Thread.sleep(5000);
		

	}


}
