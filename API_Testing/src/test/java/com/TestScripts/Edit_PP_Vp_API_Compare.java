package com.TestScripts;



import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Base.BaseTest_PP;
import com.ObjectRepository.Gothram_pom;
import com.ObjectRepository.PP_Api_Pom;



public class Edit_PP_Vp_API_Compare extends BaseTest_PP{
	
	String[] MT_Split, Caste_Split, SubCaste_Split, Star_Split, Gothram_Split, Education_Split,
	Occupation_Split, Citizenship_Split, Country_Split, State_Split, City_Split,INCFrom_Split, INCTo_Split,
	Residing_State_India_Split,Residing_State_USA_Split,Religion_Split;
	
	String PP_Physical_Status,PP_Eating,PP_Drinking,PP_Smoking,PP_Subcaste,PP_Mother_Tongue,PP_Height,PP_Age,PP_Have_Chldren,PP_Marital_Status,
	PP_Star,PP_Education,PP_Occupation,PP_AnnualINcome,PP_Citizenship,PP_Country,Occupation, PP_Religion;
	
	String MotherTongueArray,SubCasteArray,StarArray,EducationArray,OccupationArray,CitizenSHipArray,CountryArray, ReligionArray;
	
	int AgeFrom, AgeTo, Age1;
	double HeightFron, HeightTo , Height1;
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	
	}
	
	
	@Test
	public void editing_PPValue() throws Throwable {
		
		Gothram_pom g = new Gothram_pom(driver);
		PP_Api_Pom e = new PP_Api_Pom(driver);
		//ViewProfile_POM v= new ViewProfile_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest_PP.click(g.getMatriID());
		BaseTest_PP.typeData(g.getMatriID(), "BRh2881285");
		BaseTest_PP.click(g.getPasswordClear());
		BaseTest_PP.typeData(g.getPassword(), "cbstest");
		BaseTest_PP.click(g.getLogin_btn());
		
		
		
		
		////////////// Intermediate Pages

		try {
			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
			if (photo_add.isDisplayed()) {
				photo_add.click();
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();

			}

		} catch (Exception e1) {
			System.out.println("Photo Page Skipped");
		}

		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();

			}
		} catch (Exception e1) {
			System.out.println("Intermediate pages handled");
		}

		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();

			}
		} catch (Exception e1) {
			System.out.println("Intermediate pages handled");
		}

		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();

			}
		} catch (Exception e1) {
			System.out.println("Intermediate pages handled");
		}

		try {
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		} catch (Exception e1) {
			System.out.println("No Intermediate pages");
		}

		// AD Pages
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e1) {
			System.out.println("ADs Closed Successfully");
		}
		
		try {
			Base.click(driver.findElement(By.xpath("/html/body/div[1]/div[1]/a")));
		} catch (Exception e5) {

		}
		try {
			BaseTest_PP.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			Base.click(driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[1]/div/div/div[3]/div[2]/div[2]/div[2]/div/div[3]/div[1]/ul/li[2]/a")));
			}catch(Exception e3) {
						
				
			}
			try {
				Base.click(driver.findElement(By.xpath(
						"/html/body/div[7]/div/div[2]/a/img")));
				}catch(Exception e4) {
							
					
				}
		Thread.sleep(2000);
		try {
			acc.moveToElement(g.getMenu_btn());
		} catch (Exception e2) {
		    acc.moveToElement(g.getMenu_btn1());
		}
		
		Thread.sleep(2000);
		acc.moveToElement(g.getEdit_Partner_Preference()).click().build().perform();
		
		BaseTest_PP.click(g.getPP_Edit_btn());
		
		String parent = driver.getWindowHandle();
		
////////////////////////////////////    Marital Status   ////////////////////////////////////		
		Thread.sleep(2000);
		if (BaseTest_PP.getExcelData("EditPP", 1, 1).contains("Unmarried")) {
			if(!e.getMarital_Unmarried().isSelected()) {
				BaseTest_PP.click(e.getMarital_Unmarried());
			} else {
				System.out.println("Unmarried Marital is Already Selected");
			}
			
		} else {}
		if (BaseTest_PP.getExcelData("EditPP", 1, 1).contains("Widow / Widower")) {
			if(!e.getMarital_Widow().isSelected()) {
				BaseTest_PP.click(e.getMarital_Widow());
			} else {
				System.out.println("Widow / Widower Marital is Already Selected");
			}
			
		} else {} 
		if (BaseTest_PP.getExcelData("EditPP", 1, 1).contains("Divorced")) {
			if(!e.getMarital_Divorced().isSelected()) {
				BaseTest_PP.click(e.getMarital_Divorced());
			} else {
				System.out.println("Divorced Marital is Already Selected");
			}
			
		} else {} 
		if (BaseTest_PP.getExcelData("EditPP", 1, 1).contains("Separated")) {
			if(!e.getMarital_Separated().isSelected()) {
				BaseTest_PP.click(e.getMarital_Separated());
			} else {
				System.out.println("Seperated Marital is Already Selected");
			}
						
		} else {}
		if (BaseTest_PP.getExcelData("EditPP", 1, 1).contains("Doesn't matter")) {
			if(!e.getMarital_DoesntMatter().isSelected()) {
				BaseTest_PP.click(e.getMarital_DoesntMatter());
			} else {
				System.out.println("Doesn't Matter Marital is Already Selected");
			}
		}	
	/////////////////////////////////////////   *  *  *  *  *   ///////////////////////////////	
		       /////////     Have Children  //////
		if (!e.getMarital_Unmarried().isSelected()||e.getMarital_Divorced().isSelected()||e.getMarital_Separated().isSelected()||e.getMarital_Widow().isSelected()||e.getMarital_DoesntMatter().isSelected()) {
			if (BaseTest_PP.getExcelData("EditPP", 1, 2).equals("Doesn't matter")) {
				if(!e.getChildren_DoesntMatter().isSelected()) {
					BaseTest_PP.click(e.getChildren_DoesntMatter());
				} else {
					System.out.println("Doesn't Matter Children Status is Already Selected");
				}
				
			} else if (BaseTest_PP.getExcelData("EditPP", 1, 2).equals("Yes. Living together")) {
				if(!e.getChildren_YesLiving().isSelected()) {
					BaseTest_PP.click(e.getChildren_YesLiving());
				} else {
					System.out.println("Yes Living Together Children Status is Already Selected");
				}
			} else if (BaseTest_PP.getExcelData("EditPP", 1, 2).equals("Yes. Not living together")) {
				if(!e.getChildren_YesNotLiving().isSelected()) {
					BaseTest_PP.click(e.getChildren_YesNotLiving());
				} else {
					System.out.println("Yes, Not Living Together Children Status is Already Selected");
				}
			} else {
				if(!e.getChildren_No().isSelected()) {
					BaseTest_PP.click(e.getChildren_No());
				} else {
					System.out.println("No Children Status is Already Selected");
				}
			}
		} else {
             System.out.println("Marital Status is UnMarried - So there is no Children Status to Display/Select");
		}
		
/////////////////////////////////////////////////////////////////////////////////		
		   /////  /////     AGE    ////   /////  
		
		
		BaseTest_PP.select_text(e.getAge_From(), BaseTest_PP.getExcelData("EditPP", 1, 3));
		BaseTest_PP.select_text(e.getAge_To(), BaseTest_PP.getExcelData("EditPP", 1, 4));
		
		////////////////////////   Height  /////////////////////////
		
		BaseTest_PP.select_text(e.getHeight_From(), BaseTest_PP.getExcelData("EditPP", 1, 5));
		BaseTest_PP.select_text(e.getHeight_To(), BaseTest_PP.getExcelData("EditPP", 1, 6));
		
		/////////////////////// Physical Status  ////////////////////////////
		if (BaseTest_PP.getExcelData("EditPP", 1, 8).equalsIgnoreCase("Doesn't matter")) {
			if (!e.getPhysical_DoesntMatter().isSelected()) {
				BaseTest_PP.click(e.getPhysical_DoesntMatter());
			} else {
                System.out.println("Physical Status - Doesn't Matter was Already Selected ");
			}
			
		} else if (BaseTest_PP.getExcelData("EditPP", 1, 8).equalsIgnoreCase("Normal")) {
			if (!e.getPhysical_Normal().isSelected()) {
				BaseTest_PP.click(e.getPhysical_Normal());
			} else {
				System.out.println("Physical Status - Normal was Already Selected ");
			}
			
		} else {
			if (!e.getPhysical_Challenged().isSelected()) {
				BaseTest_PP.click(e.getPhysical_Challenged());
			} else {
				System.out.println("Physical Status - Physically Challenged was Already Selected ");
			}
		}
		
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////  Mother Tongue  ////////////////////////
		
		//   If any Selected  -  Remove Any From DD and Choose Value
		
		String MotherTongue = BaseTest_PP.getExcelData("EditPP", 1, 7);	
		if (MotherTongue.contains(",")) {
			MT_Split = MotherTongue.split(", ");
			BaseTest_PP.select_deselectAll(e.getMother_Tongue());
			for (int i = 1; i < MT_Split.length; i++) {
				BaseTest_PP.select_text(e.getMother_Tongue(), MT_Split[i]);
			}
			
		}else {	
			BaseTest_PP.select_text(e.getMother_Tongue(), MotherTongue);
		}	
		///////////////   Religion  /////////////////////
	try {	
		String Religionn = BaseTest_PP.getExcelData("EditPP", 1, 29);	
		if (Religionn.contains(",")) {
			Religion_Split = MotherTongue.split(", ");
			BaseTest_PP.select_deselectAll(e.getReligion());
			for (int i = 1; i < Religion_Split.length; i++) {
				BaseTest_PP.select_text(e.getMother_Tongue(), Religion_Split[i]);
			}
			
		}else {	
			BaseTest_PP.select_text(e.getReligion(), Religionn);
		}	
	} catch (Exception e11) {
		System.out.println("There is no Religion Field to Choose");
	}
		/////////////   CAste   //////////////////////////
		try {
		String Caste = BaseTest_PP.getExcelData("EditPP", 1, 9);
		BaseTest_PP.select_deselectAll(e.getCaste());
		if (Caste.contains(", ")) {
			Caste_Split=Caste.split(", ");	
			
			for (int i = 0; i < Caste_Split.length; i++) {
				BaseTest_PP.select_text(e.getCaste(), Caste_Split[i]);
			}
			
		} else {	
			BaseTest_PP.select_text(e.getCaste(), Caste);
		}
		
		} catch (Exception e2) {
			System.out.println("There is no Caste Field to Choose");
		}
		
		///////////////////////  SUbCaste  ///////////////////
		try {
		String SubCaste = BaseTest_PP.getExcelData("EditPP", 1, 10);
		BaseTest_PP.select_deselectAll(e.getSub_Caste());
		if (SubCaste.contains(", ")) {
			SubCaste_Split=SubCaste.split(", ");
			for (int i = 0; i < SubCaste_Split.length; i++) {
				BaseTest_PP.select_text(e.getSub_Caste(), SubCaste_Split[i]);
			}
		} else {	
			BaseTest_PP.select_text(e.getSub_Caste(), SubCaste);
		}
			
		
		} catch (Exception e2) {
			System.out.println("There is no SubCaste Field to Choose");
		}
		
		/////////////////////   Star   /////////////////////
		try {	
		String Star = BaseTest_PP.getExcelData("EditPP", 1, 11);
		BaseTest_PP.select_deselectAll(e.getStar());

		if (Star.contains(", ")) {
			Star_Split=Star.split(", ");	
			for (int j = 0; j < Star_Split.length; j++) {
				BaseTest_PP.select_text(e.getStar(), Star_Split[j] );
			}			
		} else {	
			BaseTest_PP.select_text(e.getStar(), Star);
		}
				
		} catch (Exception e2) {
			System.out.println("There is no Star Field to Choose");
		}
		
		////////////////////////////  Gothram  //////////////
		try {
			String Gothram = BaseTest_PP.getExcelData("EditPP", 1, 12);
			BaseTest_PP.select_deselectAll(e.getGothram());
		if (Gothram.contains(", ")) {
			Gothram_Split= Gothram.split(", ");
			for (int i = 0; i < Gothram_Split.length; i++) {
				BaseTest_PP.select_text(e.getGothram(), Gothram_Split[i]);
			}
		} else {	
			BaseTest_PP.select_text(e.getGothram(), Gothram);
		}
				
		} catch (Exception e2) {
			System.out.println("There is no Gothram Field to Choose");
		}
//////////////////////////////////////////////////////////////////////////
		///////////////////   Dosham   ///////////////////
try {		
		if (BaseTest_PP.getExcelData("EditPP", 1, 13).equalsIgnoreCase("Doesn't matter")) {
			if (!e.getDosham_DoesntMatter().isSelected()) {
				BaseTest_PP.click(e.getDosham_DoesntMatter());
			} else {
                System.out.println("Dosham - Doesn't Matter was Already Selected ");
			}
			
		} else if (BaseTest_PP.getExcelData("EditPP", 1, 13).equalsIgnoreCase("Yes")) {
			if (!e.getDosham_Yes().isSelected()) {
				BaseTest_PP.click(e.getDosham_Yes());
			} else {
				System.out.println("Dosham - Yes was Already Selected ");
			}
			
		} else {
			if (!e.getDosham_NO().isSelected()) {
				BaseTest_PP.click(e.getDosham_NO());
			} else {
				System.out.println("Dosham - No was Already Selected ");
			}
		}
} catch (Exception e23) {
	
}	
//////////////////////////////////////////////////   Education   //////////////////////////////////
/*
String Education = BaseTest_PP.getExcelData("EditPP", 1, 15);

                         ////   ANY  /////
if (BaseTest_PP.getExcelData("EditPP", 1, 14).equalsIgnoreCase("Any")) {
	if (!e.getEducation_Any().isSelected()) {
		BaseTest_PP.click(e.getEducation_Any());
	} else {
        System.out.println("Education - Any was Already Selected ");
	}
	                  ////   ANY DEGREE  ///////
} else if (BaseTest_PP.getExcelData("EditPP", 1, 14).equalsIgnoreCase("Any Degree")) {
	if (!e.getEducation_AnyDegree().isSelected()) {
		BaseTest_PP.click(e.getEducation_AnyDegree());
	} else {
        System.out.println("Education - Any Degree was Already Selected ");
	}
	BaseTest_PP.select_deselectAll(e.getEducation());
	if (Education.contains(", ")) {
		Education_Split= Education.split(", ");
		for (int j = 0; j < Education_Split.length; j++) {
			BaseTest_PP.select_text(e.getEducation(), Education_Split[j]);
		}
	} else {	
		BaseTest_PP.select_text(e.getEducation(), Education);
	}
	
	
	            //////////   Professional Degree ////////
}	else if (BaseTest_PP.getExcelData("EditPP", 1, 14).equalsIgnoreCase("Professional Degree")) {
	if (!e.getEducation_Professional().isSelected()) {
		BaseTest_PP.click(e.getEducation_Professional());
	} else {
        System.out.println("Education - Professional Degree was Already Selected ");
	}
		BaseTest_PP.select_deselectAll(e.getEducation());
		if (Education.contains(", ")) {
			Education_Split= Education.split(", ");
			for (int j = 0; j < Education_Split.length; j++) {
				BaseTest_PP.select_text(e.getEducation(), Education_Split[j]);
			}
		} else {	
			BaseTest_PP.select_text(e.getEducation(), Education);
		}
		            /////////   Specific Degree  ////////
}  else if (BaseTest_PP.getExcelData("EditPP", 1, 14).equalsIgnoreCase("Specific Degree")) {
	if (!e.getEducation_Specific().isSelected()) {
		BaseTest_PP.click(e.getEducation_Specific());
	} else {
        System.out.println("Education - Specific Degree was Already Selected ");
	}
		BaseTest_PP.select_deselectAll(e.getEducation());
		if (Education.contains(", ")) {
			Education_Split= Education.split(", ");
			for (int j = 0; j < Education_Split.length; j++) {
				BaseTest_PP.select_text(e.getEducation(), Education_Split[j]);
			}
		} else {	
			BaseTest_PP.select_text(e.getEducation(), Education);
		}
		
	}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////
 //////////////////           Occupation  ////////////////////////
   String Occupation = BaseTest_PP.getExcelData("EditPP", 1, 18);
   BaseTest_PP.select_deselectAll(e.getOccupation());
   if (Occupation.contains(", ")) {
	   Occupation_Split=Occupation.split(", ");	
	   for (int i = 0; i <Occupation_Split.length; i++) {
			  BaseTest_PP.select_text(e.getOccupation(), Occupation_Split[i]);	
		}
} else {
	BaseTest_PP.select_text(e.getOccupation(), Occupation);
}
   
   
   
//////////////////////////////////////////////////////////////////////////////////////////////
     ///////////     CitizenSHip  //////
   String Citizenship = BaseTest_PP.getExcelData("EditPP", 1, 19);
   BaseTest_PP.select_deselectAll(e.getCitizenShip());
   if (Citizenship.contains(", ")) {
	   Citizenship_Split = Citizenship.split(", ");
	   for (int i = 0; i < Citizenship_Split.length; i++) {
		     BaseTest_PP.select_text(e.getCitizenShip(), Citizenship_Split[i]);	
		}
} else {  
	BaseTest_PP.select_text(e.getCitizenShip(), Citizenship);
}
    
   
   //////////////////////////////////////////////////////////////////////////////////////////////////
     /////////////////////////   Counrty Living  ////////////////
   String Coutry_Living = BaseTest_PP.getExcelData("EditPP", 1, 20);
   BaseTest_PP.select_deselectAll(e.getCountry_LivingIN());
   if (Coutry_Living.contains(", ")) {
	Country_Split=Coutry_Living.split(", ");
	  for (int i = 0; i < Country_Split.length; i++) {
			BaseTest_PP.select_text(e.getCountry_LivingIN(), Country_Split[i]);
		}
} else { 
	BaseTest_PP.select_text(e.getCountry_LivingIN(), Coutry_Living);
}

   
   
   ////////////////////////////////////////////////////////////////////////////////////////////////////////
try {           //////////////////         Residing State                 ////////////////////////////////////
   if (Coutry_Living.contains("India")) {
	   
	   String Residing_State_India = BaseTest_PP.getExcelData("EditPP", 1, 24);
	   BaseTest_PP.select_deselectAll(e.getResiding_State_India());
	   if (Residing_State_India.contains(",")) {
		Residing_State_India_Split= Residing_State_India.split(", ");
		for (int i = 0; i < Residing_State_India_Split.length; i++) {
			BaseTest_PP.select_text(e.getResiding_State_India(), Residing_State_India_Split[i]);
		}
	} else {
         BaseTest_PP.select_text(e.getResiding_State_India(), Residing_State_India);
	}	
} else if (Coutry_Living.contains("United States of America")) { 
	   String Residing_State_USA = BaseTest_PP.getExcelData("EditPP", 1, 25);
	   BaseTest_PP.select_deselectAll(e.getResiding_State_USA());
	   if (Residing_State_USA.contains(",")) {
		Residing_State_USA_Split= Residing_State_USA.split(", ");
		for (int i = 0; i < Residing_State_India_Split.length; i++) {
			BaseTest_PP.select_text(e.getResiding_State_USA(), Residing_State_India_Split[i]);
		}
	} else {
      BaseTest_PP.select_text(e.getResiding_State_India(), Residing_State_USA);
	}	
} else {
     System.out.println("Country Living Other Than India & USA	");
}
   //  Need to write for Both INDIA and USA were Selected  //
} catch (Exception e1) {
	// TODO: handle exception
}  
   
 ///////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////   Food Habits   /////////////////////////////////

   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Doesn't matter")) {
		if(!e.getEating_DoesntMatter().isSelected()) {
			BaseTest_PP.click(e.getEating_DoesntMatter());
		} else {
			System.out.println("Eating Habit - Doesn't Matter is Already Selected");
		}
		
	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Vegetarian")) {
 		if(!e.getEating_Vegetarian().isSelected()) {
 			BaseTest_PP.click(e.getEating_Vegetarian());
 		} else {
 			System.out.println("Eating Habit -Vegetarian is Already Selected");
 		}
 		
 	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Non vegetarian")) {
		if(!e.getEating_NonVegetarian().isSelected()) {
			BaseTest_PP.click(e.getEating_NonVegetarian());
		} else {
			System.out.println("Eating Habit - Non Vegetarian is Already Selected");
		}
		
	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Eggetarian")) {
		if(!e.getEating_Egg_tarian().isSelected()) {
			BaseTest_PP.click(e.getEating_Egg_tarian());
		} else {
			System.out.println("Eating Habit - Eggetarian is Already Selected");
		}
		
	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Vegan")) {
		if(!e.getEating_Vegan().isSelected()) {
			BaseTest_PP.click(e.getEating_Vegan());
		} else {
			System.out.println("Eating Habit -  Vegan   is Already Selected");
		}
		
	} else {} 
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	     ///////////          Smoking Habits      //////////////////////
	
	if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Doesn't matter")) {
		if(!e.getSmoking_DoesntMatter().isSelected()) {
			BaseTest_PP.click(e.getSmoking_DoesntMatter());
		} else {
			System.out.println("Smoking Habit - Doesn't Matter is Already Selected");
		}
		
	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Non-smoker")) {
 		if(!e.getSmoking_NonSmoker().isSelected()) {
 			BaseTest_PP.click(e.getSmoking_NonSmoker());
 		} else {
 			System.out.println("Smoking Habit - Non-Smoker is Already Selected");
 		}
 		
 	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Light / Social smoker")) {
		if(!e.getSmoking_LightSmoker().isSelected()) {
			BaseTest_PP.click(e.getSmoking_LightSmoker());
		} else {
			System.out.println("Eating Habit - Light / Social smoker is Already Selected");
		}
		
	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Regular smoker")) {
		if(!e.getSmoking_RegularSmoker().isSelected()) {
			BaseTest_PP.click(e.getSmoking_RegularSmoker());
		} else {
			System.out.println("Eating Habit - Regular smoker is Already Selected");
		}
		
	} else {} 
		
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////           Drinking Habits  ///////////////////////////////
	if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Doesn't matter")) {
		if(!e.getDrinking_DoesntMatter().isSelected()) {
			BaseTest_PP.click(e.getDrinking_DoesntMatter());
		} else {
			System.out.println("Smoking Habit - Doesn't Matter is Already Selected");
		}
		
	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Non-drinker")) {
 		if(!e.getDrinking_NonDrinker().isSelected()) {
 			BaseTest_PP.click(e.getDrinking_NonDrinker());
 		} else {
 			System.out.println("Smoking Habit - Non-Smoker is Already Selected");
 		}
 		
 	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Light / Social drinker")) {
		if(!e.getDrinking_LightDrinker().isSelected()) {
			BaseTest_PP.click(e.getDrinking_LightDrinker());
		} else {
			System.out.println("Eating Habit - Light / Social smoker is Already Selected");
		}
		
	} else {} 
   if (BaseTest_PP.getExcelData("EditPP", 1, 21).contains("Regular drinker")) {
		if(!e.getDrinking_RegularDrinker().isSelected()) {
			BaseTest_PP.click(e.getDrinking_RegularDrinker());
		} else {
			System.out.println("Eating Habit - Regular smoker is Already Selected");
		}
		
	} else {} 
   
   /////////////////////////////////////////////////////////////////////////////////////////////////
                             ///    Annual Income From   //////////////
   try {
       BaseTest_PP.select_text(e.getAnnual_IncomeFrom(), BaseTest_PP.getExcelData("EditPP", 1, 16));
   }    catch (Exception e2) {  System.out.println("Living Status is Not India");
	}
                    //////          Annual Income To   ///////////////////
       try {
    	   BaseTest_PP.select_text(e.getAnnual_IncomeTo(), BaseTest_PP.getExcelData("EditPP", 1, 17));
	} catch (Exception e2) {  System.out.println("Annual Income From is ANY or Less than 30K ");
	}

       //////////////////////////////   USA   ////////////////////////
       
       try {
           BaseTest_PP.select_text(e.getAnnual_IncomeFrom_Dollar(), BaseTest_PP.getExcelData("EditPP", 1, 26));
       }    catch (Exception e2) {  System.out.println("Living Status is Not India");
    	}
                        //////          Annual Income To   ///////////////////
           try {
        	   BaseTest_PP.select_text(e.getAnnual_IncomeTo_Dollar(), BaseTest_PP.getExcelData("EditPP", 1, 27));
    	} catch (Exception e2) {  System.out.println("Annual Income From is ANY or Less than 30$");
    	}

       ////////////////////////////////////////////////////////////////////////////////////////
            /////////////////////  About My Partner /////////////////////////////////
         BaseTest_PP.clear(e.getAbout_My_Partner());  
         BaseTest_PP.typeData(e.getAbout_My_Partner(), BaseTest_PP.getExcelData("EditPP", 1, 28));  
         
         BaseTest_PP.click(e.getEdit_PP_Save_Btn());
         
     ///////////////////////////////////////////////////////////////////////////////    
         Thread.sleep(5000);
         js.executeScript("window.scrollTo(300,0)");
         Thread.sleep(2000);
         List<WebElement> more_btn = driver.findElements(By.xpath("//a[@class='morelink clr6 font11']"));
         int size = more_btn.size();
         System.out.println(size);
         if (more_btn.size()>0) {
			for (int i = 1; i <size; i++) {
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,300)");
			    more_btn.get(i).click();
			}
		} else {
              System.out.println("No More Button");
		}
         
         
     /////////////////////////////////////////////////////////////////////////////
         
          PP_Marital_Status = e.getEditPPVaule_MaritalStatus().getText();
         System.out.println("Marital Status : "+PP_Marital_Status+"\n");
         
          PP_Have_Chldren = e.getEditPPVaule_HaveChildren().getText();
         System.out.println("Have Children : "+PP_Have_Chldren+"\n");

//////  AGE
          PP_Age = e.getEditPPVaule_Age().getText();
         System.out.println("Age : "+PP_Age+"\n");
         if (PP_Age.contains("to")) {
        	 String[] Ag = PP_Age.split("to");
        	 String AgeFro = Ag[0].toString().trim();
        	  AgeFrom = Integer.parseInt(AgeFro);
        	  System.out.println("Age From : "+AgeFrom);
        	  
        	  String[] AgeT = Ag[1].split("Yrs");
        	  String AgeT0= AgeT[0].toString().trim();
        	  AgeTo = Integer.parseInt(AgeT0);
			System.out.println("Age To : "+AgeTo);
			
		} else { }
////////  Height          
          PP_Height = e.getEditPPVaule_Height().getText();
         System.out.println("Height : "+PP_Height+"\n");
         if (PP_Height.contains("to")) {
			String[] HeightF = PP_Height.split("to");
			String HeightFr = HeightF[0].toString().trim();
			String HeighttO = HeightF[1].toString().trim();
	/////////  Height From 		
			if (HeightFr.contains("in")) {
				String[] HeightFrO = HeightFr.split("ft");
				String HrightFRO = HeightFrO[0].toString().trim();
				
				String[] HeightfRO = HeightFrO[1].split("in");
				String HeightfrO = HeightfRO[0].toString().trim();
				String HeightFRo = HrightFRO+"."+HeightfrO;
				HeightFron = Float.parseFloat(HeightFRo);
			//	HeightFron=Math.ceil(HeightFron);
				System.out.println("Height From : "+HeightFron);
				
			} else {
				String[] HeighFrO = HeightFr.split("ft");
				String HeightFrOO = HeighFrO[0].toString().trim();
			    HeightFron = Float.parseFloat(HeightFrOO);
			  //  HeightFron=Math.ceil(HeightFron);
			    System.out.println("Height From : "+HeightFrOO);
				
				
			}
			
	////////  Height TO		
			if (HeighttO.contains("in")) {
				String[] HeightFrO = HeighttO.split("ft");
				String HrightFRO = HeightFrO[0].toString().trim();
				
				String[] HeightfRO = HeightFrO[1].split("in");
				String HeightfrO = HeightfRO[0].toString().trim();
				String HeightFRo = HrightFRO+"."+HeightfrO;
				HeightTo = Float.parseFloat(HeightFRo);
			//	HeightTo=Math.ceil(HeightTo);
				System.out.println("HeightTo : "+HeightTo);
				
			} else {
				String[] HeighFrO = HeighttO.split("ft");
				String HeightFrOO = HeighFrO[0].toString().trim();
				HeightTo = Float.parseFloat(HeightFrOO);
				//HeightTo=Math.ceil(HeightTo);
			    System.out.println("Height To : "+HeightTo);
				
				
			}
			
			
			
		}

         /////////////
          PP_Mother_Tongue = e.getEditPPVaule_MotherTongue().getText();
         System.out.println("Mother_Tongue : "+PP_Mother_Tongue+"\n");
         if (PP_Mother_Tongue.contains(",")) {
			String[] MotherTonhue_Arr = PP_Mother_Tongue.split(",");
			for (int i = 0; i < MotherTonhue_Arr.length; i++) {
				 MotherTongueArray = MotherTonhue_Arr[i].toString().trim();
				System.out.println("Mother Tongues :"+MotherTongueArray);
			}
			
		}
         
         
          PP_Physical_Status = e.getEditPPVaule_PhysicalStatus().getText();
         System.out.println("Physical Status :"+PP_Physical_Status+"\n");
         
          PP_Eating = e.getEditPPVaule_Eatinghabit().getText();
         System.out.println("Eating Habit : "+PP_Eating+"\n");
           
          PP_Drinking = e.getEditPPVaule_DrinkingHabit().getText();
         System.out.println("Drinking Habit : "+PP_Drinking+"\n");
         
          PP_Smoking =e.getEditPPVaule_SmokingHabit().getText();
         System.out.println("Smoking Habit : "+PP_Smoking+"\n");
         try {
        	 PP_Religion = e.getEditPPVaule_Religion().getText();
             System.out.println("Religion : "+PP_Religion+"\n");
             if (PP_Religion.contains(",")) {
            	 String[] Religion_Arr = PP_Religion.split(",");
    			for (int i = 0; i < Religion_Arr.length; i++) {
    				 ReligionArray= Religion_Arr[i].toString().trim();
    				System.out.println("Religion's :"+ReligionArray);
    			}
    			
    		}
		} catch (Exception e2) {
			System.out.println("No religion field is present");
		}
        
			
	
         
          PP_Subcaste = e.getEditPPVaule_SubCaste().getText();
         System.out.println("SubCaste : "+PP_Subcaste+"\n");
         if (PP_Subcaste.contains(",")) {
 			String[] SubCAste_Arr = PP_Subcaste.split(",");
 			for (int i = 0; i < SubCAste_Arr.length; i++) {
 				 SubCasteArray = SubCAste_Arr[i].toString().trim();
 				System.out.println("SubCaste's :"+SubCasteArray);
 			}
 			
 		}
         // ,
          PP_Star = e.getEditPPVaule_Star().getText();
         System.out.println("Star : "+PP_Star+"\n");
         if (PP_Star.contains(",")) {
 			String[] Star_Arr = PP_Star.split(",");
 			for (int i = 0; i < Star_Arr.length; i++) {
 				 StarArray = Star_Arr[i].toString().trim();
 				System.out.println("Star's :"+StarArray);
 			}
 			
 		}
         
          PP_Education = e.getEditPPVaule_Education().getText();
         System.out.println("Education : "+PP_Education+"\n");
         if (PP_Education.contains(",")) {
 			String[] Education_Arr = PP_Education.split(",");
 			for (int i = 0; i < Education_Arr.length; i++) {
 				 EducationArray = Education_Arr[i].toString().trim();
 				System.out.println("Education's :"+EducationArray);
 			}
 			
 		}
         
          PP_Occupation = e.getEditPPVaule_Occupation().getText();
         System.out.println("Occupation : "+PP_Occupation+"\n");
         if (PP_Occupation.contains(",")) {
 			String[] Occupation_Arr = PP_Occupation.split(",");
 			for (int i = 0; i < Occupation_Arr.length; i++) {
 				 OccupationArray = Occupation_Arr[i].toString().trim();
 				System.out.println("Occupation's :"+OccupationArray);
 			}
 			
 		}
         
          PP_AnnualINcome = e.getEditPPVaule_AnnualIncome().getText();
         System.out.println("Occupation : "+PP_AnnualINcome+"\n");
         
         	
          PP_Citizenship = e.getEditPPVaule_Citizenship().getText();
         System.out.println("Citizenship : "+PP_Citizenship+"\n");
         if (PP_Citizenship.contains(",")) {
 			String[] Citizenship_Arr = PP_Citizenship.split(",");
 			for (int i = 0; i < Citizenship_Arr.length; i++) {
 				 CitizenSHipArray = Citizenship_Arr[i].toString().trim();
 				System.out.println("CitizenShip's :"+CitizenSHipArray);
 			}
 			
 		}
         
         
          PP_Country = e.getEditPPVaule_Country().getText();
         System.out.println("Country : "+PP_Country+"\n");
         if (PP_Country.contains(",")) {
 			String[] Country_Arr = PP_Country.split(",");
 			for (int i = 0; i < Country_Arr.length; i++) {
 				 CountryArray = Country_Arr[i].toString().trim();
 				System.out.println("Occupation's :"+CountryArray);
 			}
 			
 		}
         
         /////////////////////////////////////////////////////////////////////////////////
         
         
         
   
         
	}
	}
