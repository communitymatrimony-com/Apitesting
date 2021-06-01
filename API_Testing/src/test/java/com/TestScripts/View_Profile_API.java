package com.TestScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Base.Base;
import com.ObjectRepository.inbox_POM;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class View_Profile_API {
	WebDriver driver;
	String Requested_Id = null;
	String requested_deatils = null;
	String matid, asd, ageFro, ageT, maritalStatus, mariedstatus1, Religion, Religion1, Caste, Caste1, SubCaste,
			SubCaste1, Education, Education1, country1, Occupation,mtongue;
	int ageFrom, ageTo, ageFrom1, ageTo1, i, total, age1;
	float heightFrom, heightFrom1, heightTo, heightTo1, heightFrom2, heightTo2, Height;

	@Test(priority = 2, enabled = true)
	public void viewpro() {

		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("admin");
		authScheme.setPassword("lRqW6WNT");
		RestAssured.authentication = authScheme;

		RestAssured.baseURI = "https://api.communitymatrimony.com/api/webservicecall.php?filename=profileDetailCurl&Module=viewprofile&Field_Empty=1&Field_Label=1&EnablePhotoRequest=1&MatriId=EZH710533&PackageName=com.community.matrimony&AppVersionCode=133&SignalStrength=&AppVersion=5.8&EncryptId=f55c1cfd0e6e27d3a09019a2378caa8b15319edc&Referrer=DashBoard&NetworkType=WIFI&UniqueId=fb1643d21a&mima=yes&Opposite_MatriId=EZH765378&DeviceVersion=9&PPWeb=1&DeviceModel=Nokia%206.1%20Plus&DevicePlatform=Android&SenderRequest=1&OutputType=2&CommunityId=49&AppType=2152&CarrierName=&MarkAsViewed=1&InterestFlag=1&IncomeRangeEnable=yes&ChkBlockIgnoreProfile=0&PaidStatus=0&RequestVal=1&GetUpdatedInfo=1&Gender=1&ContactGov=1";
		RequestSpecification httpRequest = RestAssured.given();
		// https://www.communitymatrimony.com/api/webservicecall.php?filename=profileDetailCurl&Module=viewprofile&Field_Empty=1&Field_Label=1&EnablePhotoRequest=1&MatriId=PAR127225&PackageName=com.community.matrimony&AppVersionCode=123&SignalStrength=&AppVersion=4.9&EncryptId=3dde775f4a4498c676fa56ed040a4492931b8be8&Referrer=inbox_unread&NetworkType=WIFI&UniqueId=0164d5978f&mima=yes&Opposite_MatriId=PAR139574&DeviceVersion=9&DeviceModel=Mi%20A1&TokenId=d82b25913b008625dc785df759f2c7be13b40fca&DevicePlatform=Android&SenderRequest=1&OutputType=2&CommunityId=153&AppType=2&CarrierName=&MarkAsViewed=1&InterestFlag=1&IncomeRangeEnable=yes&ChkBlockIgnoreProfile=0&PaidStatus=1&RequestFor=1&RequestVal=1&Gender=1&ContactGov=1
		Response response = httpRequest.request(Method.GET,
				"https://api.communitymatrimony.com/api/webservicecall.php?filename=profileDetailCurl&Module=viewprofile&Field_Empty=1&Field_Label=1&EnablePhotoRequest=1&MatriId=EZH710533&PackageName=com.community.matrimony&AppVersionCode=133&SignalStrength=&AppVersion=5.8&EncryptId=f55c1cfd0e6e27d3a09019a2378caa8b15319edc&Referrer=DashBoard&NetworkType=WIFI&UniqueId=fb1643d21a&mima=yes&Opposite_MatriId=EZH765378&DeviceVersion=9&PPWeb=1&DeviceModel=Nokia%206.1%20Plus&DevicePlatform=Android&SenderRequest=1&OutputType=2&CommunityId=49&AppType=2152&CarrierName=&MarkAsViewed=1&InterestFlag=1&IncomeRangeEnable=yes&ChkBlockIgnoreProfile=0&PaidStatus=0&RequestVal=1&GetUpdatedInfo=1&Gender=1&ContactGov=1");
		// Response response1 = httpRequest.request(Method.GET, "/BASICINFORMATION");
		JsonPath jsonPathEvaluator = response.jsonPath();

		int statusCode = response.getStatusCode();

		// int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String statusLine = response.getStatusLine();
		System.out.println("Status Line : " + statusLine);

		String contentType = response.header("Content-Type");
		System.out.println("Content-Type value: " + contentType);

		String serverType = response.header("Server");
		System.out.println("Server value: " + serverType);

		String acceptLanguage = response.header("Content-Encoding");
		System.out.println("Content-Encoding: " + acceptLanguage);

		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());

		String ERRORDESC = response.jsonPath().get("ERRORDESC").toString();
		System.out.println(ERRORDESC + " . ' . ' ");

		if (!ERRORDESC.equalsIgnoreCase("Sorry No Record's Found")) {

			Map<String, String> company = response.jsonPath().getMap("HOROSCOPEINFO");

			/*
			 * for (Map.Entry<String, String> entry : company.entrySet()) {
			 * System.out.println(entry.getKey() + "/" + entry.getValue()); }
			 */

			String value1 = response.path("MEMBERINFO.OPPOSITEMATRIID.MASKEDMATRIID").toString();
			System.out.println("viewprofile matriid:"+ value1);
			// JSONObject jsonObject = new JSONObject();

			//////////////////// MEMEBER DETAILS(vIEW pROFILE)///////////////////////

			String value17 = response.path("MEMBERINFO.BASICDETAILS.AGE.2").toString();
			//System.out.println(value17);
			/*
			 * String a19 = value17.replaceAll("[{,}]", " "); String[] A91 =
			 * a19.split("2=");
			 */
			System.out.println("Age :" + value17);
			System.out.println(value17.substring(0, 2));
			age1 = Integer.parseInt(value17.substring(0, 2));

			System.out.println(age1);

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

			if (A22[1].endsWith("in")) {

				String[] hei = A22[1].split("ft");
				String heig1 = hei[0].toString().trim();
				System.out.println(heig1);
				String[] heigh = hei[1].split(" in");
				String heigg = heigh[0].toString().trim();
				System.out.println(heigg);

				String heightFro = heig1 + "." + heigg;
				Height = Float.parseFloat(heightFro);
				System.out.println(":::" + Height);

			} else {

				String[] hei = A22[1].split("ft");
				String heig1 = hei[0].toString().trim();

				Height = Float.parseFloat(heig1);
				System.out.println(":::" + Height);

			}

			String value234 = response.path("MEMBERINFO.BASICDETAILS.MARITAL_STATUS.2").toString();
			//System.out.println(value234);
			/*
			 * String a89 = value234.replaceAll("[{,}]", " "); String[] A2 =
			 * a89.split("2="); System.out.println("Marital Status :" + A2[1]);
			 */
			System.out.println("PI maritalstatus :" + value234);
			/*
			 * marstatus = Integer.parseInt(value234); System.out.println(marstatus);
			 */

			String value345 = response.path("MEMBERINFO.BASICDETAILS.MOTHERTONGUE").toString();
			// System.out.println(value345);
			String a98 = value345.replaceAll("[{,}]", " ");
			String[] A23 = a98.split("2=");
			System.out.println("PI Mother Tongue :" + A23[1]);

			//String valsub = response.path("MEMBERINFO.RELIGIOUSINFO.SUBCASTE.2").toString();

			//System.out.println("PI SubCaste :" + valsub);

			String gothram = response.path("MEMBERINFO.RELIGIOUSINFO.GOTHRALABEL.2").toString();

			System.out.println("PI gothram :" + gothram);
			String country = response.path("MEMBERINFO.RESIDENCE.COUNTRY.2").toString();

			System.out.println("PI country :" + country);
			
			
			String state = response.path("MEMBERINFO.RESIDENCE.RESIDING_STATE.2").toString();

			System.out.println("PI state :" + state);
			
			String city = response.path("MEMBERINFO.RESIDENCE.RESIDING_CITY.2").toString();

			System.out.println("PI city :" + city);
			
			
			String edu_detail = response.path("MEMBERINFO.PROFESSIONALINFO.EDUCATION_DETAIL.2").toString();

			System.out.println("PI education_details :" + edu_detail);

			///////////// MEMEBER PP INFORMATION////////////////////////////
			///////////// PP AGE//////////////////////

			String PP_age = response.path("MEMBERPARTNERINFO.BASICDETAILS.AGE").toString();
			// System.out.println(value345);
			String PA = PP_age.replaceAll("[{,}]", " ");
			String[] PA1 = PA.split("2=");
			//System.out.println(PA1[1]);
			String[] PA2 = PA1[1].split("3=");

			System.out.println("PP AGE :" + PA2[0]);

			///////////// PP height//////////////////////

			String PP_height = response.path("MEMBERPARTNERINFO.BASICDETAILS.HEIGHT_FT").toString();
			// System.out.println(value345);
			String PH = PP_height.replaceAll("[{,}]", " ");
			String[] PH1 = PH.split("2=");
			//System.out.println(PH1[1]);
			String[] PH2 = PH1[1].split("3=");

			System.out.println("PP height :" + PH2[0]);

			///////////////// PP STATUS//////////////////////////

			String PP_MARITAL = response.path("MEMBERPARTNERINFO.BASICDETAILS.LOOKING_STATUS").toString();
			// System.out.println(value345);
			String PM = PP_MARITAL.replaceAll("[{,}]", " ");
			String[] PM1 = PM.split("2=");
			//System.out.println(PM1[1]);
			String[] PM2 = PM1[1].split("3=");

			System.out.println("PP MARITALSTATUS :" + PM2[0]);
			String PP_COUNTRY = response.path("MEMBERPARTNERINFO.RESIDENCE.COUNTRY.2").toString();
			// System.out.println(value345);
			System.out.println("PP COUNTRY :" + PP_COUNTRY);
			
			
			String PP_CITIZENSHIP = response.path("MEMBERPARTNERINFO.RESIDENCE.CITIZENSHIP.2").toString();
			// System.out.println(value345);
			System.out.println("PP CITIZENSHIP :" + PP_CITIZENSHIP);
			
			String PP_EATING_HABITS  = response.path("MEMBERPARTNERINFO.HABITS.EATING_HABITS.2").toString();
			// System.out.println(value345);
			System.out.println("PP EATING_HABITS :" + PP_EATING_HABITS);
			
			/*
			 * String PP_gothram =
			 * response.path("MEMBERPARTNERINFO.RELIGIOUSINFO.GOTHRAM.2").toString();
			 * System.out.println("PP GOTHRAM :" +PP_gothram);
			 * 
			 */
			

			if (value234.equals(maritalStatus)) {
				System.out.println("Marital Status Verified");
			} else {
				System.out.println("Marital  Status in pp is given as any");
			}

			if (ageFrom == age1 || ageTo >= age1) {
				System.out.println(age1 + " is in between " + ageFrom + " and " + ageTo);
			} else {
				System.out.println(age1 + " is not in between " + ageFrom + " and " + ageTo);
			}

			if (heightFrom == Height || heightTo >= Height) {
				System.out.println(Height + " is in between " + heightFrom + " and " + heightTo);
			} else {
				System.out.println(Height + " is not in between " + heightFrom + " and " + heightTo);
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

				try {
					if (mtongue.contains(A23[1])) {
						System.out.println("MotherTongue  Verified");
					} else {
						System.out.println("MotherTongue in PP is given as Any.");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			
				
			}

/////////////////////// sIMILAR PROFILES baSED ON PP //////////////////////

			/*
			 * List<String> company9 =
			 * response.jsonPath().getList("SIMILARMATCHES.SIMILARPROFILES.NAME"); for (int
			 * i = 0; i < company9.size(); i++) {
			 * System.out.println("Similar profile Name :" + company9.get(i));
			 * 
			 * }
			 * 
			 * List<String> company91 =
			 * response.jsonPath().getList("SIMILARMATCHES.SIMILARPROFILES.AGE"); for (int i
			 * = 0; i < company91.size(); i++) { System.out.println("Similar profile Age :"
			 * + company91.get(i));
			 * 
			 * }
			 * 
			 * List<String> company919 =
			 * response.jsonPath().getList("SIMILARMATCHES.SIMILARPROFILES.HEIGHT"); for
			 * (int i = 0; i < company919.size(); i++) {
			 * System.out.println("Similar profile heIGHT :" + company919.get(i));
			 * 
			 * } List<String> company20 =
			 * response.jsonPath().getList("SIMILARMATCHES.SIMILARPROFILES.MATRIID"); for
			 * (int i = 0; i < company20.size(); i++) {
			 * System.out.println("Similar profile MATRID :" + company20.get(i));
			 * 
			 * }
			 * 
			 * List<String> company201 =
			 * response.jsonPath().getList("SIMILARMATCHES.SIMILARPROFILES.STATE"); for (int
			 * i = 0; i < company201.size(); i++) {
			 * System.out.println("Similar profile STATE :" + company201.get(i));
			 * 
			 * }
			 */
		}

		else {

			System.out.println("Sorry No Record's Found");
		}
	}

	@Test(enabled = true)
	public void Inbox_verify() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\CBS\\SAI-master\\API_Testing\\lib\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.communitymatrimony.com");


		inbox_POM i = new inbox_POM(driver);
		Actions acc = new Actions(driver);

		driver.manage().window().maximize();
		try {
			Base.click(i.getMatriId());
			Base.typeData(i.getMatriId(), "EZH710533");

			Base.click(i.getPaswwordclr());
			Base.typeData(i.getPassword(), "cbstest");
			

			Base.click(i.getLoginbtn());
		} catch (Exception e) {
			System.out.println("Already Logged In");
		}
//////////////////////// INtermediate Pages /////////////////////////////

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
			System.out.println("Intermediate pages handled 1");
		}

		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled 2");
		}

		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled 3");
		}

		try {
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		} catch (Exception e) {
			System.out.println("No Intermediate pages");
		}
