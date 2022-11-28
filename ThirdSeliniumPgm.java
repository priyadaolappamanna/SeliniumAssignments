import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdSeliniumPgm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\firefox driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		((WebDriver) driver).get("https://www.saucedemo.com/");
	}

}
