import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to(("https://www.saucedemo.com/"));
		driver.manage().window().maximize();;
		driver.findElement(By.xpath("//input[@id = 'user-name']")).click();
		driver.findElement(By.cssSelector("input[placeholder = 'Username']")).sendKeys("standard_user");
		//Thread.sleep(5000);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		//Thread.sleep(5000);
		List<WebElement> Options = driver.findElements(By.tagName("img"));
		//Thread.sleep(5000);
		int count = Options.size();
		System.out.println("The number of image displayed are " +count);
		//Thread.sleep(3000);

	}

}