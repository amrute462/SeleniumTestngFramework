package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	public WebDriver driver;
	
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By jobtitle=By.xpath("//input[@name='UserTitle']");
	private By nextButton=By.xpath("//span[contains(text(),'Next')]");
	private By selectemployee=By.xpath("//select[@name='CompanyEmployees']");
	private By companyname=By.xpath("//input[@name='CompanyName']");
	private By selectcountry=By.xpath("//select[@name='CompanyCountry']");
	private By signUpPageConfirmation=By.xpath("//h2[@id='answer-2-more-questions-and-well-get-you-into-your-free-trial']");
	
	
	public SignUpPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement enterFirstName() {
		return driver.findElement(firstname);
	}
	
	public WebElement enterLastName() {
		return driver.findElement(lastname);
	}
	public WebElement enterJobTitle() {
		return driver.findElement(jobtitle);
	}
	public WebElement clickOnNextButton() {
		return driver.findElement(nextButton);
	}
	public WebElement selectEmployees() {
		return driver.findElement(selectemployee);
	}
	public WebElement companyName() {
		return driver.findElement(companyname);
	}
	public WebElement selectCountry() {
		return driver.findElement(selectcountry);
	}
	public WebElement signUpPageConfirmation() {
		return driver.findElement(signUpPageConfirmation);
	}

}
