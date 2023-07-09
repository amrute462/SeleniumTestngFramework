package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constants;
import io.opentelemetry.sdk.resources.Resource;
import pageObjectModel.loginPageObjects;

public class LoginTestCase extends BaseClass {

	@Test(dataProvider = "testData")
	public void VerifyLogin(String username, String password) throws IOException {

		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.enterUsername().sendKeys(username);
		lpo.enterPassword().sendKeys(password);
		lpo.clickOnLogin().click();
		
		commonMethods.verifyAssertions(lpo.loginerrorMessage(), constants.expectedTextErrormsg,"Valid error message is not showing" );

		/*WebElement a = lpo.loginerrorMessage();
		String actualText = a.getText();

		String ExpectedText = constants.expectedTextErrormsg;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualText, ExpectedText, "Valid error message is not showing");
		sa.assertAll();*/

	}

	// object is class--
	// Object[][]- is return type of dataprovider
	@DataProvider
	public Object[][] testData() { // testData() - is dataprovider name
		Object[][] data = new Object[3][2]; // create the object of object class
		data[0][0] = constants.username1; // 1st username
		data[0][1] = constants.password1;// 1st password
		data[1][0] = constants.username2; // 2nd username
		data[1][1] = constants.password2; // 2nd password
		data[2][0] = constants.username3; // 3rd username
		data[2][1] = constants.password3; // 3rd password

		return data;

	}

}
