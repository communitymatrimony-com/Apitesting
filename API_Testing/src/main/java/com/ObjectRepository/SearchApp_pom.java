package com.ObjectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

import io.appium.java_client.android.AndroidDriver;

public class SearchApp_pom extends Base{
	
	public SearchApp_pom(AndroidDriver driver) {
	       PageFactory.initElements(driver, this);
	       
	}
	
	@FindBy(xpath="//*[@text='LOGIN']")
	private WebElement chooseLogin;
	
	@FindBy(xpath="//*[@id='matriid_from_login_layout']")
	private WebElement matriId;
	
	@FindBy(xpath="//*[@id='pass__from_login_layout']")
	private WebElement password;
	
	@FindBy(xpath="//*[@text='Login']")
	private WebElement idLogin;
	
	@FindBy(xpath="//*[@text='Skip']")
	private WebElement quick_Tour_Skip;
	
	@FindBy(xpath="//*[@id='popup_close_btn']")
	private WebElement quick_response_popup;
	
	@FindBy(xpath="//*[@text='Later']")
	private WebElement notification_access_later;
	
	@FindBy(xpath="//*[@contentDescription='Search']")
	private WebElement search_btn;
	//*[@id='tab_search']
	
	@FindBy(xpath="(//*[@id='rl_row'])[1]")
	private WebElement search_age;
	
	@FindBy(xpath="(//*[@id='spinner_text'])[1]")
	private WebElement search_age_Height_from;
	
	@FindBy(xpath="(//*[@id='spinner_text'])[2]")
	private WebElement search_age_Height_to;
	
	
	@FindBy(xpath="//*[@id='search_ok_imageView']")
	private WebElement search_confirm_btn;
	
	@FindBy(xpath="(//*[@id='rl_row'])[2]")
	private WebElement search_Height;
	
	@FindBy(xpath="(//*[@id='rl_row'])[3]")
	private WebElement search_marital_status;
	
	@FindBy(xpath="(//*[@id='rl_row'])[4]")
	private WebElement search_Mother_tongue;
	
	@FindBy(xpath="(//*[@id='rl_row'])[5]")
	private WebElement search_subcaste;
	
	@FindBy(xpath="(//*[@id='rl_row'])[6]")
	private WebElement search_star;
	
	@FindBy(xpath="(//*[@id='rl_row'])[7]")
	private WebElement search_dosham;
	
	@FindBy(xpath="(//*[@id='rl_row'])[8]")
	private WebElement search_country;
	
	
	@FindBy(xpath="(//*[@id='rl_row'])[9]")
	private WebElement search_Education;
	
	@FindBy(xpath="//*[@text='SHORTLIST' and @width>0]")
	private WebElement shortlist_btn;
	
	@FindBy(xpath="//*[@text='SEND INTEREST']")
	private WebElement shortlist_sendinterest_btn;
	
	@FindBy(xpath="(//*[@class='android.view.ViewGroup' and ./parent::*[@id='navigation']]/*[./*[./*[@id='smallLabel']]])[4]")
	private WebElement menu_btn;
	//*[@id='icon' and ./parent::*[@id='tab_menu']]
	
	@FindBy(xpath="//*[@text='Account Settings']")
	private WebElement menu_Account_settings;
	
	@FindBy(xpath="//*[@text='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//*[@text='Search Now']")
	private WebElement search_now_btn;
	
	@FindBy(xpath="//*[@text='Unmarried']")
	private WebElement marital_status_Unmarried;
	
	
	@FindBy(xpath="//*[@id='profileMatriId']")
	private WebElement matri_Id;
	
	@FindBy(xpath="//*[@id='profileDesc']")
	private WebElement profile_description;
	
	
	public WebElement getMatri_Id() {
		return matri_Id;
	}

	public WebElement getProfile_description() {
		return profile_description;
	}

	public WebElement getMarital_status_Unmarried() {
		return marital_status_Unmarried;
	}

	public WebElement getSearch_now_btn() {
		return search_now_btn;
	}

	public WebElement getMenu_btn() {
		return menu_btn;
	}

	public WebElement getMenu_Account_settings() {
		return menu_Account_settings;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getShortlist_sendinterest_btn() {
		return shortlist_sendinterest_btn;
	}

	public WebElement getShortlist_btn() {
		return shortlist_btn;
	}

	public WebElement getSearch_age() {
		return search_age;
	}

	public WebElement getSearch_age_Height_from() {
		return search_age_Height_from;
	}

	public WebElement getSearch_age_Height_to() {
		return search_age_Height_to;
	}

	public WebElement getSearch_confirm_btn() {
		return search_confirm_btn;
	}

	public WebElement getSearch_Height() {
		return search_Height;
	}

	public WebElement getSearch_marital_status() {
		return search_marital_status;
	}

	public WebElement getSearch_Mother_tongue() {
		return search_Mother_tongue;
	}

	public WebElement getSearch_subcaste() {
		return search_subcaste;
	}

	public WebElement getSearch_star() {
		return search_star;
	}

	public WebElement getSearch_dosham() {
		return search_dosham;
	}

	public WebElement getSearch_country() {
		return search_country;
	}

	public WebElement getSearch_Education() {
		return search_Education;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	public WebElement getChooseLogin() {
		return chooseLogin;
	}

	public WebElement getMatriId() {
		return matriId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getIdLogin() {
		return idLogin;
	}

	public WebElement getQuick_Tour_Skip() {
		return quick_Tour_Skip;
	}

	public WebElement getQuick_response_popup() {
		return quick_response_popup;
	}

	public WebElement getNotification_access_later() {
		return notification_access_later;
	}

}
