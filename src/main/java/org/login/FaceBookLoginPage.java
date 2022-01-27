package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage extends BaseClass {

	public FaceBookLoginPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement crtbtn;
	
	@FindBy(name = "firstname")
	private WebElement fName;
	
	@FindBy(name = "lastname")
	private WebElement lName;
	
	@FindBy(name = "websubmit")
	private WebElement webSubmit;
	
	@FindBy(id = "email")
	private WebElement txtUserName;
	
	@FindBy(id = "pass")
	private WebElement txtUserPassword;
	
	@FindBy(name = "login")
	private WebElement userLogin;
	
	public WebElement getCrtbtn() {
		return crtbtn;
	}
	
	public WebElement getfName() {
		return fName;
	}
	
	public WebElement getlName() {
		return lName;
	}
	
	public WebElement getWebSubmit() {
		return webSubmit;
	}
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtUserPassword() {
		return txtUserPassword;
	}
	
	public WebElement getUserLogin() {
		return userLogin;
	}
}
