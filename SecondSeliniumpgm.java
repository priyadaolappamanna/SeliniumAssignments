import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class SecondSeliniumpgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\edge driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
	}

}
