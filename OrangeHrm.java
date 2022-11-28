//import java.time.Duration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	public static void main(String[] args)  {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("The title is -- "+title);
		String URL=driver.getCurrentUrl();
		//System.out.println("The URL is --- "+URL);
		//String psource= driver.getPageSource();
		//System.out.println("The page source is --- "+psource);
	//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).click();
	//Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		//Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		//Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Orang")).click();
		//Thread.sleep(3000);
		

	}

}
