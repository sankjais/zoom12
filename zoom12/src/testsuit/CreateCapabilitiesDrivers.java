package testsuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
// System.properties are already set in environment path so commented below.

public class CreateCapabilitiesDrivers {

	public static WebDriver chrome() {
		//System.setProperty("webdriver.chrome.driver", "D:/SANKET DATA/Eclipse/eclipse/extDriver/chrome/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		return chrome;
	}

	public static WebDriver IE() {
		//System.setProperty("webdriver.ie.driver", "D:/SANKET DATA/Eclipse/eclipse/extDriver/IE/IEDriverServer.exe");
		WebDriver IE = new InternetExplorerDriver();
		return IE;
	}

	public static WebDriver fireFox() {
		//System.setProperty("webdriver.gecko.driver", "D:/SANKET DATA/Eclipse/eclipse/extDriver/gecko/geckodriver.exe");
		WebDriver fireFox = new FirefoxDriver();
		return fireFox;

	}

}
