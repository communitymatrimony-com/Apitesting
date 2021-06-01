

package com.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class edit_pom_app {
	AndroidDriver driver;

	public edit_pom_app(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBasic_details_edit_btn() {
		return Basic_details_edit_btn;
	}

	public WebElement getProfile_created() {
		return profile_created;
	}

	public WebElement getParents_Click() {
		return parents_Click;
	}

	public WebElement getName_field() {
		return name_field;
	}

	public WebElement getHeight_btn() {
		return height_btn;
	}

	public WebElement getHeight_Value() {
		return height_Value;
	}

	public WebElement getWeight_btn() {
		return weight_btn;
	}

	public WebElement getWeight_value() {
		return weight_value;
	}

	public WebElement getBody_type_btn() {
		return body_type_btn;
	}

	public WebElement getBody_type_Value() {
		return body_type_Value;
	}

	public WebElement getComplexion_type_btn() {
		return complexion_type_btn;
	}

	public WebElement getComplexion_type_value() {
		return complexion_type_value;
	}

	public WebElement getPhysical_type_btn() {
		return physical_type_btn;
	}

	public WebElement getPhysical_type_value() {
		return physical_type_value;
	}

	public WebElement getLanguages_known_btn() {
		return languages_known_btn;
	}

	public WebElement getLanguages_known_Value() {
		return languages_known_Value;
	}

	public WebElement getEdit_Number_btn() {
		return Edit_Number_btn;
	}

	public WebElement getEdit_Number_txt() {
		return Edit_Number_txt;
	}

	public WebElement getEdit_Number_txt_submit() {
		return Edit_Number_txt_submit;
	}

	@FindBy(xpath = "//*[@id='tvEditNumber']")
	private WebElement Edit_Number_btn;
	@FindBy(xpath = "//*[@id='edit_mobile_editText']")
	private WebElement Edit_Number_txt;
	@FindBy(xpath="//*[@id='iv_submit_mobileno']")
	private WebElement Edit_Number_txt_submit;

	@FindBy(xpath = "//*[@text='LOGIN']")
	private WebElement main_Login1;

	@FindBy(xpath = "//*[@id='matriid_from_login_layout']")
	private WebElement Enter_matri_Id1;

	@FindBy(xpath = "//*[@id='pass__from_login_layout']")
	private WebElement Enter_password1;

	@FindBy(xpath = "//*[@id='login_btn_from_login_layout']")
	private WebElement Enter_Login1;

	@FindBy(xpath = "(//*[@id='icon'])[5]")
	private WebElement main_menu;

	@FindBy(xpath = "//*[@text='Edit Profile']")
	private WebElement Edit_Profile_btn;

	@FindBy(xpath = "//*[@id='moreabtme_edit']")
	private WebElement personal_lines_edit_btn;

	@FindBy(xpath = "//*[@id='aboutmedesc']")
	private WebElement description_edit;

	@FindBy(xpath = "//*[@id='save']")
	private WebElement save_btn;
	@FindBy(xpath = "//*[@id='basicdetails_edit']")
	private WebElement Basic_details_edit_btn;
	@FindBy(xpath = "//*[@id='edit_txt_profile_created_by_value']")
	private WebElement profile_created;
	@FindBy(xpath = "//*[@text='Parents']")
	private WebElement parents_Click;
	@FindBy(xpath = "//*[@id='edit_edt_name_value']")
	private WebElement name_field;

	@FindBy(xpath = "//*[@id='edit_txt_height_value']")
	private WebElement height_btn;
	@FindBy(xpath = "//*[@text='5ft 5in / 165 cm']")
	private WebElement height_Value;
	@FindBy(xpath = "//*[@id='edit_txt_weight_value']")
	private WebElement weight_btn;
	@FindBy(xpath = "//*[@text='45 kg']")
	private WebElement weight_value;
	@FindBy(xpath = "//*[@id='edit_txt_body_type_value']")
	private WebElement body_type_btn;
	@FindBy(xpath = "//*[@text='Athletic' and @id='value_textView']")
	private WebElement body_type_Value;
	@FindBy(xpath = "//*[@id='edit_txt_complexion_value']")
	private WebElement complexion_type_btn;
	@FindBy(xpath = "(//*[@id='value_textView'])[2]")
	private WebElement complexion_type_value;
	@FindBy(xpath = "//*[@id='edit_txt_physical_status_value']")
	private WebElement physical_type_btn;

	@FindBy(xpath = "//*[@text='Normal' and @id='value_textView']")
	private WebElement physical_type_value;

	@FindBy(xpath = "//*[@id='edit_txt_languages_selected_value']")
	private WebElement languages_known_btn;

	@FindBy(xpath = "//*[@text='Malayalam']")
	private WebElement languages_known_Value;

	@FindBy(xpath =
"//*[@id='search_ok_imageView']")//*[@id='reg_search_editText']
	private WebElement select_ok_btn;
	@FindBy(xpath = "//*[@id='search_editText']")
	private WebElement search_checkbox_btn;
	@FindBy(xpath = "//*[@id='value_textView']")
	private WebElement Value_select;
	// *****************religious Information*****************//

	public WebElement getValue_select() {
		return Value_select;
	}

	public WebElement getFilter_refine_btn() {
		return filter_refine_btn;
	}

	public WebElement getSearch_checkbox_btn() {
		return search_checkbox_btn;
	}

	@FindBy(xpath = "//*[@id='religiousdetails_edit']")
	private WebElement religious_detilas_btn;

	@FindBy(xpath = "//*[@id='edit_txt_star_value']")
	private WebElement star_btn;
	@FindBy(xpath = "//*[@id='reg_search_editText']")
	private WebElement search_edit_btn;
	@FindBy(xpath = "//*[@text='Ashwini / Ashwathi' and @id='value_textView']")
	private WebElement star_value_btn;
	@FindBy(xpath = "//*[@id='edit_txt_raasi_value']")
	private WebElement rasi_btn;
	@FindBy(xpath = "//*[@text='Kumbh (Aquarius)']")
	private WebElement rasi_value_btn;
	@FindBy(xpath = "//*[@id='edit_edt_gothra_value']")
	private WebElement gothram_btn;

	@FindBy(xpath = "//*[@id='edit_txt_dhosam_value']")
	private WebElement dosham_btn;

	@FindBy(xpath = "//*[@text='Yes' and @id='value_textView']")
	private WebElement dosham_value_btn;
	@FindBy(xpath = "//*[@id='value_textView']")
	private WebElement star_select_value_btn;
//**********************professional***********************//
	@FindBy(xpath = "//*[@id='professionalinfo_edit']")
	private WebElement professional_info_btn;

	@FindBy(xpath = "//*[@id='edit_txt_education_category_value']")
	private WebElement Education_btn;

	@FindBy(xpath = "//*[@text='B.Ed.']")
	private WebElement Education_value_btn;

	@FindBy(xpath = "//*[@id='edit_edt_education_detail_value']")
	private WebElement Education_Detail_btn;

	@FindBy(xpath = "//*[@id='edit_edt_college_value']")

	private WebElement College_Detail_btn;

	@FindBy(xpath = "//*[@id='edit_txt_employed_in_value']")
	private WebElement Employed_btn;

	public WebElement getEmployed_Value_btn() {
		return Employed_Value_btn;
	}

	@FindBy(xpath = "//*[@text='Private']")
	private WebElement Employed_Value_btn;

	@FindBy(xpath = "//*[@id='edit_txt_occupation_value']")
	private WebElement Occupation_btn;

	@FindBy(xpath = "//*[@text='Administrative Professional']")
	private WebElement Occupation_Value_btn;


	@FindBy(xpath = "//*[@id='edit_edt_occupation_detail_value']")
	private WebElement Occupation_detail_btn;

	@FindBy(xpath = "//*[@id='edit_txt_currency_value']")
	private WebElement Currency_btn;

	@FindBy(xpath = "//*[@id='edit_edt_annual_income_value']")
	private WebElement annual_income;

	@FindBy(xpath = "//*[@id='reg_search_editText']")
	private WebElement reg_search_btn;

	@FindBy(xpath = "//*[@text='India - Rs.']")
	private WebElement India_Value_btn;

	@FindBy(xpath = "//*[@text='5 - 6 Lakhs']")
	private WebElement Annual_Income_Value_btn;

	//**************loacation*******************//

	@FindBy(xpath = "//*[@id='location_edit']")
	private WebElement location_edit_btn;

	@FindBy(xpath = "//*[@id='edit_txt_country_value']")
	private WebElement country_living_btn;

	@FindBy(xpath = "//*[@text='India' and @id='value_textView']")
	private WebElement country_living_Value_btn;

	@FindBy(xpath = "//*[@id='edit_txt_residing_state_value']")
	private WebElement residing_state_btn;

	@FindBy(xpath = "//*[@text='Andhra Pradesh']")
	private WebElement residing_sate_Value_btn;

	@FindBy(xpath = "//*[@id='edit_txt_residing_city_value']")
	private WebElement residing_city_btn;

	@FindBy(xpath = "//*[@text='Anantapur']")
	private WebElement residing_city_Value_btn;

	@FindBy(xpath = "//*[@id='edit_txt_citizenship_value']")
	private WebElement citizen_btn;

	@FindBy(xpath = "//*[@text='India' and @id='value_textView']")

	private WebElement citizen_Value_btn;

	//***********family Info*************//

	@FindBy(xpath = "//*[@id='memberfamilyinfo_edit']")
	private WebElement family_info_btn;

	@FindBy(xpath = "//*[@id='edit_txt_family_value']")
	private WebElement Family_btn;

	@FindBy(xpath = "//*[@text='Moderate']")
	private WebElement Family_Value_btn;

	@FindBy(xpath = "//*[@id='edit_txt_family_type_value']")
	private WebElement Family_type_btn;

	@FindBy(xpath = "//*[@text='Joint family']")
	private WebElement Family_type_Value_btn;

	@FindBy(xpath = "//*[@id='edit_txt_family_status_value']")
	private WebElement Family_status_btn;

	@FindBy(xpath = "//*[@text='Upper middle class']")
	private WebElement Family_staus_Value_btn;

	@FindBy(xpath = "//*[@id='edit_edt_father_occupation_value']")
	private WebElement father_occupation_Value_btn;

	@FindBy(xpath = "//*[@id='edit_edt_mother_occupation_value']")
	private WebElement mother_occupation_Value_btn;

	@FindBy(xpath = "//*[@id='edit_txt_brothers_value']")
	private WebElement brother_btn;

	@FindBy(xpath = "//*[@text='2']")
	private WebElement brother_Value_btn;
	@FindBy(xpath = "//*[@id='edit_txt_brothers_married_value']")
	private WebElement brother_married_btn;
	@FindBy(xpath = "(//*[@id='value_textView'])[7]")
	private WebElement brother_married_value_btn;
	@FindBy(xpath = "//*[@id='edit_txt_sisters_value']")
	private WebElement sister_btn;
	@FindBy(xpath = "//*[@text='1']")
	private WebElement sister_value_btn;

	@FindBy(xpath = "//*[@id='edit_txt_sisters_married_value']")
	private WebElement sister_married_btn;

	@FindBy(xpath = "(//*[@id='value_textView'])[1]")
	private WebElement sister_married_value_btn;


	@FindBy(xpath = "//*[@id='edit_edt_family_origin_value']")
	private WebElement ancstor_btn;

	//***********habits*******************//
	@FindBy(xpath = "//*[@id='habits_edit']")
	private WebElement habits_edit_btn;
	@FindBy(xpath = "//*[@id='edit_txt_eating_habits_value']")
	private WebElement eating_habits_btn;

	@FindBy(xpath = "//*[@text='Non vegetarian']")
	private WebElement Eating_habits_value_btn;
	@FindBy(xpath = "//*[@id='edit_txt_drinking_habits_value']")
	private WebElement drinking_habits_btn;
	@FindBy(xpath = "//*[@text='Non-drinker']")
	private WebElement drinking_habits_value_btn;
	@FindBy(xpath = "//*[@id='edit_txt_smoking_habits_value']")
	private WebElement smoking_habits_btn;
	@FindBy(xpath = "//*[@text='Non-smoker']")
	private WebElement smoking_habits_value_btn;

	//*****************life style*************//
	@FindBy(xpath = "//*[@id='memberlifestyle_edit']")
	private WebElement lifestyle_edit_btn;

	@FindBy(xpath = "//*[@id='edit_txt_hobbies_selected_value']")
	private WebElement hobbies_btn;

	@FindBy(xpath = "//*[@text='Art / Handicraft']")
	private WebElement hobbies_value_btn;

	/*@FindBy(xpath = "//*[@id='search_ok_imageView']")
	private WebElement eating_habits_value_btn;


	@FindBy(xpath = "//*[@text='Non vegetarian' and @id='value_textView']")
	private WebElement eating_habits_value_btn;
	@FindBy(xpath = "//*[@text='Non vegetarian' and @id='value_textView']")
	private WebElement eating_habits_value_btn;

	@FindBy(xpath = "//*[@text='Non vegetarian' and @id='value_textView']")
	private WebElement eating_habits_value_btn;*/

	@FindBy(xpath = "//*[@id='tv_filter_refine']")
	private WebElement filter_refine_btn;


	/*@FindBy(xpath = "//*[@text='Art / Handicraft']")
	private WebElement hobbies_value_btn;

	@FindBy(xpath = "//*[@text='Art / Handicraft']")
	private WebElement hobbies_value_btn;*/





	public WebElement getHabits_edit_btn() {
		return habits_edit_btn;
	}

	public WebElement getLifestyle_edit_btn() {
		return lifestyle_edit_btn;
	}

	public WebElement getHobbies_btn() {
		return hobbies_btn;
	}

	public WebElement getHobbies_value_btn() {
		return hobbies_value_btn;
	}

	public WebElement getEating_habits_btn() {
		return eating_habits_btn;
	}

	public WebElement getEating_habits_value_btn() {
		return Eating_habits_value_btn;
	}

	public WebElement getDrinking_habits_btn() {
		return drinking_habits_btn;
	}

	public WebElement getDrinking_habits_value_btn() {
		return drinking_habits_value_btn;
	}

	public WebElement getSmoking_habits_btn() {
		return smoking_habits_btn;
	}

	public WebElement getSmoking_habits_value_btn() {
		return smoking_habits_value_btn;
	}

	public WebElement getFamily_info_btn() {
		return family_info_btn;
	}

	public WebElement getFamily_btn() {
		return Family_btn;
	}

	public WebElement getFamily_Value_btn() {
		return Family_Value_btn;
	}

	public WebElement getFamily_type_btn() {
		return Family_type_btn;
	}

	public WebElement getFamily_type_Value_btn() {
		return Family_type_Value_btn;
	}

	public WebElement getFamily_status_btn() {
		return Family_status_btn;
	}

	public WebElement getFamily_staus_Value_btn() {
		return Family_staus_Value_btn;
	}

	public WebElement getFather_occupation_Value_btn() {
		return father_occupation_Value_btn;
	}

	public WebElement getMother_occupation_Value_btn() {
		return mother_occupation_Value_btn;
	}

	public WebElement getBrother_btn() {
		return brother_btn;
	}

	public WebElement getBrother_Value_btn() {
		return brother_Value_btn;
	}

	public WebElement getBrother_married_btn() {
		return brother_married_btn;
	}

	public WebElement getBrother_married_value_btn() {
		return brother_married_value_btn;
	}

	public WebElement getSister_btn() {
		return sister_btn;
	}

	public WebElement getSister_value_btn() {
		return sister_value_btn;
	}

	public WebElement getSister_married_btn() {
		return sister_married_btn;
	}

	public WebElement getSister_married_value_btn() {
		return sister_married_value_btn;
	}

	public WebElement getAncstor_btn() {
		return ancstor_btn;
	}

	public WebElement getLocation_edit_btn() {
		return location_edit_btn;
	}

	public WebElement getCountry_living_btn() {
		return country_living_btn;
	}

	public WebElement getCountry_living_Value_btn() {
		return country_living_Value_btn;
	}

	public WebElement getResiding_state_btn() {
		return residing_state_btn;
	}

	public WebElement getResiding_sate_Value_btn() {
		return residing_sate_Value_btn;
	}

	public WebElement getResiding_city_btn() {
		return residing_city_btn;
	}

	public WebElement getResiding_city_Value_btn() {
		return residing_city_Value_btn;
	}

	public WebElement getCitizen_btn() {
		return citizen_btn;
	}

	public WebElement getCitizen_Value_btn() {
		return citizen_Value_btn;
	}

	public WebElement getStar_select_value_btn() {
		return star_select_value_btn;
	}

	public WebElement getAnnual_Income_Value_btn() {
		return Annual_Income_Value_btn;
	}

	public WebElement getOccupation_detail_btn() {
		return Occupation_detail_btn;
	}

	public WebElement getProfessional_info_btn() {
		return professional_info_btn;
	}

	public WebElement getEducation_btn() {
		return Education_btn;
	}

	public WebElement getEducation_value_btn() {
		return Education_value_btn;
	}

	public WebElement getEducation_Detail_btn() {
		return Education_Detail_btn;
	}

	public WebElement getCollege_Detail_btn() {
		return College_Detail_btn;
	}

	public WebElement getEmployed_btn() {
		return Employed_btn;
	}

	public WebElement getOccupation_btn() {
		return Occupation_btn;
	}

	public WebElement getOccupation_Value_btn() {
		return Occupation_Value_btn;
	}

	public WebElement getCurrency_btn() {
		return Currency_btn;
	}

	public WebElement getAnnual_income() {
		return annual_income;
	}

	public WebElement getReg_search_btn() {
		return reg_search_btn;
	}

	public WebElement getIndia_Value_btn() {
		return India_Value_btn;
	}

	public WebElement getReligious_detilas_btn() {
		return religious_detilas_btn;
	}

	public WebElement getStar_btn() {
		return star_btn;
	}

	public WebElement getSearch_edit_btn() {
		return search_edit_btn;
	}

	public WebElement getStar_value_btn() {
		return star_value_btn;
	}

	public WebElement getRasi_btn() {
		return rasi_btn;
	}

	public WebElement getRasi_value_btn() {
		return rasi_value_btn;
	}

	public WebElement getGothram_btn() {
		return gothram_btn;
	}

	public WebElement getDosham_btn() {
		return dosham_btn;
	}

	public WebElement getDosham_value_btn() {
		return dosham_value_btn;
	}

	// *********************religious**********************//
	public WebElement getSelect_ok_btn() {
		return select_ok_btn;
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getMain_menu() {
		return main_menu;
	}

	public WebElement getEdit_Profile_btn() {
		return Edit_Profile_btn;
	}

	public WebElement getPersonal_lines_edit_btn() {
		return personal_lines_edit_btn;
	}

	public WebElement getDescription_edit() {
		return description_edit;
	}

	public WebElement getSave_btn() {
		return save_btn;
	}

	public WebElement getMain_Login1() {
		return main_Login1;
	}

	public WebElement getEnter_matri_Id1() {
		return Enter_matri_Id1;
	}

	public WebElement getEnter_password1() {
		return Enter_password1;
	}

	public WebElement getEnter_Login1() {
		return Enter_Login1;
	}
}


