package smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import testsuit.TestData;

public class Login {
	static boolean flag = true;
	
	void login(TestData data,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		long starttime = System.currentTimeMillis(), endtime;
		driver.get(data.LoginURL);
		driver.manage().window().maximize();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		/*finally {

			driver.quit();
			endtime = System.currentTimeMillis();
			if (flag == true) {
				System.out.println("User Login for first time & total time for execution process was = "
						+ (endtime - starttime) / 6000 + " SECONDS");
			} else {
				System.out.println(
						"User tried to Login for first time but fail's and total time for execution process was = "
								+ (endtime - starttime) / 6000 + " SECONDS");
			}
		}*/
		
	}
	
	
	
}
