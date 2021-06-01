package com.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;



public class inbox_POM  extends Base{
	WebDriver driver;
	
	public inbox_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[1]/input")
	private WebElement matriId;
	
	@FindBy(id="passwordClear1")
	private WebElement paswwordclr;
	
	@FindBy(id="password1")
	private WebElement password;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[2]/div[3]/a")
	private WebElement inboxbtn;
	//*[@id="topnav-login-menu"]/div[2]/div[3]/a
	@FindBy(id="RMPENDINGINT1")
	private WebElement pendinginterest;
	
	@FindBy(id="accept0")
	private WebElement acceptinterest;
	
	@FindBy(id="RMPENDINGMSG1")
	private WebElement pendingmessage;

	public WebElement getPendingmessage() {
		return pendingmessage;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMatriId() {
		return matriId;
	}

	public WebElement getPaswwordclr() {
		return paswwordclr;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getInboxbtn() {
		return inboxbtn;
	}

	public WebElement getPendinginterest() {
		return pendinginterest;
	}

	public WebElement getAcceptinterest() {
		return acceptinterest;
	}
	

}
