import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gtsizeandloc {
	public static void main(String[] args)
	{
	WebDriver driver=WebDriverManager.edgedriver().create();
//	driver.navigate().to("https://www.saucedemo.com");
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.id("login-button"));
	WebElement e=driver.findElement(By.xpath("(//h4)[1]"));
	System.out.println("Location is "+element.getLocation());
	System.out.println(" loginbutton size "+element.getSize());
	System.out.println("Location is "+e.getCssValue("margin-block-start"));
}
}
