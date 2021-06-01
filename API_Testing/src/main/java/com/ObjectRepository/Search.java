package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Base.Base;

public class Search extends Base{
	
	WebDriver driver;
	
	public Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public static double convertFeetandInchesToCentimeter(String feet, String inches) {
        double heightInFeet = 0;
        double heightInInches = 0;
        try {
        if (feet != null && feet.trim().length() != 0) {
            heightInFeet = Double.parseDouble(feet);
        }
        if (inches != null && inches.trim().length() != 0) {
            heightInInches = Double.parseDouble(inches);
        }
        } catch (NumberFormatException nfe) {

        }
        return (heightInFeet * 30.48) + (heightInInches * 2.54);
    }

	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[1]/input")
	private WebElement matriId;
	public WebElement getMatriId() {
		return matriId;
	}

	@FindBy(id="passwordClear1")
	private WebElement paswwordclr;
	public WebElement getPaswwordclr() {
		return paswwordclr;
	}
	
	
	@FindBy(id="password1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}

	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement loginbtn;
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	@FindBy(xpath="(//a[contains(text(),'Search')])[1]")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(id="ageFrom")
	private WebElement ageFrom;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAgeFrom() {
		return ageFrom;
	}
	
	
	@FindBy(id="ageTo")
	private WebElement ageTo;
	public WebElement getAgeTo() {
		return ageTo;
	}
	
	@FindBy(id="heightFrom")
	private WebElement heightFrom;
	public WebElement getHeightFrom() {
		return heightFrom;
	}
	
	
	@FindBy(id="heightTo")
	private WebElement heightTo;
	public WebElement getHeightTo() {
		return heightTo;
	}
	
	@FindBy(id="maritalStatus0")
	private WebElement marital_status_any;
	public WebElement getMarital_status_any() {
		return marital_status_any;
	}
	
	
	@FindBy(id="maritalStatus1")
	private WebElement marital_status_unmarried;
	public WebElement getMarital_status_unmarried() {
		return marital_status_unmarried;
	}

	@FindBy(id="maritalStatus2")
	private WebElement marital_status_widow;
	public WebElement getMarital_status_widow() {
		return marital_status_widow;
	}
	
	@FindBy(id="maritalStatus3")
	private WebElement marital_status_divorceed;
	public WebElement getMarital_status_divorceed() {
		return marital_status_divorceed;
	}
	
	
	@FindBy(id="maritalStatus4")
	private WebElement marital_status_seperated;
	public WebElement getMarital_status_seperated() {
		return marital_status_seperated;
	}
	
	//  Double click this value to choose 
	@FindBy(id="subcasteTemp")
	private WebElement sub_caste;
	public WebElement getSub_caste() {
		return sub_caste;
	}
	
//  Double click this value to choose 
	@FindBy(id="denomination")
	private WebElement denom_value;
	public WebElement getdenom_value() {
		return denom_value;
	}
	//caste
	@FindBy(id="subcaste")
	private WebElement subcaste_deselect;
	public WebElement getSubcaste_deselect() {
		return subcaste_deselect;
	}
	
	@FindBy(id="caste")
	private WebElement caste_deselect;
	public WebElement getcaste_deselect() {
		return caste_deselect;
	}
	

	
	
//  Double click this value to choose 
	@FindBy(id="motherTongueTemp")
	private WebElement mother_tongue;
	public WebElement getMother_tongue() {
		return mother_tongue;
	}
	
	@FindBy(id="motherTongue")
	private WebElement mothertongue_deselect;
	public WebElement getMothertongue_deselect() {
		return mothertongue_deselect;
	}
	
//  Double click this value to choose 
	@FindBy(id="countryTemp")
	private WebElement country_living_in;
	public WebElement getCountry_living_in() {
		return country_living_in;
	}
	
	
	@FindBy(id="country")
	private WebElement country_deselect;
	public WebElement getCountry_deselect() {
		return country_deselect;
	}
	
//  Double click this value to choose 
	@FindBy(id="residingStateTemp0")
	private WebElement residing_state;
	public WebElement getResiding_state() {
		return residing_state;
	}
	
	@FindBy(id="residingState")
	private WebElement residing_state_deselect;
	public WebElement getResiding_state_deselect() {
		return residing_state_deselect;
	}
	
//  Double click this value to choose 
	@FindBy(id="educationTemp") 
	private WebElement education;
	public WebElement getEducation() {
		return education;
	}
	
	@FindBy(id="education")
	private WebElement education_deselect;
	public WebElement getEducation_deselect() {
		return education_deselect;
	}
	
	
	@FindBy(id="photoOpt")
	private WebElement show_profile_with_photo;
	public WebElement getShow_profile_with_photo() {
		return show_profile_with_photo;
	}
	
	@FindBy(id="horoscopeOpt")
	private WebElement show_profile_with_horoscope;
	public WebElement getShow_profile_with_horoscope() {
		return show_profile_with_horoscope;
	}
	
	@FindBy(id="alreadyContOpt")
	private WebElement dnt_show_profile_already_contacted;
	public WebElement getDnt_show_profile_already_contacted() {
		return dnt_show_profile_already_contacted;
	}
	
	
	@FindBy(id="alreadyViewedOpt")
	private WebElement dnt_show_profile_already_viewed;
	public WebElement getDnt_show_profile_already_viewed() {
		return dnt_show_profile_already_viewed;
	}
	
	
	@FindBy(id="shortlistOpt")
	private WebElement dnt_show_shortlisted_profiles;
	public WebElement getDnt_show_shortlisted_profiles() {
		return dnt_show_shortlisted_profiles;
	}
	
	
	@FindBy(id="ignoredOpt")
	private WebElement dnt_show_profile_bloked;
	public WebElement getDnt_show_profile_bloked() {
		return dnt_show_profile_bloked;
	}
	
	
	@FindBy(id="igOpt")
	private WebElement dnt_show_ignored_profiles;
	public WebElement getDnt_show_ignored_profiles() {
		return dnt_show_ignored_profiles;
	}
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement search_btn;
	public WebElement getSearch_btn() {
		return search_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"srcform\"]/div[2]/div[4]/input[2]")
	private WebElement save_search_btn;
	public WebElement getSave_search_btn() {
		return save_search_btn;
	}
	
	@FindBy(xpath="//*[@id=\"save_srch_link\"]/div[5]/div[3]/input")
	private WebElement dnt_show_submit_btn;
	public WebElement getDnt_show_submit_btn() {
		return dnt_show_submit_btn;
	}

	
	/////////////////     Refine Search  ---   After POM    ///////////////////////


	@FindBy(xpath="//*[@id=\"facetShowProfilesCreated\"]/dl/dd[1]/a")
	private WebElement profile_created_within_a_day;
	public WebElement getProfile_created_within_a_day() {
		return profile_created_within_a_day;
	}
	
	
	@FindBy(xpath="//*[@id=\"facetShowProfilesCreated\"]/dl/dd[2]/a")
	private WebElement profile_created_within_a_week;
	public WebElement getProfile_created_within_a_week() {
		return profile_created_within_a_week;
	}
	
	@FindBy(xpath="//*[@id=\"facetShowProfilesCreated\"]/dl/dd[3]/a")
	private WebElement profile_created_within_a_month;
	public WebElement getProfile_created_within_a_month() {
		return profile_created_within_a_month;
	}

	

	////////////////////////////   Profile Type  - Refine   ////////////
	

	@FindBy(xpath="//*[@id=\"facetProfileType\"]/dl/dd[1]/a")
	private WebElement profile_type_with_photo;
	public WebElement getProfile_type_with_photo() {
		return profile_type_with_photo;
	}
	
	@FindBy(xpath="//*[@id=\"facetProfileType\"]/dl/dd[2]/a")
	private WebElement profile_type_with_horoscope;
	public WebElement getProfile_type_with_horoscope() {
		return profile_type_with_horoscope;
	}
	
	@FindBy(xpath="(//a[contains(text(),' More ')])[3]")
	private WebElement profile_type_more_button;
	public WebElement getProfile_type_more_button() {
		return  profile_type_more_button;
	}
	
	
	/////////////   ////////   Active Profile    -  Refine   /////////////
	
	@FindBy(xpath="//*[@id=\"facetActive\"]/dl/dd[1]/a")
	private WebElement online_now;
	public WebElement getOnline_now() {
		return online_now;
	}
	
	@FindBy(xpath="//*[@id=\"facetActive\"]/dl/dd[2]/a")
	private WebElement online_week_ago;
	public WebElement getOnline_week_ago() {
		return online_week_ago;
	}
	

	@FindBy(xpath="//*[@id=\"facetActive\"]/dl/dd[3]/a")
	private WebElement online_month_ago;
	public WebElement getOnline_month_ago() {
		return online_month_ago;
	}
	
	@FindBy(xpath="//*[@id=\"facetActive\"]/dl/dd[4]/a")
	private WebElement online_month_and_above;
	public WebElement getOnline_month_and_above() {
		return online_month_and_above;
	}
	
	@FindBy(xpath="(//a[contains(text(),' More ')])[2]")
	private WebElement Active_more_button;
	public WebElement getActive_more_button() {
		return Active_more_button;
	}
	
	@FindBy(xpath="//a[contains(text(),'Regular Search')]")
	private WebElement Regular_Search;
	public WebElement getRegular_Search() {
		return Regular_Search;
	}
	
	@FindBy(id="total_div")
	private WebElement profile_count;
	public WebElement getProfile_count() {
		return profile_count;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Next ')]")
	private WebElement next_btn;
	public WebElement getNext_btn() {
		return next_btn;
	}
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img")
	private WebElement logout_menu;
	public WebElement getLogout_menu() {
		return logout_menu;
	}
	
	
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	 
	//////////////////////////////   Advanced Search   ///////////
	
	@FindBy(id="physicalStatus2")
	private WebElement physical_status_doesntMatter;
	public WebElement getPhysical_status_doesntMatter() {
		return physical_status_doesntMatter;
	}
	
	@FindBy(id="physicalStatus0")
	private WebElement physical_status_normal;
	public WebElement getPhysical_status_normal() {
		return physical_status_normal;
	}
	
	
	@FindBy(id="physicalStatus1")
	private WebElement physical_status_physicallyChallenged;
	public WebElement getPhysical_status_physicallyChallenged() {
		return physical_status_physicallyChallenged;
	}
	
	@FindBy(id="starTemp")
	private WebElement star;
	public WebElement getStar() {
		return star;
	}
	
	@FindBy(id="star")
	private WebElement star_deselect;
	public WebElement getStar_deselect() {
		return star_deselect;
	}
	
	@FindBy(id="residentStatus")
	private WebElement residingStatus_any;
	public WebElement getResidingStatus_any() {
		return residingStatus_any;
	}
	
	@FindBy(id="residentStatus1")
	private WebElement residingStatus_citizen;
	public WebElement getResidingStatus_citizen() {
		return residingStatus_citizen;
	}
	
	@FindBy(id="residentStatus2")
	private WebElement residingStatus_permeanent_Permit;
	public WebElement getResidingStatus_permeanent_Permit() {
		return residingStatus_permeanent_Permit;
	}
	
	@FindBy(id="residentStatus3")
	private WebElement residingStatus_workPermit;
	public WebElement getResidingStatus_workPermit() {
		return residingStatus_workPermit;
	}
	
	
	@FindBy(id="residentStatus4")
	private WebElement residingStatus_studentVisa;
	public WebElement getResidingStatus_studentVisa() {
		return residingStatus_studentVisa;
	}
	
	@FindBy(id="residentStatus5")
	private WebElement residingStatus_temporary_permit;
	public WebElement getResidingStatus_temporary_permit() {
		return residingStatus_temporary_permit;
	}
	
	@FindBy(id="occupationTemp")
	private WebElement occupation;
	public WebElement getOccupation() {
		return occupation;
	}
	
	@FindBy(id="occupationTemp")
	private WebElement occupation_deselect;
	public WebElement getOccupation_deselect() {
		return occupation_deselect;
	}
	
	@FindBy(id="annualIncome")
	private WebElement annual_income;
	public WebElement getAnnual_income() {
		return annual_income;
	}
	
	////////////////    Life Style    ////////////////////////////
	
	       ////   Eating   ///
	    		 
	@FindBy(id="eating")
	private WebElement eating_habit_any;
	public WebElement getEating_habit_any() {
		return eating_habit_any;
	}
	

	@FindBy(id="eating1")
	private WebElement eating_habit_vegeteranian;
	public WebElement getEating_habit_vegeteranian() {
		return eating_habit_vegeteranian;
	}
	
	
	@FindBy(id="eating2")
	private WebElement eating_habit_non_vegeteranian;
	public WebElement getEating_habit_non_vegeteranian() {
		return eating_habit_non_vegeteranian;
	}
	
	@FindBy(id="eating3")
	private WebElement eating_habit_eggetarian;
	public WebElement getEating_habit_eggetarian() {
		return eating_habit_eggetarian;
	}
	
	@FindBy(id="eating4")
	private WebElement eating_habit_vegan;
	public WebElement getEating_habit_vegan() {
		return eating_habit_vegan;
	}
	
	//////////////   Drinking Habit   ////
	
	@FindBy(id="drinking")
	private WebElement drinking_habit_any;
	public WebElement getDrinking_habit_any() {
		return drinking_habit_any;
	}
	
	@FindBy(id="drinking1")
	private WebElement drinking_habit_non_drinker;
	public WebElement getDrinking_habit_non_drinker() {
		return drinking_habit_non_drinker;
	}
	
	@FindBy(id="drinking2")
	private WebElement drinking_habit_lightSocial;
	public WebElement getDrinking_habit_lightSocial() {
		return drinking_habit_lightSocial;
	}
	
	
	@FindBy(id="drinking3")
	private WebElement drinking_habit_regular_drinker;
	public WebElement getDrinking_habit_regular_drinker() {
		return drinking_habit_regular_drinker;
	}
	
	
	/////   Smoking Habits   //////
	@FindBy(id="smoking")
	private WebElement smoking_habit_any;
	public WebElement getSmoking_habit_any() {
		return smoking_habit_any;
	}
	
	@FindBy(id="smoking1")
	private WebElement smoking_habit_non_smoker;
	public WebElement getSmoking_habit_non_smoker() {
		return smoking_habit_non_smoker;
	}
	
	@FindBy(id="smoking2")
	private WebElement smoking_habit_light_smoker;
	public WebElement getSmoking_habit_light_smoker() {
		return smoking_habit_light_smoker;
	}
	
	@FindBy(id="smoking3")
	private WebElement smoking_habit_regular_smoker;
	public WebElement getSmoking_habit_regular_smoker() {
		return smoking_habit_regular_smoker;
	}
	
	//a[contains(text(),'Advanced Search')])[2]
	@FindBy(xpath="//*[@id=\"searchpop\"]/div[2]/div/div[1]/ul/li[2]/a")
	private WebElement advanced_search;
	public WebElement getAdvanced_search() {
		return advanced_search;
	}
	 
	//a[contains(text(),'Advanced Search')])[2]
	
	@FindBy(id="testspan")
	private WebElement refine_clear_all;
	public WebElement getRefine_clear_all() {
		return refine_clear_all;
	}
	
}
