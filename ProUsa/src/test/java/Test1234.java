
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1234 {

	public class Test1 extends BaseClass {
		LoginPage LO;
		HomePage HO;
		LogoutPage LP;

		@BeforeClass
		public void openBrowser() throws IOException {
			browseropen();
			LO = new LoginPage(driver);
			HO = new HomePage(driver);
			LP = new LogoutPage(driver);

		}

		@BeforeMethod
		public void login() throws EncryptedDocumentException, InvalidFormatException, IOException {
			//LO.EnterUserName(UtilityClass.getstringdata(0, 0));
			//LO.EnterPassword(UtilityClass.getstringdata(0, 1));
			LO.clickloginbtn();

		}

		@Test
		public void test() throws EncryptedDocumentException, IOException, InvalidFormatException {
			String expresult = UtilityClass.getstringdata(0, 0);
			String actresult = HO.VerifyTextHPage();

			Assert.assertEquals(expresult, actresult, "act&exp result are different");
		}

		@AfterMethod
		public void logout(ITestResult result) throws IOException {
			if (result.getStatus() == ITestResult.FAILURE) {
				int TCID = 200;
				UtilityClass.captureScreenshot(driver, TCID);
				
				HO.ClickDB();
				LP.ClicklogoutBtn();
			}
		}

		@AfterClass
		public void closebrowser() {
			driver.close();
		}

	}
}
