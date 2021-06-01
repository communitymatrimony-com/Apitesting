package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;



public class ProfileViewNotContacted extends Base{
	WebDriver driver;
	
	public ProfileViewNotContacted(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[2]/div[1]/a")
	private WebElement my_home;
	public WebElement getMy_home() {
		return my_home;
	}
	
	@FindBy(xpath="//*[@id=\"myhomepop\"]/div[2]/div/div[1]/ul/li[1]/a")
	private WebElement profile_viewed_not_contacted;
	public WebElement getProfile_viewed_not_contacted() {
		return profile_viewed_not_contacted;
	}
	
	@FindBy(xpath="//a[contains(text(),'Profiles shortlisted by me')]")
	private WebElement profile_shortlisted_my_me;
	public WebElement getProfile_shortlisted_my_me() {
		return profile_shortlisted_my_me;
	}
	
	@FindBy(xpath="//*[@id=\"myhomepop\"]/div[2]/div/div[1]/ul/li[3]/a")
	private WebElement mobile_no_viewed_by_me;
	public WebElement getMobile_no_viewed_by_me() {
		return mobile_no_viewed_by_me;
	}
	
	@FindBy(xpath="//*[@id=\"myhomepop\"]/div[2]/div/div[1]/ul/li[4]/a")
	private WebElement profile_i_ignored;
	public WebElement getProfile_i_ignored() {
		return profile_i_ignored;
	}
	
	
	@FindBy(xpath="//*[@id=\"facetShowProfilesCreated\"]/dl/dd[1]/a")
	private WebElement profile_created_within_a_week;
	public WebElement getProfile_created_within_a_week() {
		return profile_created_within_a_week;
	}
	
	@FindBy(xpath="//*[@id=\"facetShowProfilesCreated\"]/dl/dd[1]/a")
	private WebElement profile_created_within_a_month;
	public WebElement getProfile_created_within_a_month() {
		return profile_created_within_a_month;
	}
	
	@FindBy(xpath="//*[@id=\"facetActive\"]/dl/dd[1]/a")
	private WebElement active_profile_now;
	public WebElement getActive_profile_now() {
		return active_profile_now;
	}
	
	@FindBy(xpath="//*[@id=\"facetActive\"]/dl/dd[2]/a")
	private WebElement active_week_ago;
	public WebElement getActive_week_ago() {
		return active_week_ago;
	}
	
	@FindBy(xpath="//*[@id=\"facetActive\"]/dl/dd[3]/a")
	private WebElement active_month_ago;
	public WebElement getActive_month_ago() {
		return active_month_ago;
	}
	
	@FindBy(xpath="//*[@id=\"facetActive\"]/dl/dd[4]/a")
	private WebElement active_month_above;
	public WebElement getActive_month_above() {
		return active_month_above;
	}
	
	
	@FindBy(id="FMoreActive")
	private WebElement active_more_btn;
	public WebElement getActive_more_btn() {
		return active_more_btn;
	}
	
	@FindBy(id="activeOpt0")
	private WebElement active_profile_now_radio_button;
	public WebElement getActive_profile_now_radio_button() {
		return active_profile_now_radio_button;
	}
	
	
	@FindBy(id="activeOpt1")
	private WebElement active_profile_weekradio_button;
	public WebElement getActive_profile_weekradio_button() {
		return active_profile_weekradio_button;
	}
	
	@FindBy(id="activeOpt2")
	private WebElement active_profile_month_radio_button;
	public WebElement getActive_profile_month_radio_button() {
		return active_profile_month_radio_button;
	}
	
	@FindBy(id="activeOpt3")
	private WebElement active_profile_month_above_radio_button;
	public WebElement getActive_profile_month_above_radio_button() {
		return active_profile_month_above_radio_button;
	}
	
	@FindBy(xpath="//*[@id=\"MoreActive\"]/div[2]/input")
	private WebElement active_more_submit_btn;
	public WebElement getActive_more_submit_btn() {
		return active_more_submit_btn;
	}
	
	@FindBy(xpath="//*[@id=\"facetProfileType\"]/dl/dd/a")
	private WebElement profile_type_with_photo;
	public WebElement getProfile_type_with_photo() {
		return profile_type_with_photo;
	}
	
	@FindBy(id="FMoreProfileType")
	private WebElement profile_type_more_btn;
	public WebElement getProfile_type_more_btn() {
		return profile_type_more_btn;
	}
	
	
	@FindBy(id="photoOpt")
	private WebElement profile_type_more_photo_radio_btn;
	public WebElement getProfile_type_more_photo_radio_btn() {
		return profile_type_more_photo_radio_btn;
	}
	
	
	@FindBy(id="horoscopeOpt")
	private WebElement profile_type_more_horoscope_radio_btn;
	public WebElement getProfile_type_more_horoscope_radio_btn() {
		return profile_type_more_horoscope_radio_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"MoreProfileType\"]/div[2]/input")
	private WebElement profile_type_submit_btn;
	public WebElement getProfile_type_submit_btn() {
		return profile_type_submit_btn;
	}
	
	@FindBy(id="facetAgelabel")
	private WebElement age_refine_filter;
	public WebElement getAge_refine_filter() {
		return age_refine_filter;
	}
	
	@FindBy(id="FMoreAge")
	private WebElement age_more_btn;
	public WebElement getAge_more_btn() {
		return age_more_btn;
	}
	
	@FindBy(id="ageFrom")
	private WebElement age_from;
	public WebElement getAge_from() {
		return age_from;
	}
	
	@FindBy(id="ageTo")
	private WebElement age_to;
	public WebElement getAge_to() {
		return age_to;
	}
	
	@FindBy(xpath="//*[@id=\"MoreAge\"]/div[2]/input")
	private WebElement age_submit_btn;
	public WebElement getAge_submit_btn() {
		return age_submit_btn;
	}
	
	@FindBy(id="facetHeightlabel")
	private WebElement height_refine_btn;
	public WebElement getHeight_refine_btn() {
		return height_refine_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"FMoreHeight\"]/a")
	private WebElement height_more_btn;
	public WebElement getHeight_more_btn() {
		return height_more_btn;
	}
	
	@FindBy(id="heightFrom")
	private WebElement height_from;
	public WebElement getHeight_from() {
		return height_from;
	}
	
	@FindBy(id="heightTo")
	private WebElement height_to;
	public WebElement getHeight_to() {
		return height_to;
	}
	
	@FindBy(xpath="//*[@id=\"MoreHeight\"]/div[2]/input")
	private WebElement height_submit_btn;
	public WebElement getHeight_submit_btn() {
		return height_submit_btn;
	}
	
	@FindBy(id="facetMaritalStatuslabel")
	private WebElement marital_status_refine_btn;
	public WebElement getMarital_status_refine_btn() {
		return marital_status_refine_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"FMoreMaritalStatus\"]/a")
	private WebElement marital_status_more_btn;
	public WebElement getMarital_status_more_btn() {
		return marital_status_more_btn;
	}

	@FindBy(id="showmore")
	private WebElement showMore_btn;
	public WebElement getShowMore_btn() {
		return showMore_btn;
	}

	@FindBy(id="facetMotherTonguelabel")
	private WebElement mother_tongue_refine_btn;
	public WebElement getMother_tongue_refine_btn() {
		return mother_tongue_refine_btn;
	}
	
	@FindBy(id="facetAnnualIncomelabel")
	private WebElement annual_income_refine_btn;
	public WebElement getAnnual_income_refine_btn() {
		return annual_income_refine_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"FMoreAnnualIncome\"]/a")
	private WebElement annual_income_more_button;
	public WebElement getAnnual_income_more_button() {
		return annual_income_more_button;
	}
	
	@FindBy(id="annualIncome")
	private WebElement annual_income;
	public WebElement getAnnual_income() {
		return annual_income;
	}
	
	
	@FindBy(xpath="//*[@id=\"MoreAnnualIncome\"]/div[2]/input")
	private WebElement annual_income_submit_btn;
	public WebElement getAnnual_income_submit_btn() {
		return annual_income_submit_btn;
	}
	
	
	@FindBy(id="total_div")
	private WebElement profile_count;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProfile_count() {
		return profile_count;
	}
	
	@FindBy(xpath="//span[contains(text(),'Next ')]")
	private WebElement next;
	public WebElement getNext() {
		return next;
	}
	
	
	@FindBy(id="ignorecrossbefore_0")
	private WebElement viewProfile_click;
	public WebElement getViewProfile_click() {
		return viewProfile_click;
	}
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img")
	private WebElement logout_menu;
	public WebElement getLogout_menu() {
		return logout_menu;
	}
	
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[1]/a")
	private WebElement edit_profile;
	public WebElement getEdit_profile() {
		return edit_profile;
	}
	
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	
	
}
