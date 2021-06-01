

package com.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;

public class login_pom_app extends Base{
	public login_pom_app(AndroidDriver driver) {
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

	public WebElement getQuick_response_btn() {
		return Quick_response_btn;
	}
	public WebElement getView_reply_btn() {
		return view_reply_btn;
	}
	public WebElement getMailcontent_btn() {
		return mailcontent_btn;
	}
	public WebElement getMail_send_btn() {
		return mail_send_btn;
	}
	public WebElement getCancel_btn() {
		return cancel_btn;
	}
	public WebElement getAccept_btn() {
		return accept_btn;
	}
	public WebElement getDecline_btn() {
		return decline_btn;
	}
	public WebElement getQuick_res_matrid() {
		return quick_res_matrid;
	}

	@FindBy(xpath="//*[@text='Skip']")
	private WebElement Login_skip_btn;

	@FindBy(xpath="//*[@text='Login']")
	private WebElement Login_btn;

	@FindBy(xpath="//*[@text='Quick Response']")
	private WebElement Quick_response_btn;


	@FindBy(xpath="//*[@text='View & Reply']")
	private WebElement view_reply_btn;

	@FindBy(xpath="//*[@id='mailcontent']")
	private WebElement mailcontent_btn ;


	@FindBy(xpath="//*[@text='SEND']")
	private WebElement mail_send_btn;

	@FindBy(xpath="//*[@text='CANCEL']")
	private WebElement cancel_btn;

	@FindBy(xpath="//*[@text='Accept']")
	private WebElement accept_btn;


	@FindBy(xpath="//*[@text='Decline']")
	private WebElement decline_btn;

	@FindBy(xpath="//*[@id='txtQukMatriID']")
	private WebElement quick_res_matrid;


	public WebElement getLogin_btn() {
		return Login_btn;
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

	/*
	 * public static void loginApp(AndroidDriver driver) { login_pom_app l = new
	 * login_pom_app(driver); try { Thread.sleep(2000);
	 * //driver.findElement(By.xpath("//*[@id='tv_skip']")).click();
	 * //BaseTest.click(l.getLogin_skip_btn()); Thread.sleep(2000);
	 * BaseTest.click(l.getLogin_btn());
	 * 
	 * // BaseTest.click(l.getEnter_Matrid()); Thread.sleep(2000);
	 * BaseTest.typeData(l.getEnter_Matrid(), "IYR242926"); Thread.sleep(2000);
	 * BaseTest.typeData(l.getEnter_passwrd(), "cbstest"); Thread.sleep(2000);
	 * BaseTest.click(l.getEnter_Login());
	 * 
	 * } catch (Exception e) { System.out.println("Already Login.................");
	 * } }
	 */





















}



