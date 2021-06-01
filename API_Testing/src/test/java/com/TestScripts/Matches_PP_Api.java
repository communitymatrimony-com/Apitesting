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

public class Matches_PP_Api extends Base {

	WebDriver driver;
	String Requested_Id = null;
	String requested_deatils = null;
	String matid, asd, ageFro, ageT, maritalStatus, mariedstatus1, Religion, Religion1, Caste, Caste1, SubCaste,
			childrenStatus, SubCaste1, Education, Education1, country1, Occupation, PP_State, PP_Country, mtongue, star,
			oppid, PP_Any, Sect_Denomination, PP_smokinghabits, PP_Drinkinghabits, PP_Eatinghabits,PP_subcaste;
	int ageFrom, ageTo, ageFrom1, ageTo1, i, total, age1, a, agef, page_cou;
	float heightFrom, heightFrom1, heightTo,heightTo1, heightFrom2, heightTo2, Height;
	double ppcmsfrom, ppcmsfrom1;
	String[] arr, arr1, arr2, arr3, arr5;

	@Test
	public void viewpro() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\chromedriver.exe");
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
			Base.typeData(i.getMatriId(), "CHY458603");

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
		try {
			Base.click(driver.findElement(By.xpath("/html/body/div[1]/div[1]/a")));
		} catch (Exception e5) {
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

		Thread.sleep(3000);

		try {

			childrenStatus = driver
					.findElement(By.xpath("//span[contains(text(),'Have Children - ')]//following::span[1]")).getText();
			System.out.println(childrenStatus);

		} catch (Exception e) {
			System.out.println("No children option is selected");
		}

		// WebElement moreoption
		// =driver.findElement(By.xpath("//a[contains(text(),'More')]"));
		Thread.sleep(3000);

		try {
			List<WebElement> moreoption = driver.findElements(By.xpath("//a[contains(text(),'More')]"));
			System.out.println(moreoption.size());

			for (int op = 1; op <= moreoption.size() - 1; op++) {
				System.out.println(moreoption.size());
				Thread.sleep(3000);
				moreoption.get(op).click();
				System.out.println("Clicked on more button " + op);
			}
		} catch (Exception e) {
			System.err.println("NO MORE BUTTON IS DISPLAYED");
		}

		/*
		 * try { if (moreoption.isDisplayed()) { moreoption.click();
		 * 
		 * } } catch (Exception e) {
		 * 
		 * }
		 */
		Thread.sleep(3000);
		mtongue = driver.findElement(By.xpath("//span[contains(text(),'Mother Tongue - ')]//following::span[1]"))
				.getText();
		System.out.println("MotherTongue : " + mtongue);

		Thread.sleep(1000);
		// span[contains(text(),'Eating Habits - ')]//following::span[1]
		PP_Eatinghabits = driver
				.findElement(By.xpath("//span[contains(text(),'Eating Habits - ')]//following::span[1]")).getText();
		System.out.println("PP Eating Habits : " + PP_Eatinghabits);

		PP_Drinkinghabits = driver
				.findElement(By.xpath("//span[contains(text(),'Drinking Habits - ')]//following::span[1]")).getText();
		System.out.println("PP Eating Habits : " + PP_Drinkinghabits);

		PP_smokinghabits = driver
				.findElement(By.xpath("//span[contains(text(),'Smoking Habits - ')]//following::span[1]")).getText();
		System.out.println("PP Eating Habits : " + PP_smokinghabits);

		/*
		 * Base.click(driver.findElement(By.xpath("//*[@id=\"show_partner\"]/a")));
		 * 
		 * 
		 * WebElement mo_edit = driver.findElement(By.xpath("//*[@id='motherTongue']"));
		 * 
		 * Select s6 = new Select(mo_edit); List<WebElement> mother_list =
		 * s6.getAllSelectedOptions(); System.out.println(mother_list); int listvalue =
		 * mother_list.size(); System.out.println(listvalue); if (listvalue > 0) {
		 * boolean cuntry = true; arr = new String[mother_list.size()]; for (int k = 0;
		 * k < mother_list.size(); k++) { String PPcountrylist =
		 * mother_list.get(k).getText(); System.out.println("Mothertongue value " + k +
		 * " " + PPcountrylist); arr[k] = PPcountrylist;
		 * System.out.println("Mother tongue after adding in to array : " + arr[k]); } }
		 * else { PP_Any = "Any";
		 * System.out.println("Mother tongue value is selected as :" + PP_Any); }
		 */

		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		// *********************religion**************///
		try {
			Sect_Denomination = driver.findElement(By.xpath("//span[contains(text(),'Sect - ')]//following::span[1]"))
					.getText();
			System.out.println("Sect_Denomination : " + Sect_Denomination);

		} catch (Exception e) {

		}

		Thread.sleep(3000);
		try {
			star = driver.findElement(By.xpath("//span[contains(text(),'Star - ')]//following::span[1]")).getText();
			System.out.println("star : " + star);

		} catch (Exception e) {
			System.out.println("No star is present");
		}

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
			PP_Country = driver.findElement(By.xpath("//span[contains(text(),'Country - ')]//following::span[1]"))
					.getText();
			System.out.println("PP_Country : " + PP_Country);
		} catch (Exception e) {

		}

