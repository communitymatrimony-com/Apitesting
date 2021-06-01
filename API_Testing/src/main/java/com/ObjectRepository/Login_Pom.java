package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

import io.appium.java_client.android.AndroidDriver;

public class Login_Pom {
	public Login_Pom(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//*[@id='reg_login_button']")
	private WebElement home_Login_btn;
	
	@FindBy(xpath="//*[@id='txt_matriid']")//*[@id='txt_matriid']
	private WebElement Enter_Matrid;
	
	@FindBy(xpath="//*[@id='txt_pwd']")
	private WebElement Enter_passwrd;
	@FindBy(xpath="//*[@id='login_btn_from_login_layout']")
	private WebElement Enter_Login;
	@FindBy(xpath="	//*[@id='inter_close']")
	private WebElement inter_close;

	@FindBy(xpath="//*[@contentDescription='Navigate up']")
	private WebElement navigate_back_btn;
	
	@FindBy(xpath="//*[@text='Skip']")
	private WebElement Login_skip_btn;
	
	@FindBy(xpath="//*[@text='Login']")
	private WebElement Login_btn;
	@FindBy(xpath="//*[@text='Later']")
	private WebElement notification_access_later;
	
	
	
	public WebElement getLogin_btn() {
		return Login_btn;
	}
	
	public WebElement getNotification_access_later() {
		return notification_access_later;
	}
	public WebElement getLogin_skip_btn() {
		return Login_skip_btn;
	}
	public WebElement getNavigate_back_btn() {
		return navigate_back_btn;
	}
	public WebElement getInter_close() {
		return inter_close;
	}
	public void setInter_close(WebElement inter_close) {
		this.inter_close = inter_close;
	}
	public WebElement getHome_Login_btn() {
		return home_Login_btn;
	}
	public WebElement getEnter_Matrid() {
		return Enter_Matrid;
	}
	public WebElement getEnter_passwrd() {
		return Enter_passwrd;
	}
	public WebElement getEnter_Login() {
		return Enter_Login;
	}
	
	
	@FindBy(xpath="//*[@id='popup_close_btn']")
	private WebElement quickrespnse_clse_btn;
	/*@FindBy(xpath="//*[@id='reg_login_button']")
	private WebElement home_Login_btn;*/
	public WebElement getQuickrespnse_clse_btn() {
		return quickrespnse_clse_btn;
	}
	
  	public static void loginApp(AndroidDriver driver) {
  		Login_Pom l = new Login_Pom(driver);
  		try {
			Thread.sleep(2000);
            //driver.findElement(By.xpath("//*[@id='tv_skip']")).click();
			//BaseTest.click(l.getLogin_skip_btn());
			Thread.sleep(2000);
			Base.click(l.getLogin_btn());

			// BaseTest.click(l.getEnter_Matrid());
			Thread.sleep(2000);
			Base.typeData(l.getEnter_Matrid(), "IYR242926");
			Thread.sleep(2000);
			Base.typeData(l.getEnter_passwrd(), "cbstest");
			Thread.sleep(2000);
			Base.click(l.getEnter_Login());

		} catch (Exception e) {
			System.out.println("Already Login.................");
		}
  	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
