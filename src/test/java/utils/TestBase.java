package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	WebDriver driver;
	Properties prop;
	FileInputStream file;

	public TestBase() throws IOException {
		prop = new Properties();		
		file = new FileInputStream("E:\\Automation Frameworks\\UI Test Framework\\UIAutomation\\src\\test\\resources\\variable.properties");
		prop.load(file);
	}

	public WebDriver webDriverManager() {

		if (driver == null) {

			if (prop.get("browser").equals("chrome")) {

				System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			} else if (prop.get("broser").equals("firefox")) {
				// write firefox code here
			} else if (prop.get("broser").equals("safari")) {
				// write safari code here
			} else if (prop.get("broser").equals("edge")) {
				// write edge code here
			}

		}
		driver.get(prop.getProperty("qaUrl"));

		return driver;
	}

}
