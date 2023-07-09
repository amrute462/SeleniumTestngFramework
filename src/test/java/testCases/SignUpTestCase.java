package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModel.loginPageObjects;
import pageObjectModel.SignUpPageObjects;
import org.openqa.selenium.support.ui.*;

public class SignUpTestCase extends BaseClass {
	
	@Test
	public void VerifySignUp() throws IOException, InterruptedException {
		
		
		
		 loginPageObjects lpo=new  loginPageObjects(driver);
		 lpo.clickOntryForFree().click();
		 
		 SignUpPageObjects supo=new SignUpPageObjects(driver);
		 
		 Thread.sleep(5000);
		 supo.enterFirstName().sendKeys(constants.firstName);
		 supo.enterLastName().sendKeys(constants.lastName);
		 supo.enterJobTitle().sendKeys(constants.jobTitle);
		 supo.clickOnNextButton().click();
		 commonMethods.selectDropdown(supo.selectEmployees(), 2);
		 commonMethods.selectDropdown(supo.selectCountry(), 3);
		 
		 
	/*	 WebElement a=supo.selectEmployees();
		 Select s=new Select(a);
		 s.selectByIndex(2);
		 */
		 supo.companyName().sendKeys(constants.comanyName);
		 supo.clickOnNextButton().click();
		 
		 commonMethods.verifyAssertions(supo.signUpPageConfirmation(), constants.expectedTextSignupText, "Valid signup text is not showing");
		 
			
		 
		 
	}

}
