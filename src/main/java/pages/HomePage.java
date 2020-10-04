package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.Global;
import lib.TestData;
import lib.UserActions;
import lib.Utility;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(name="userName")
	public WebElement edt_H_username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement edt_H_password;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	public WebElement lnk_H_register;
	
	//Hello  - by ABC person
	
	public HomePage() {
		driver = Utility.returnDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Business components (it just method)
	public void home() throws IOException {
		
		Global.dataMap = TestData.readTestData(Global.id, Global.className, Global.methodName);
		
		driver.get(Global.appURL);
		UserActions.enterText(edt_H_username, "username", "H_usernameSet");
		UserActions.enterText(edt_H_password, "password", "H_passwordSet");
		UserActions.clickElement(lnk_H_register, "register link", "H_register");
		
		
	}
	
	
	
	
	


}
