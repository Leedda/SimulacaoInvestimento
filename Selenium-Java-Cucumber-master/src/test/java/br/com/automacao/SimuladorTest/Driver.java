package br.com.automacao.SimuladorTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Driver {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	private static void createDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ledac\\Test\\Selenium-Java-Cucumber-master\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
