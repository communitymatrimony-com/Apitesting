package com.ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest_PP;


public class Gothram_pom extends BaseTest_PP{
	
	public Gothram_pom(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='idEmail']")
    private WebElement MatriID;
	public WebElement getMatriID() {
		return MatriID;
	}
	
	@FindBy(id="passwordClear1")
	private WebElement PasswordClear;
	public WebElement getPasswordClear() {
		return PasswordClear;
	}
	
	
	@FindBy(id="password1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}

	
	@FindBy(xpath="//input[@value='LOGIN']")
	private WebElement Login_btn;
	public WebElement getLogin_btn() {
		return Login_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Skip to My Matrimony >>')]")
	private WebElement InterMediate_page;
	public WebElement getInterMediate_page() {
		return InterMediate_page;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Skip to Daily Matches >>')]")
	private WebElement InterMediate_page1;	
	public WebElement getInterMediate_page1() {
		return InterMediate_page1;
	}

	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
	private WebElement Menu_btn;
	public WebElement getMenu_btn() {
		return Menu_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img")
	private WebElement Menu_btn1;
	public WebElement getMenu_btn1() {
		return Menu_btn1;
	}
	
	@FindBy(xpath="//a[contains(text(),'Edit Profile')]")
	private WebElement Edit_Profile;
	public WebElement getEdit_Profile() {
		return Edit_Profile;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Edit Partner Preference')]")
	private WebElement Edit_Partner_Preference;
	public WebElement getEdit_Partner_Preference() {
		return Edit_Partner_Preference;
	}
	
	@FindBy(xpath="//a[@class='editIcon font12 clr6']")
	private WebElement PP_Edit_btn;	
	public WebElement getPP_Edit_btn() {
		return PP_Edit_btn;
	}
	
	
	@FindBy(id="gothram")
	private WebElement PP_Gothram_DropDown;
	public WebElement getPP_Gothram_DropDown() {
		return PP_Gothram_DropDown;
	}
	
	

	@FindBy(xpath="//span[contains(text(),'Gothram - ')]//following::span[1]")
	private WebElement PP_Gothram_Value;
	public WebElement getPP_Gothram_Value() {
		return PP_Gothram_Value;
	}
	
    @FindBy(xpath="//span[contains(text(),'Gothram')]//following::span[2]")
    private WebElement PI_Gothram_Value;
	public WebElement getPI_Gothram_Value() {
		return PI_Gothram_Value;
	}
	
	
	@FindBy(id="Manage_StrictPP")
	private WebElement Strict_PP_btn;	
	public WebElement getStrict_PP_btn() {
		return Strict_PP_btn;
	}
	
	@FindBy(xpath="//label[@for='Strict_Gothram']")
	private WebElement Strict_PP_Gothram;
	public WebElement getStrict_PP_Gothram() {
		return Strict_PP_Gothram;
	}
	
	
	@FindBy(id="strictppflag")
	private WebElement Strict_PP_Save;
	public WebElement getStrict_PP_Save() {
		return Strict_PP_Save;
	}

	@FindBy(xpath="(//a[contains(text(),'Search')])[1]")
	private WebElement Search;
	public WebElement getSearch() {
		return Search;
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Advanced')])[2]")
	private WebElement Advanced_Search;
	public WebElement getAdvanced_Search() {
		return Advanced_Search;
	}
	
	@FindBy(id="gothramTemp")
	private WebElement Gotram_dropDown;
	public WebElement getGotram_dropDown() {
		return Gotram_dropDown;
	}
	
	
	@FindBy(id="btnSubmit")
	private WebElement Edit_PP_Save;	
	public WebElement getEdit_PP_Save() {
		return Edit_PP_Save;
	}

	
	
	@FindBy(id="gothram")
	private WebElement Gothram_selected_Value;
	public WebElement getGothram_selected_Value() {
		return Gothram_selected_Value;
	}
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement Search_btn;
	public WebElement getSearch_btn() {
		return Search_btn;
	}
	
	@FindBy(id="total_div")
	private WebElement Search_Results_Count;
	public WebElement getSearch_Results_Count() {
		return Search_Results_Count;
	}
	
	@FindBy(id="ignorecrossbefore_0")
	private WebElement Profile_Click_toGo_VP;
	public WebElement getProfile_Click_toGo_VP() {
		return Profile_Click_toGo_VP;
	}
	
	
	@FindBy(xpath="(//span[contains(text(),'Gothra')])[1]//following::span[3]")
	private WebElement VP_Gothram_Value;
	public WebElement getVP_Gothram_Value() {
		return VP_Gothram_Value;
	}
		
	
	@FindBy(id="nxtproflink")
	private WebElement VP_Next_ProfileClick;
	public WebElement getVP_Next_ProfileClick() {
		return VP_Next_ProfileClick;
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Matches ')])[1]")
	private WebElement Matches;
	public WebElement getMatches() {
		return Matches;
	}
	
	@FindBy(id="menuYTB")
	private WebElement Yet_To_Be_Viewed;
	public WebElement getYet_To_Be_Viewed() {
		return Yet_To_Be_Viewed;
	}
	
	
	@FindBy(id="premiumYTV")
	private WebElement Premium_match;
	public WebElement getPremium_match() {
		return Premium_match;
	}
	
	
	@FindBy(id="menuLM")
	private WebElement Latest_Match;
	public WebElement getLatest_Match() {
		return Latest_Match;
	}
	
	
	
	@FindBy(xpath="//a[contains(text(),'My Home')]")
	private WebElement MyHome;
	public WebElement getMyHome() {
		return MyHome;
	}

	@FindBy(xpath="//a[contains(text(),'Profiles viewed & not contacted ')]")
	private WebElement Profile_View_Not_Comtacted;
	public WebElement getProfile_View_Not_Comtacted() {
		return Profile_View_Not_Comtacted;
	}
	
	@FindBy(xpath="//a[contains(text(),'Profiles shortlisted by me ')]")
	private WebElement Profile_Shortlisted_By_Me;
	public WebElement getProfile_Shortlisted_By_Me() {
		return Profile_Shortlisted_By_Me;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Mobile nos.viewed by me ')]")
	private WebElement Mobile_No_Vewed;
	public WebElement getMobile_No_Vewed() {
		return Mobile_No_Vewed;
	}
	
	@FindBy(xpath="//a[contains(text(),'Profiles I have ignored ')]")
	private WebElement Profile_Ignored;
	public WebElement getProfile_Ignored() {
		return Profile_Ignored;
	}
	
	
	@FindBy(id="motherTongueTemp")
	private WebElement MoterTongue_Search;
	public WebElement getMoterTongue_Search() {
		return MoterTongue_Search;
	}
	
	
	@FindBy(id="motherTongue")
	private WebElement MotherTongue_Selected_Value;
	public WebElement getMotherTongue_Selected_Value() {
		return MotherTongue_Selected_Value;
	}
	
	@FindBy(id="starTemp")
	private WebElement Star_Search;	
	public WebElement getStar_Search() {
		return Star_Search;
	}

	@FindBy(id="star")
	private WebElement Star_Selected_Value;
	public WebElement getStar_Selected_Value() {
		return Star_Selected_Value;
	}
	
	
	@FindBy(id="casteTemp")
	private WebElement Caste_Search;
	public WebElement getCaste_Search() {
		return Caste_Search;
	}	
	
	
	@FindBy(id="caste")
	private WebElement Caste_Selected_Value;
	public WebElement getCaste_Selected_Value() {
		return Caste_Selected_Value;
	}
	
	
	@FindBy(id="subcasteTemp")
	private WebElement SubCaste_Search;
	public WebElement getSubCaste_Search() {
		return SubCaste_Search;
	}
	
	
	@FindBy(id="subcaste")
	private WebElement Subcaste_Selected_Value;
	public WebElement getSubcaste_Selected_Value() {
		return Subcaste_Selected_Value;
	}
	
	@FindBy(xpath="//input[@value='Modify Search']")
	private WebElement Modify_Search;
	public WebElement getModify_Search() {
		return Modify_Search;
	}
	
	
	
	
}