// AD Pages

		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}

		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build()
				.perform();
		Thread.sleep(1500);
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")))
				.build().perform();

		Thread.sleep(2000);
		Base.click(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")));

		Thread.sleep(3000);

		maritalStatus = driver.findElement(By.xpath("//span[contains(text(),'Marital Status - ')]//following::span[1]"))
				.getText();
		System.out.println(maritalStatus);

		String age = driver.findElement(By.xpath("//span[contains(text(),'Age - ')]//following::span[1]")).getText();

		String[] agef = age.split(" to ");
		String agefr = agef[0].toString();
		ageFrom = Integer.parseInt(agefr);
		System.out.println(ageFrom);

		String[] agefrr = agef[1].split(" Yrs");
		String ageT = agefrr[0].toString();
		ageTo = Integer.parseInt(ageT);
		System.out.println(ageTo);

		//////////////////
		String Height1 = driver.findElement(By.xpath("//span[contains(text(),'Height - ')]//following::span[1]"))
				.getText();

		String[] heightF = Height1.split(" to ");

		String he = heightF[0].toString().trim();
		System.out.println(he);
////	
		if (he.endsWith("in")) {

			String[] hei = he.split(" ft ");
			String heig = hei[0].toString().trim();

			String[] heigh = hei[1].split(" in");
			String heigg = heigh[0].toString().trim();

			String heightFro = heig + "." + heigg;
			heightFrom = Float.parseFloat(heightFro);
			System.out.println(":::" + heightFrom);

		} else {

			String[] hei = he.split(" ft");
			String heig = hei[0].toString().trim();

			heightFrom = Float.parseFloat(heig);
			System.out.println(":::" + heightFrom);

		}

		/////

		String he1 = heightF[1].toString().trim();
		System.out.println(he1);
////	
		if (he1.endsWith("in")) {

			String[] hei1 = he1.split(" ft ");
			String heig1 = hei1[0].toString().trim();

			String[] heigh1 = hei1[1].split(" in");
			String heigg1 = heigh1[0].toString().trim();

			String heightFro1 = heig1 + "." + heigg1;
			heightTo = Float.parseFloat(heightFro1);
			System.out.println(":*:*:" + heightTo);

		} else {

			String[] hei1 = he1.split(" ft");
			String heig1 = hei1[0].toString().trim();

			heightTo = Float.parseFloat(heig1);
			System.out.println(":*:*:" + heightTo);

		}

		////////////////////////

		// String Height = driver.findElement(By.xpath(xpathExpression))
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

		
		try {
			mtongue = driver.findElement(By.xpath("//span[contains(text(),'Mother Tongue - ')]//following::span[1]"))
					.getText();
			System.out.println("MotherTongue : " + mtongue);
		} catch (Exception e) {

		}

	}

}
