package com.freecrm.qa.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.freecrm.qa.util.TestUtil;
import com.freecrm.qa.util.WebEventListener;

public class Testbase {
	public static WebDriver driver;
	public static Properties properties;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public Testbase() {
		properties = new Properties();

		try {
			properties
					.load(new FileReader(
							System.getProperty("user.dir")
									+ "/src/main/java/com/freecrm/qa/config/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browseName = properties.getProperty("browser");
		switch (browseName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
			driver = new FirefoxDriver();

			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "c:/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;

		}

		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts()
				.pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts()
				.implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
	}
}