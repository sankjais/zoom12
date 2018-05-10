package smoke;

import org.openqa.selenium.WebDriver;

import testsuit.CreateCapabilitiesDrivers;
import testsuit.TestData;

public class TestInitialiser {
	public static void main(String args[]) {

		long starttime = System.currentTimeMillis(), endtime;
		TestData data = new TestData();
		data = data.creatTestData();
		WebDriver driver = CreateCapabilitiesDrivers.fireFox();

		try {

			Login zoomerlogin = new Login();
			zoomerlogin.login(data, driver);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			endtime = System.currentTimeMillis();
			System.out.println("Total Time for Executing all threads = " + (endtime - starttime) / 6000 + " SECONDS");
		}

	}

}