		try {
			PP_State = driver.findElement(By.xpath("//span[contains(text(),'State - ')]//following::span[1]"))
					.getText();
			System.out.println("PP_State : " + PP_State);
		} catch (Exception e) {

		}
		try {
			PP_subcaste = driver.findElement(By.xpath("//span[contains(text(),'Subcaste - ')]//following::span[1]"))
					.getText();
			System.out.println("PP_subcaste : " + PP_subcaste);
		} catch (Exception e) {

		}

		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("admin");
		authScheme.setPassword("lRqW6WNT");
		RestAssured.authentication = authScheme;

		RestAssured.baseURI = "https://www.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&alreadyContOpt=1&SortBy=Last_Login%20DESC&EnablePhotoRequest=1&MatriId=CHY458603&PackageName=com.community.matrimony&AppVersionCode=149&SignalStrength=&alreadyViewedOpt=1&AppVersion=6.0&EncryptId=daca61b5635cbfc7f008ac0d90118c2d262e30f4&Referrer=LatestMatches&YTBVMatch=1&SrchTime=1&NetworkType=WIFI&UniqueId=37d0ab56f2&Page=1&mima=yes&DeviceVersion=8.1.0&igOpt=1&DeviceModel=SM-G610F&refpp=true&TokenId=&DevicePlatform=Android&OutputType=2&AppType=2&ignoredOpt=1&CarrierName=&resultperpage=20&TimeStamp="; 
				
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://www.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&alreadyContOpt=1&SortBy=Last_Login%20DESC&EnablePhotoRequest=1&MatriId=CHY458603&PackageName=com.community.matrimony&AppVersionCode=149&SignalStrength=&alreadyViewedOpt=1&AppVersion=6.0&EncryptId=daca61b5635cbfc7f008ac0d90118c2d262e30f4&Referrer=LatestMatches&YTBVMatch=1&SrchTime=1&NetworkType=WIFI&UniqueId=37d0ab56f2&Page=1&mima=yes&DeviceVersion=8.1.0&igOpt=1&DeviceModel=SM-G610F&refpp=true&TokenId=&DevicePlatform=Android&OutputType=2&AppType=2&ignoredOpt=1&CarrierName=&resultperpage=20&TimeStamp=");
		/*
		 * JSONObject json = new JSONObject(response); String sc =
		 * json.get("styles").toString(); System.out.println(sc);
		 */
		JsonPath jsonPathEvaluator = response.jsonPath(); 
		System.out.println("******API VALUES*******");
		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());

		String value1 = response.path("TOTALRESULTS").toString();
		System.out.println(value1);

		Float totaal = Float.parseFloat(value1);

		float tot = (float) (totaal / 10.0);
		System.out.println(tot);
		int total = (int) Math.ceil(tot);
		System.out.println(total);

		/*
		 * int a = Integer.parseInt(value1); int b = (a/20); int c = (int) Math.ceil(b);
		 * System.out.println(c);
		 */

		/*
		 * for (int i = 1; i < total; i++) {
		 * 
		 * System.out.println(i);
		 * 
		 * RestAssured.baseURI =
		 * "https://api.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&MatriId=BRH1393126&page="
		 * +i+"";
		 * 
		 * RequestSpecification httpRequest1 = RestAssured.given();
		 * 
		 * Response response1 = httpRequest1.request(Method.GET,
		 * "https://api.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&MatriId=BRH1393126&page="
		 * +i+""); JSONObject json = new JSONObject(response); String sc =
		 * json.get("styles").toString(); System.out.println(sc); JsonPath
		 * jsonPathEvaluator1= response1.jsonPath();
		 * 
		 * ResponseBody body1 = response1.getBody();
		 * System.out.println("Response Body is: " + body1.asString());
		 */

		List<Map<String, String>> response1 = response.jsonPath().getList("SEARCHRES.PROFILE");
		for (int j = 0; j < response1.size(); j++) {
			System.out.println("\n");
			System.out.println("*****   Profile NO: " + j + "   *******");
			System.out.println("\n");
			// System.out.println(j);
			System.out.println("Name :" + response1.get(j).get("NAME"));

			String agea = response1.get(j).get("AGE");
			Integer a = Integer.parseInt(agea);

			System.out.println("Age :" + response1.get(j).get("AGE"));
			System.out.println("Gender :" + response1.get(j).get("GENDER"));

			String Hght = response1.get(j).get("HEIGHT");

			String[] heightFf = Hght.split("/");

			String he1 = heightFf[1].toString().trim();

			String[] heightF1 = he1.split("cm");

			String he12 = heightF1[0].toString().trim();

			Integer f_apih_cms = Integer.parseInt(he12);

			System.out.println("Api height in cm :" + f_apih_cms);

			System.out.println("MaritalSatus :" + response1.get(j).get("MARITALSTATUS"));
			System.out.println("phoneverified :" + response1.get(j).get("PHONEVERIFIED"));
			System.out.println("MATRI ID :" + response1.get(j).get("MASKEDMATRIID"));
			String matriid = response1.get(j).get("MASKEDMATRIID");
			System.out.println(matriid);
			System.out.println("Denomination :" + response1.get(j).get("DENOMINATION"));
			System.out.println("Country :" + response1.get(j).get("COUNTRY"));
			System.out.println("Star :" + response1.get(j).get("STAR"));
			System.out.println("city :" + response1.get(j).get("CITY"));
			System.out.println("State :" + response1.get(j).get("STATE"));
			System.out.println("Education :" + response1.get(j).get("EDUCATION"));
			System.out.println("Caste :" + response1.get(j).get("CASTE"));
			System.out.println("subcaste :" + response1.get(j).get("SUBCASTE"));
			System.out.println("occupation :" + response1.get(j).get("OCCUPATION"));
			System.out.println("\n");
			System.out.println("*******   Validating the Advanced seacrh values and api values    *********");
			System.out.println("\n");
			//////////////// AGE VALIDATION/////////////
			boolean agestatus = false;
			if (a >= agef && a <= ageTo) {
				agestatus = true;

				System.out.println("AGE : " + a + " is in between " + agef + " and " + ageTo);
			}
			asrt.assertTrue(agestatus, a + " is not in between " + agef + " and " + ageTo + "for matrid : " + matriid);

			//////////////// HEIGHT VALIDATION /////////////
			System.out.println("Api height in cm :" + f_apih_cms);
			boolean htstatus = false;
			if (f_apih_cms >= ppcmsfrom && f_apih_cms <= ppcmsfrom1) {
				htstatus = true;

				System.out.println("Height : " + f_apih_cms + " is in between " + ppcmsfrom + " and " + ppcmsfrom1);
			}
			asrt.assertTrue(htstatus,
					f_apih_cms + " is not in between " + ppcmsfrom + " and " + ppcmsfrom1 + "for matrid : " + matriid);

			/// ***********************MARITAL STATUS*********************************** ///

			String apimaritalstus = response1.get(j).get("MARITALSTATUS");
			if (!maritalStatus.contains("Any")) {
				boolean mtstatus = false;
				if (maritalStatus.contains(apimaritalstus)) {
					// System.out.println(marital);
					mtstatus = true;
					System.out.println("Marital status : " + apimaritalstus
							+ " is present in the Partner preference field " + maritalStatus);
				}

				asrt.assertTrue(mtstatus,
						" marital status Value is selected as  " + apimaritalstus + " for matriid : " + matriid);
			}

			else {

				System.out.println("Marital status is selected as any in PP......");
			}

			String Api_Children_status = response1.get(j).get("CHILDRENLIVINGSSTATUS");

			if (!maritalStatus.contains("Any") && !maritalStatus.contains("Unmarried")) {
				boolean mtstatus1 = false;
				if (childrenStatus.contains(Api_Children_status)) {
					// System.out.println(marital);
					mtstatus1 = true;
					System.out.println("childrenStatus : " + Api_Children_status
							+ " is present in the Partner preference field " + childrenStatus);
				}

				asrt.assertTrue(mtstatus1,
						"childrenStatus Value is selected as  " + Api_Children_status + " for matriid : " + matriid);
			}

			else {

				System.out.println(
						"children status is not selected becoz marital status is selected any or unmarried in PP......");
			}

			String api_country = response1.get(j).get("COUNTRY");
			if (!PP_Country.contains("Any")) {
				boolean mtonge = false;
				if (PP_Country.contains(api_country)) {
					// System.out.println(marital);
					mtonge = true;
					System.out.println(
							"Country : " + api_country + " is present in the Partner preference field " + PP_Country);
				}

				asrt.assertTrue(mtonge, " Country Value is selected as  " + api_country + " for matriid : " + matriid);
			}

			else {

				System.out.println(" Country is selected as ANY in PP......");
			}

			String api_state = response1.get(j).get("STATE");
			if (PP_Country.contains("India") && !PP_State.contains("Any")) {
				boolean state = false;
				if (PP_State.contains(api_state)) {
					// System.out.println(marital);
					state = true;
					System.out.println(
							"State : " + api_state + " is present in the Partner preference field " + PP_State);
				}

				asrt.assertTrue(state, " State Value is selected as  " + api_state + " for matriid : " + matriid);
			}

			else {

				System.out.println(" state is selected as ANY in PP......");
			}

			String api_star = response1.get(j).get("STAR");
			if (!star.contains("Any")) {
				boolean starv = false;
				if (star.contains(api_star)) {
					// System.out.println(marital);
					starv = true;
					System.out.println("star : " + api_star + " is present in the Partner preference field " + star);
				}

				asrt.assertTrue(starv, " star Value is selected as  " + api_star + " for matriid : " + matriid);
			}

			else {

				System.out.println(" star is selected as ANY in PP......");
			}
			String api_scaste = response1.get(j).get("SUBCASTE");
			if (!PP_subcaste.contains("Any")) {
				boolean scas = false;
				if (PP_subcaste.contains(api_scaste)) {
					
					scas = true;
					System.out.println("PP_subcaste : " + api_scaste + " is present in the Partner preference field " + PP_subcaste);
				}

				asrt.assertTrue(scas, " subcaste Value is selected as  " + api_scaste + " for matriid : " + matriid);
			}

			else {

				System.out.println(" subcaste is selected as ANY in PP......");
			}
		}
              asrt.assertAll();
	}

}

