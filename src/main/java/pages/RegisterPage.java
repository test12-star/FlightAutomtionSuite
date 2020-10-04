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

public class RegisterPage {
	
WebDriver driver;
	
	@FindBy(name="firstName")
	public WebElement edt_R_firstName;
	
	@FindBy(name="lastName")
	public WebElement edt_R_lastName;
	
	
	
	public RegisterPage() {
		driver = Utility.returnDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//Business components (it just method)
	public void registeration() throws IOException {
		Global.dataMap = TestData.readTestData(Global.id, Global.className, Global.methodName);
		UserActions.enterText(edt_R_firstName, "first Name", "R_firstNameSet");
		UserActions.enterText(edt_R_lastName, "last Name", "R_lastNameSet");
		
	}
	

}
