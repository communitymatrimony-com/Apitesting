package com.ObjectRepository;



import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest_PP;



public class PP_Api_Pom extends BaseTest_PP{
	
	public PP_Api_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="lookingStatus1")
	private WebElement Marital_Unmarried;
	public WebElement getMarital_Unmarried() {
		return Marital_Unmarried;
	}
	
	@FindBy(id="lookingStatus2")
	private WebElement Marital_Widow;
	public WebElement getMarital_Widow() {
		return Marital_Widow;
	}

	@FindBy(id="lookingStatus3")
	private WebElement Marital_Divorced;
	public WebElement getMarital_Divorced() {
		return Marital_Divorced;
	}
	
	@FindBy(id="lookingStatus4")
	private WebElement Marital_Separated;
	public WebElement getMarital_Separated() {
		return Marital_Separated;
	}
	
	@FindBy(id="lookingStatus0")
	private WebElement Marital_DoesntMatter;
	public WebElement getMarital_DoesntMatter() {
		return Marital_DoesntMatter;
	}
	
	@FindBy(id="partnerHavechild0")
	private WebElement Children_DoesntMatter;
	public WebElement getChildren_DoesntMatter() {
		return Children_DoesntMatter;
	}
	
	
	@FindBy(id="partnerHavechild2")
	private WebElement Children_YesLiving;
	public WebElement getChildren_YesLiving() {
		return Children_YesLiving;
	}
	
	@FindBy(id="partnerHavechild3")
	private WebElement Children_YesNotLiving;
	public WebElement getChildren_YesNotLiving() {
		return Children_YesNotLiving;
	}
	
	
	@FindBy(id="partnerHavechild011")
	private WebElement Children_No;
	public WebElement getChildren_No() {
		return Children_No;
	}
	
	@FindBy(id="fage")
	private WebElement Age_From;
	public WebElement getAge_From() {
		return Age_From;
	}
	
	@FindBy(id="tage")
	private WebElement Age_To;
	public WebElement getAge_To() {
		return Age_To;
	}
	
	@FindBy(id="heightFrom")
	private WebElement Height_From;
	public WebElement getHeight_From() {
		return Height_From;
	}
	
	
	@FindBy(id="heightTo")
	private WebElement Height_To;
	public WebElement getHeight_To() {
		return Height_To;
	}
	
	@FindBy(id="physicalStatus2")
	private WebElement Physical_DoesntMatter;
	public WebElement getPhysical_DoesntMatter() {
		return Physical_DoesntMatter;
	}
	
	@FindBy(id="physicalStatus0")
	private WebElement Physical_Normal;
	public WebElement getPhysical_Normal() {
		return Physical_Normal;
	}
	
	
	@FindBy(id="physicalStatus")
	private WebElement Physical_Challenged;
	public WebElement getPhysical_Challenged() {
		return Physical_Challenged;
	}
	
	@FindBy(id="motherTongue")
	private WebElement Mother_Tongue;
	public WebElement getMother_Tongue() {
		return Mother_Tongue;
	}
	
	@FindBy(id="religion")
	private WebElement Religion;	
	public WebElement getReligion() {
		return Religion;
	}

	@FindBy(id="casteDivision")
	private WebElement Caste;
	public WebElement getCaste() {
		return Caste;
	}
	
	@FindBy(id="subCaste")
	private WebElement Sub_Caste;
	public WebElement getSub_Caste() {
		return Sub_Caste;
	}
	
	@FindBy(id="star")
	private WebElement Star;
	public WebElement getStar() {
		return Star;
	}
	
	@FindBy(id="gothram")
	private WebElement Gothram;
	public WebElement getGothram() {
		return Gothram;
	}
	
	@FindBy(id="manglik3")
	private WebElement Dosham_DoesntMatter;
	public WebElement getDosham_DoesntMatter() {
		return Dosham_DoesntMatter;
	}
	
	@FindBy(id="manglik1")
	private WebElement Dosham_Yes;
	public WebElement getDosham_Yes() {
		return Dosham_Yes;
	}
	
	@FindBy(id="manglik2")
	private WebElement Dosham_NO;
	public WebElement getDosham_NO() {
		return Dosham_NO;
	}
	
	
	@FindBy(id="educationTempradio1")
	private WebElement Education_Any;
	public WebElement getEducation_Any() {
		return Education_Any;
	}
	
	@FindBy(id="educationTempradio2")
	private WebElement Education_AnyDegree;
	public WebElement getEducation_AnyDegree() {
		return Education_AnyDegree;
	}
	
	
	@FindBy(id="educationTempradio3")
	private WebElement Education_Professional;
	public WebElement getEducation_Professional() {
		return Education_Professional;
	}
	
	
	@FindBy(id="educationTempradio4")
	private WebElement Education_Specific;
	public WebElement getEducation_Specific() {
		return Education_Specific;
	}
	
	@FindBy(id="education")
	private WebElement Education;
	public WebElement getEducation() {
		return Education;
	}
	
	@FindBy(id="occupation")
	private WebElement Occupation;
	public WebElement getOccupation() {
		return Occupation;
	}
	
	@FindBy(id="citizenship")
	private WebElement CitizenShip;
	public WebElement getCitizenShip() {
		return CitizenShip;
	}
	
	@FindBy(id="countryLivingIn")
	private WebElement Country_LivingIN;
	public WebElement getCountry_LivingIN() {
		return Country_LivingIN;
	}
	
	@FindBy(id="residingIndia")
	private WebElement Residing_State_India;
	public WebElement getResiding_State_India() {
		return Residing_State_India;
	}
	
	@FindBy(id="residingUSA")
	private WebElement Residing_State_USA;
	public WebElement getResiding_State_USA() {
		return Residing_State_USA;
	}
	
	
	@FindBy(id="eatingHabits1")
	private WebElement Eating_Vegetarian;
	public WebElement getEating_Vegetarian() {
		return Eating_Vegetarian;
	}
	
	@FindBy(id="eatingHabits2")
	private WebElement Eating_NonVegetarian;
	public WebElement getEating_NonVegetarian() {
		return Eating_NonVegetarian;
	}
	
	@FindBy(id="eatingHabits3")
	private WebElement Eating_Egg_tarian;
	public WebElement getEating_Egg_tarian() {
		return Eating_Egg_tarian;
	}
	
	@FindBy(id="eatingHabits4")
	private WebElement Eating_Vegan;
	public WebElement getEating_Vegan() {
		return Eating_Vegan;
	}
	
	@FindBy(id="eatingHabits0")
	private WebElement Eating_DoesntMatter;
	public WebElement getEating_DoesntMatter() {
		return Eating_DoesntMatter;
	}
	
	@FindBy(id="smokingHabits1")
	private WebElement Smoking_NonSmoker;
	public WebElement getSmoking_NonSmoker() {
		return Smoking_NonSmoker;
	}
	
	@FindBy(id="smokingHabits2")
	private WebElement Smoking_LightSmoker;
	public WebElement getSmoking_LightSmoker() {
		return Smoking_LightSmoker;
	}
	
	@FindBy(id="smokingHabits3")
	private WebElement Smoking_RegularSmoker;
	public WebElement getSmoking_RegularSmoker() {
		return Smoking_RegularSmoker;
	}
	
	@FindBy(id="smokingHabits0")
	private WebElement Smoking_DoesntMatter;
	public WebElement getSmoking_DoesntMatter() {
		return Smoking_DoesntMatter;
	}

	@FindBy(id="fromIncomeINR")
    private WebElement Annual_IncomeFrom;
	public WebElement getAnnual_IncomeFrom() {
		return Annual_IncomeFrom;
	}
	
	
	@FindBy(id="toIncomeINR")
	private WebElement Annual_IncomeTo;
	public WebElement getAnnual_IncomeTo() {
		return Annual_IncomeTo;
	}
	
	@FindBy(id="fromIncomeDOL")
	private WebElement Annual_IncomeFrom_Dollar;
	public WebElement getAnnual_IncomeFrom_Dollar() {
		return Annual_IncomeFrom_Dollar;
	}
	
	@FindBy(id="toIncomeDOL")
	private WebElement Annual_IncomeTo_Dollar;
	public WebElement getAnnual_IncomeTo_Dollar() {
		return Annual_IncomeTo_Dollar;
	}

	@FindBy(id="drinkingHabits1")
	private WebElement Drinking_NonDrinker;
	public WebElement getDrinking_NonDrinker() {
		return Drinking_NonDrinker;
	}
	
	@FindBy(id="drinkingHabits2")
	private WebElement Drinking_LightDrinker;
	public WebElement getDrinking_LightDrinker() {
		return Drinking_LightDrinker;
	}
	
	@FindBy(id="drinkingHabits3")
	private WebElement Drinking_RegularDrinker;
	public WebElement getDrinking_RegularDrinker() {
		return Drinking_RegularDrinker;
	}
	
	
	@FindBy(id="drinkingHabits0")
	private WebElement Drinking_DoesntMatter;
	public WebElement getDrinking_DoesntMatter() {
		return Drinking_DoesntMatter;
	}
	
	@FindBy(id="partnerDescription")
	private WebElement About_My_Partner;
	public WebElement getAbout_My_Partner() {
		return About_My_Partner;
	}

	@FindBy(id="btnSubmit")
	private WebElement Edit_PP_Save_Btn;
	public WebElement getEdit_PP_Save_Btn() {
		return Edit_PP_Save_Btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'More')]")
	private List<WebElement> Edit_PP_More_Btn;
	public List<WebElement> getEdit_PP_More_Btn() {
		return Edit_PP_More_Btn;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Marital Status - ')]//following::span[1]")
	private WebElement EditPPVaule_MaritalStatus;
	public WebElement getEditPPVaule_MaritalStatus() {
		return EditPPVaule_MaritalStatus;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Have Children - ')]//following::span[1]")
	private WebElement EditPPVaule_HaveChildren;
	public WebElement getEditPPVaule_HaveChildren() {
		return EditPPVaule_HaveChildren;
	}
	
	
	
	@FindBy(xpath="//span[contains(text(),'Age - ')]//following::span[1]")
	private WebElement EditPPVaule_Age;
	public WebElement getEditPPVaule_Age() {
		return EditPPVaule_Age;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Height - ')]//following::span[1]")
	private WebElement EditPPVaule_Height;
	public WebElement getEditPPVaule_Height() {
		return EditPPVaule_Height;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Mother Tongue - ')]//following::span[1]")
	private WebElement EditPPVaule_MotherTongue;
	public WebElement getEditPPVaule_MotherTongue() {
		return EditPPVaule_MotherTongue;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Physical Status - ')]//following::span[1]")
	private WebElement EditPPVaule_PhysicalStatus;
	public WebElement getEditPPVaule_PhysicalStatus() {
		return EditPPVaule_PhysicalStatus;
	}
	
	@FindBy(xpath="//span[contains(text(),'Eating Habits - ')]//following::span[1]")
	private WebElement EditPPVaule_Eatinghabit;
	public WebElement getEditPPVaule_Eatinghabit() {
		return EditPPVaule_Eatinghabit;
	}
	
	@FindBy(xpath="//span[contains(text(),'Drinking Habits - ')]//following::span[1]")
	private WebElement EditPPVaule_DrinkingHabit;
	public WebElement getEditPPVaule_DrinkingHabit() {
		return EditPPVaule_DrinkingHabit;
	}
	
	@FindBy(xpath="//span[contains(text(),'Smoking Habits - ')]//following::span[1]")
	private WebElement EditPPVaule_SmokingHabit;
	public WebElement getEditPPVaule_SmokingHabit() {
		return EditPPVaule_SmokingHabit;
	}
	
	@FindBy(xpath="//span[contains(text(),'Caste / Division - ')]//following::span[1]")
	private WebElement EditPPVaule_Caste_Division;
	public WebElement getEditPPVaule_Caste_Division() {
		return EditPPVaule_Caste_Division;
	}
	
	@FindBy(xpath="//span[contains(text(),'Subcaste - ')]//following::span[1]")
	private WebElement EditPPVaule_SubCaste;
	public WebElement getEditPPVaule_SubCaste() {
		return EditPPVaule_SubCaste;
	}
	
	@FindBy(xpath="//span[contains(text(),'Star - ')]//following::span[1]")
	private WebElement EditPPVaule_Star;
	public WebElement getEditPPVaule_Star() {
		return EditPPVaule_Star;
	}
	
	@FindBy(xpath="//span[contains(text(),'Gothram - ')]//following::span[1]")
	private WebElement EditPPVaule_Gothram;
	public WebElement getEditPPVaule_Gothram() {
		return EditPPVaule_Gothram;
	}
	
	@FindBy(xpath="//span[contains(text(),'Dosham - ')]//following::span[1]")
	private WebElement EditPPVaule_Dosham;
	public WebElement getEditPPVaule_Dosham() {
		return EditPPVaule_Dosham;
	}
	
	//span[contains(text(),'Religion - ')]//following::span[1]
	@FindBy(xpath="//span[contains(text(),'Religion - ')]//following::span[1]")
	private WebElement EditPPVaule_Religion;
	public WebElement getEditPPVaule_Religion() {
		return EditPPVaule_Religion;
	}

	
	
	
	@FindBy(xpath="//span[contains(text(),'Education - ')]//following::span[1]")
	private WebElement EditPPVaule_Education;
	public WebElement getEditPPVaule_Education() {
		return EditPPVaule_Education;
	}
	
	@FindBy(xpath="//span[contains(text(),'Occupation - ')]//following::span[1]")
	private WebElement EditPPVaule_Occupation;
	public WebElement getEditPPVaule_Occupation() {
		return EditPPVaule_Occupation;
	}
	
	@FindBy(xpath="//span[contains(text(),'Annual Income - ')]//following::span[1]")
	private WebElement EditPPVaule_AnnualIncome;
	public WebElement getEditPPVaule_AnnualIncome() {
		return EditPPVaule_AnnualIncome;
	}
	
	@FindBy(xpath="//span[contains(text(),'Citizenship - ')]//following::span[1]")
	private WebElement EditPPVaule_Citizenship;
	public WebElement getEditPPVaule_Citizenship() {
		return EditPPVaule_Citizenship;
	}
	
	@FindBy(xpath="//span[contains(text(),'Country - ')]//following::span[1]")
	private WebElement EditPPVaule_Country;
	public WebElement getEditPPVaule_Country() {
		return EditPPVaule_Country;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'State - ')]//following::span[1]")
	private WebElement EditPPVaule_State;
	public WebElement getEditPPVaule_State() {
		return EditPPVaule_State;
	}
	
	
	
}
