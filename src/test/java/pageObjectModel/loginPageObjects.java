package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	public WebDriver driver; //This driver dont have scope

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@name='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	private By loginerrorMessage=By.xpath("//div[@class='loginError']");

	public loginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement enterUsername() {

		return driver.findElement(username);

	}

	public WebElement enterPassword() {

		return driver.findElement(password);

	}

	public WebElement clickOnLogin() {

		return driver.findElement(login);

	}
	public WebElement clickOntryForFree() {

		return driver.findElement(tryForFree);

	}
	public WebElement loginerrorMessage() {

		return driver.findElement(loginerrorMessage);

	}

}
