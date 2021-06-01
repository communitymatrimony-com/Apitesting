package com.TestScripts;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.Base;
import com.ObjectRepository.ProfileViewNotContacted;
import com.ObjectRepository.Search;
import com.ObjectRepository.inbox_POM;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Opp_View_Profile_API extends Base {

	WebDriver driver;
	String Requested_Id = null;
	String requested_deatils = null;
	String matid, asd, ageFro, ageT, maritalStatus, mariedstatus1, Religion, Religion1, Caste, Caste1, SubCaste,
           SubCaste1, Education, Education1, country1, Occupation, mtongue, oppid,PP_Any,PP_smokinghabits,PP_Drinkinghabits,PP_Eatinghabits;
	int ageFrom, ageTo, ageFrom1, ageTo1, i, total, age1, a, agef,page_cou;
	float heightFrom, heightFrom1, heightTo, heightTo1, heightFrom2, heightTo2, Height;
	double ppcmsfrom, ppcmsfrom1;
	String[] arr, arr1, arr2, arr3, arr5;
	@Test
	public void viewpro() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.get("https://www.communitymatrimony.com");
		SoftAssert asrt = new SoftAssert();
		inbox_POM i = new inbox_POM(driver);
		Actions acc = new Actions(driver);
		Search s = new Search(driver);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Base.click(i.getMatriId());
			Base.typeData(i.getMatriId(), "BRH3003552");

			Base.click(i.getPaswwordclr());
			Base.typeData(i.getPassword(), "cbstest");

			Base.click(i.getLoginbtn());
		} catch (Exception e) {
			System.out.println("Already Logged In");
		}
		////////////// Intermediate Pages

		try {
			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
			if (photo_add.isDisplayed()) {
				photo_add.click();
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();

			}

		} catch (Exception e) {
			System.out.println("Photo Page Skipped");
		}

		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}

		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}

		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}

		try {
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		} catch (Exception e) {
			System.out.println("No Intermediate pages");
		}

		// AD Pages
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}

		ProfileViewNotContacted p = new ProfileViewNotContacted(driver);

		/* -- -- -- --- -- - */

		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build()
				.perform();
		Thread.sleep(1500);
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")))
				.build().perform();

		Thread.sleep(2000);
		Base.click(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")));

		Thread.sleep(3000);
	
		
		// ***************PP value for Age*****************//

		String age = driver.findElement(By.xpath("//span[contains(text(),'Age - ')]//following::span[1]")).getText();

		String[] agef1 = age.split(" to ");
		String agefr = agef1[0].toString();
		agef = Integer.parseInt(agefr);
		System.out.println(agef);

		// ***********************PP value TO Age ************//

		String[] agefrr = agef1[1].split(" Yrs");
		String ageT = agefrr[0].toString();
		ageTo = Integer.parseInt(ageT);
		System.out.println(ageTo);

		// ***************PP Height from value**************//

		String Height1 = driver.findElement(By.xpath("//span[contains(text(),'Height - ')]//following::span[1]"))
				.getText();

		String[] heightF = Height1.split(" to ");

		String[] ht;

		// String[] t = Search_heigt.split(" to ");

		String q = heightF[0].toString();
		System.out.println(q);
		ht = q.split(" ");
		int i1 = Integer.parseInt(ht[0]);
		System.out.println("i1: " + i1);
		double htcms;
		if (ht.length - 1 >= 2) {
			
			htcms = Search.convertFeetandInchesToCentimeter(ht[0], ht[ht.length - 2]);

		} else {
			
			htcms = Search.convertFeetandInchesToCentimeter(ht[0], "0");
		}

		System.out.println(htcms);
		ppcmsfrom = Math.ceil(htcms);
		System.out.println("After converting height FROM value : " + ppcmsfrom);

		// ***************PP Height to value**************//

		String[] ht1;
		String q1 = heightF[1].toString();
		System.out.println(q1);
		ht1 = q1.split(" ");
		int i12 = Integer.parseInt(ht1[0]);
		System.out.println("i12: " + i12);
		double htcms1;
		if (ht1.length - 1 >= 2) {
			htcms1 = Search.convertFeetandInchesToCentimeter(ht1[0], ht1[ht1.length - 2]);

		} else {
			htcms1 = Search.convertFeetandInchesToCentimeter(ht1[0], "0");
		}

		System.out.println(htcms1);
		ppcmsfrom1 = Math.ceil(htcms1);
		System.out.println("After converting height TO  value: " + ppcmsfrom1);

		Thread.sleep(3000);
		maritalStatus = driver.findElement(By.xpath("//span[contains(text(),'Marital Status - ')]//following::span[1]"))
				.getText();
		System.out.println(maritalStatus);
		//WebElement moreoption =driver.findElement(By.xpath("//a[contains(text(),'More')]"));
		Thread.sleep(3000);
		
		try {
			List<WebElement> moreoption =driver.findElements(By.xpath("//a[contains(text(),'More')]"));
			System.out.println(moreoption.size());
			
			for (int op = 1; op <= moreoption.size()-1; op++) {
				System.out.println(moreoption.size());
				Thread.sleep(3000);
				moreoption.get(op).click();
				System.out.println("Clicked on more button "+ op);
			}
		} catch (Exception e) {
			System.err.println("NO MORE BUTTON IS DISPLAYED");
		}
		

		/*try {
			if (moreoption.isDisplayed()) {
				moreoption.click();
				
			}
		} catch (Exception e) {
		
		}*/
		Thread.sleep(3000);
		mtongue = driver.findElement(By.xpath("//span[contains(text(),'Mother Tongue - ')]//following::span[1]"))
				.getText();
		System.out.println("MotherTongue : " +  mtongue);
		
		
		Thread.sleep(1000);
		//span[contains(text(),'Eating Habits - ')]//following::span[1]
		PP_Eatinghabits = driver.findElement(By.xpath("//span[contains(text(),'Eating Habits - ')]//following::span[1]"))
				.getText();
		System.out.println("PP Eating Habits : " + PP_Eatinghabits);
		
		
		PP_Drinkinghabits = driver.findElement(By.xpath("//span[contains(text(),'Drinking Habits - ')]//following::span[1]"))
				.getText();
		System.out.println("PP Eating Habits : " + PP_Drinkinghabits);
		
		
		PP_smokinghabits = driver.findElement(By.xpath("//span[contains(text(),'Smoking Habits - ')]//following::span[1]"))
				.getText();
		System.out.println("PP Eating Habits : " + PP_smokinghabits);
	
		
		/*Base.click(driver.findElement(By.xpath("//*[@id=\"show_partner\"]/a")));
		
		
		WebElement mo_edit = driver.findElement(By.xpath("//*[@id='motherTongue']"));
		
		Select s6 = new Select(mo_edit);
		List<WebElement> mother_list = s6.getAllSelectedOptions();
		System.out.println(mother_list);
		int listvalue = mother_list.size();
		System.out.println(listvalue);
		if (listvalue > 0) {
			boolean cuntry = true;
			arr = new String[mother_list.size()];
			for (int k = 0; k < mother_list.size(); k++) {
				 String PPcountrylist = mother_list.get(k).getText();
				System.out.println("Mothertongue value " + k + " " + PPcountrylist);
				arr[k] = PPcountrylist;
				System.out.println("Mother tongue after adding in to array : " + arr[k]);
			}
		} else {
			 PP_Any = "Any";
			System.out.println("Mother tongue value is selected as :" + PP_Any);
		}
		*/
        
        

        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		// *********************religion**************///

        
        
        
		try {
			Religion = driver.findElement(By.xpath("//span[contains(text(),'Religion - ')]//following::span[1]"))
					.getText();
			System.out.println("Religion : " + Religion);

		} catch (Exception e) {

		}

		try {
			SubCaste = driver.findElement(By.xpath("//span[contains(text(),'Subcaste - ')]//following::span[1]"))
					.getText();
			System.out.println("SubCaste : " + SubCaste);
		} catch (Exception e) {

		}

		try {
			Education = driver.findElement(By.xpath("//span[contains(text(),'Education - ')]//following::span[1]"))
					.getText();
			System.out.println("Education : " + Education);
		} catch (Exception e) {

		}

		
		Thread.sleep(3000);
		//p.getMy_home().click();
		driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[2]/div[2]/a")).click();
		//acc.moveToElement(p.getMy_home()).build().perform();

		try {
			driver.findElement(By.xpath("(//a[@class='popupclose'])[2]")).click();
		} catch (Exception e) {
			e.getMessage();
		}
		Thread.sleep(3000);
		//// Getting total profile count//////////////
		WebElement profilecount = driver.findElement(By.xpath("//*[@id=\"total_div\"]"));
	 
		String pf = profilecount.getText();
        Integer profile_count =Integer.parseInt(pf);
        page_cou = (profile_count/10);
        
        System.out.println("Total times Next has to be clicked    :"   + page_cou);
         
		
         for (int m = 0; m <=page_cou; m++) {

		Thread.sleep(5000);
		//String s1 = driver.findElement(By.xpath("//*[@id='hide_no_result']/div[1]/a")).getText();
		//System.out.println(s1);
		List<WebElement> mat = driver.findElements(By.xpath("//*[@id='hide_no_result']/div[1]/a"));
		System.out.println(mat.size());
		
		for (int j = 0; j < mat.size()-1; j++) {
			System.out.println(" matrid :" + mat.get(j).getText());
			oppid = mat.get(j).getText();
			System.out.println(oppid);

			// ************************** API TESTING STARTS FROM HERE
			// ***************************//

			PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
			authScheme.setUserName("admin");
			authScheme.setPassword("lRqW6WNT");
			RestAssured.authentication = authScheme;

			RestAssured.baseURI = "https://api.communitymatrimony.com/api/webservicecall.php?filename=profileDetailCurl&Module=viewprofile&Field_Empty=1&Field_Label=1&EnablePhotoRequest=1&MatriId=BRH3003552&PackageName=com.community.matrimony&AppVersionCode=133&SignalStrength=&AppVersion=5.8&EncryptId=f55c1cfd0e6e27d3a09019a2378caa8b15319edc&Referrer=DashBoard&NetworkType=WIFI&UniqueId=fb1643d21a&mima=yes&Opposite_MatriId="
					+ oppid
					+ "&DeviceVersion=9&PPWeb=1&DeviceModel=Nokia%206.1%20Plus&DevicePlatform=Android&SenderRequest=1&OutputType=2&CommunityId=49&AppType=2152&CarrierName=&MarkAsViewed=1&InterestFlag=1&IncomeRangeEnable=yes&ChkBlockIgnoreProfile=0&PaidStatus=0&RequestVal=1&GetUpdatedInfo=1&Gender=1&ContactGov=1";
			RequestSpecification httpRequest = RestAssured.given();
			// https://www.communitymatrimony.com/api/webservicecall.php?filename=profileDetailCurl&Module=viewprofile&Field_Empty=1&Field_Label=1&EnablePhotoRequest=1&MatriId=PAR127225&PackageName=com.community.matrimony&AppVersionCode=123&SignalStrength=&AppVersion=4.9&EncryptId=3dde775f4a4498c676fa56ed040a4492931b8be8&Referrer=inbox_unread&NetworkType=WIFI&UniqueId=0164d5978f&mima=yes&Opposite_MatriId=PAR139574&DeviceVersion=9&DeviceModel=Mi%20A1&TokenId=d82b25913b008625dc785df759f2c7be13b40fca&DevicePlatform=Android&SenderRequest=1&OutputType=2&CommunityId=153&AppType=2&CarrierName=&MarkAsViewed=1&InterestFlag=1&IncomeRangeEnable=yes&ChkBlockIgnoreProfile=0&PaidStatus=1&RequestFor=1&RequestVal=1&Gender=1&ContactGov=1
			Response response = httpRequest.request(Method.GET,
					"https://api.communitymatrimony.com/api/webservicecall.php?filename=profileDetailCurl&Module=viewprofile&Field_Empty=1&Field_Label=1&EnablePhotoRequest=1&MatriId=BRH3003552"
					+ "&PackageName=com.community.matrimony&AppVersionCode=133&SignalStrength=&AppVersion=5.8&EncryptId=f55c1cfd0e6e27d3a09019a2378caa8b15319edc&Referrer=DashBoard&NetworkType=WIFI&UniqueId=fb1643d21a&mima=yes&Opposite_MatriId="
							+ oppid
							+ "&DeviceVersion=9&PPWeb=1&DeviceModel=Nokia%206.1%20Plus&DevicePlatform=Android&SenderRequest=1&OutputType=2&CommunityId=49&AppType=2152&CarrierName=&MarkAsViewed=1&InterestFlag=1&IncomeRangeEnable=yes&ChkBlockIgnoreProfile=0&PaidStatus=0&RequestVal=1&GetUpdatedInfo=1&Gender=1&ContactGov=1");
			// Response response1 = httpRequest.request(Method.GET, "/BASICINFORMATION");
			JsonPath jsonPathEvaluator = response.jsonPath();

			int statusCode = response.getStatusCode();

			// int statusCode = response.getStatusCode();
			System.out.println( "API Status Codde : " + statusCode);

			String statusLine = response.getStatusLine();
			System.out.println("Status Line : " + statusLine);

			String contentType = response.header("Content-Type");
			System.out.println("Content-Type value: " + contentType);

			String serverType = response.header("Server");
			System.out.println("Server value: " + serverType);

			String acceptLanguage = response.header("Content-Encoding");
			System.out.println("Content-Encoding: " + acceptLanguage);

			ResponseBody body = response.getBody();
			//System.out.println("Response Body is: " + body.asString());

			String ERRORDESC = response.jsonPath().get("ERRORDESC").toString();
			System.out.println(ERRORDESC + " . ' . ' ");

			if (!ERRORDESC.equalsIgnoreCase("Sorry No Record's Found")) {

				Map<String, String> company = response.jsonPath().getMap("HOROSCOPEINFO");

				/*
				 * for (Map.Entry<String, String> entry : company.entrySet()) {
				 * 
				 * System.out.println(entry.getKey() + "/" + entry.getValue()); 
				 * }
				 */
				System.out.println("\n");
				System.out.println("*****   Profile NO: " + j + "   *******");
				System.out.println("\n");
				String matriid = response.path("MEMBERINFO.OPPOSITEMATRIID.MASKEDMATRIID").toString();
				System.out.println(" Opp viewprofile matriid : " + matriid);
				// JSONObject jsonObject = new JSONObject();

				//////////////////// MEMEBER DETAILS(vIEW pROFILE)///////////////////////

				String value17 = response.path("MEMBERINFO.BASICDETAILS.AGE.2").toString();
				// System.out.println(value17);
				/*
				 * String a19 = value17.replaceAll("[{,}]", " "); String[] A91 =
				 * a19.split("2=");
				 */
				System.out.println("Age :" + value17);
				String[] ag1 = value17.split(" ");
				a = Integer.parseInt(ag1[0]);

				System.out.println("API Value for Age : " + a);

				//////////////// AGE VALIDATION/////////////
				
				boolean agestatus = false;
				
				if (a >= agef && a <= ageTo) {
					
					agestatus = true;

					System.out.println("AGE : " + a + " is in between " + agef + " and " + ageTo);
				}
				asrt.assertTrue(agestatus, a + " is not in between " + agef + " and " + ageTo + "for matrid : " + matriid);

				String value19 = response.path("MEMBERINFO.BASICDETAILS.NAME").toString();
				// System.out.println(value19);
				String a12 = value19.replaceAll("[{,}]", " ");
				String[] A221 = a12.split("2=");
				System.out.println("PI Name :" + A221[1]);

				// System.out.println(value19.replaceAll("[{,}]", " "));

				String value191 = response.path("MEMBERINFO.BASICDETAILS.HEIGHT").toString();
				// System.out.println(value191);
				String a122 = value191.replaceAll("[{,}]", " ");
				String[] A22 = a122.split("2=");
				System.out.println("PI Height :" + A22[1]);

				String ah = A22[1].toString();
				String[] ak = ah.split("/");
				String he1 = ak[1].toString().trim();
				// System.out.println(he1);

				String[] heightF1 = he1.split(" ");

				String he12 = heightF1[0].toString().trim();
				// System.out.println(he12);
				Integer f_apih_cms = Integer.parseInt(he12);

				System.out.println("Api height in cm :" + f_apih_cms);

				//////////////// HEIGHT VALIDATION/////////////
				
				boolean htstatus = false;
				if (f_apih_cms >= ppcmsfrom && f_apih_cms <= ppcmsfrom1) {
					htstatus = true;

					System.out.println("Height : " + f_apih_cms + " is in between " + ppcmsfrom + " and " + ppcmsfrom1);
				}
				asrt.assertTrue(htstatus, f_apih_cms + " is not in between " + ppcmsfrom + " and " + ppcmsfrom1+ "for matrid : " + matriid);

				
				/////////////////MARITAL STATUS VALIDATION//////////////////////////
				
				
				String apimaritalstus = response.path("MEMBERINFO.BASICDETAILS.MARITAL_STATUS.2").toString();

				System.out.println("PI maritalstatus :" + apimaritalstus);

				if (!maritalStatus.contains("Any")) {
					boolean mtstatus = false;
					if (maritalStatus.contains(apimaritalstus)) {
						// System.out.println(marital);
						mtstatus = true;
						System.out.println("Marital status : " +  apimaritalstus + " is present in the Partner preference field " + maritalStatus);
					}
					asrt.assertTrue(mtstatus,
							" marital status Value is selected as  " + apimaritalstus + " for matriid : " + matriid);
				}
				else {

					System.out.println("Marital status is selected as any in PP......");
				}

				String apimothertongue = response.path("MEMBERINFO.BASICDETAILS.MOTHERTONGUE.2").toString();

				if (!mtongue.contains("Any")) {
					boolean mtonge = false;
					if (mtongue.contains(apimothertongue)) {
						// System.out.println(marital);
						mtonge = true;
						System.out.println("Mother Tongue : " + apimothertongue + " is present in the Partner preference field " + mtongue);
					}

					asrt.assertTrue(mtonge, " Mother Tongue Value is selected as  " + apimothertongue + " for matriid : " + matriid);
				}

				else {

					System.out.println("Mother Tongue is selected as ANY in PP......");
				}
			
				/*try {
					
					boolean ctstatus = false;
					for (int b = 0; b < arr.length; b++) {
						if (apimothertongue.equals(arr[b])) {
							ctstatus = true;
							System.out.println("Mother Tongue : " + apimothertongue
									+ " is present in the PP Mother tongue field  " + arr[b]);
							break;
						}
					}
					if (true) {
						asrt.assertTrue(ctstatus, "Mother tongue Value is selected as " + apimothertongue + "for matriid :" + matriid);
					}

				} catch (Exception e) {
					System.out.println("Mother tongue Value is given as :" + PP_Any + "from search field");
				}
				*/
				
				String api_EatingHabits = response.path("MEMBERINFO.HABITS.EATING_HABITS.2").toString();

				System.out.println("PI Eating Habits :" + api_EatingHabits);

				if (!PP_Eatinghabits.contains("Doesn't matter") || !api_EatingHabits.contains("Not Specified")) {
					boolean eattstatus = false;
					if (PP_Eatinghabits.contains(api_EatingHabits)) {
						// System.out.println(marital);
						eattstatus = true;
						System.out.println("Eating Habits status : " + api_EatingHabits
								+ " is present in the Partner preference field " + PP_Eatinghabits);
					}

					asrt.assertTrue(eattstatus,
							"EAting Habits status Value is selected as  " + api_EatingHabits + " for matriid : " + matriid +  "  value in PP given as :" + PP_Drinkinghabits  );
				}

				else {

					System.err.println("Eating Habits status is selected in PP as  : "+ PP_Eatinghabits +"  In API eating habits selected as " + api_EatingHabits );
				}
				
				String api_drinkingHabits = response.path("MEMBERINFO.HABITS.DRINK.2").toString();

				System.out.println("PI Drinking Habits :" + api_drinkingHabits);

				if (!PP_Drinkinghabits.contains("Doesn't matter") || !api_drinkingHabits.contains("Not Specified")) {
					boolean eattstatus = false;
					if (PP_Drinkinghabits.contains(api_drinkingHabits)) {
						// System.out.println(marital);
						eattstatus = true;
						System.out.println("Drinking Habits status : " + api_drinkingHabits
								+ " is present in the Partner preference field " + PP_Drinkinghabits);
					}

					asrt.assertTrue(eattstatus,
							"Drinking Habits status Value is selected as  " + api_drinkingHabits + " for matriid : " + matriid + "  value in PP given as :" + PP_Drinkinghabits);
				}

				else {

					System.err.println("Drinking Habits status is selected in PP as  : "+ PP_Drinkinghabits +"  In API Drinking habits selected as " + api_drinkingHabits );
				}
				
				String api_smokingHabits = response.path("MEMBERINFO.HABITS.DRINK.2").toString();

				System.out.println("PI smoking Habits :" + api_smokingHabits);

				if (!PP_smokinghabits.contains("Doesn't matter") || !api_smokingHabits.contains("Not Specified")) {
					boolean eattstatus = false;
					if (PP_smokinghabits.contains(api_smokingHabits)) {
						// System.out.println(marital);
						eattstatus = true;
						System.out.println("smoking Habits status : " + api_smokingHabits
								+ " is present in the Partner preference field " + PP_smokinghabits);
					}

					asrt.assertTrue(eattstatus,
							"smoking Habits status Value is selected as  " + api_smokingHabits + " for matriid : " + matriid +"   value in PP given as :" + PP_smokinghabits);
				}

				else {

					System.err.println("smoking Habits status is selected in PP as  : "+ PP_smokinghabits +"  In API Drinking habits selected as " + api_smokingHabits );
				}
				
				
				
				
				
				
				
				
				
				
				

				/*
				 * try {
				 * 
				 * if (Religion.equalsIgnoreCase(Relign)) {
				 * System.out.println("Religion  Verified"); } else {
				 * System.out.println("Religion not Verified  "); } } catch (Exception e) {
				 * 
				 * }
				 */

				/*
				 * try { if (SubCaste.equalsIgnoreCase(valsub)) {
				 * System.out.println("SubCaste  Verified"); } else {
				 * System.out.println("SubCaste not Verified  "); }
				 * 
				 * } catch (Exception e) {
				 * 
				 * }
				 */

				try {
					if (Education.contains(Education1)) {
						System.out.println("Education  Verified");
					} else {
						System.out.println("Education not Verified  ");
					}

				} catch (Exception e) {

					/*
					 * try { if (mtongue.contains(A23[1])) {
					 * System.out.println("MotherTongue  Verified"); } else {
					 * System.out.println("MotherTongue in PP is given as Any."); 
					 * } 
					 * } catch
					 * (Exception e2) { // TODO: handle exception
					 *   
					 * }
					 */

				}
			}

		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		Base.click(driver.findElement(By.xpath("//span[contains(text(),'Next ')]")));  
		//  Xpath - //span[contains(text(),'Next ')]
         }                                                 
		
	
		asrt.assertAll();
	}

}
