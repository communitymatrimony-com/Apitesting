package com.TestScripts;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;
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
import com.ObjectRepository.Search;
import com.ObjectRepository.inbox_POM;
import com.jayway.jsonpath.internal.function.text.Concatenate;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Search_verify {
	WebDriver driver;
	String Requested_Id = null;
	String requested_deatils = null;
	String matid, asd, ageFro, ageT, maritalStatus, mariedstatus1, Religion, Religion1, Caste, Caste1, SubCaste,
			SubCaste1, Education, Education1, country1, Occupation, search_agefrom, search_ageTo, Search_heigf,
			Search_heigt, PP_Any, PPcountrylist, x, PPstate, PPsubcaste, PPcaste, PPstar,PPdenomi;
	int ageFrom, ageTo, ageFrom1, ageTo1, i, total, denlistvalue, agef, heigt, heigtto, h, m, heightfrom, k, hc, sls;
	float heightTo;
	float heightFrom, heightFrom1, heightTo1, heightFrom2, heightTo2, Height, apiheightFrom;
	double ppcmsto, ppcmsfrom, ppcmsfrom1;
	String[] arr, arr1, arr2, arr3, arr5;

	@Test(enabled = true)
	public void dailySeven() {
		SoftAssert asrt = new SoftAssert();
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("admin");
		authScheme.setPassword("lRqW6WNT");
		RestAssured.authentication = authScheme;

		RestAssured.baseURI = "https://www.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&MatriId=CHY458603&start=0&resultperpage=20";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://www.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&MatriId=CHY458603&start=0&resultperpage=20");
		/*
		 * JSONObject json = new JSONObject(response); String sc =
		 * json.get("styles").toString(); System.out.println(sc);
		 */
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

		List<Map<String, String>> companies = response.jsonPath().getList("SEARCHRES.PROFILE");
		for (int j = 0; j < companies.size(); j++) {
			System.out.println("\n");
			System.out.println("*****   Profile NO: " + j + "   *******");
			System.out.println("\n");
			// System.out.println(j);
			System.out.println("Name :" + companies.get(j).get("NAME"));

			String age = companies.get(j).get("AGE");
			Integer a = Integer.parseInt(age);
			// System.out.println(age);

			System.out.println("Age :" + companies.get(j).get("AGE"));
			System.out.println("Gender :" + companies.get(j).get("GENDER"));
			// System.out.println("Height :" + companies.get(j).get("HEIGHT"));
			String Hght = companies.get(j).get("HEIGHT");
			// System.out.println(Hght);

			// Integer h = Integer.parseInt(Hght);
			// System.out.println(age);

			String[] heightF = Hght.split(" / ");

			String he1 = heightF[1].toString().trim();
			// System.out.println(he1);

			String[] heightF1 = he1.split(" ");

			String he12 = heightF1[0].toString().trim();
			// System.out.println(he12);
			Integer f_apih_cms = Integer.parseInt(he12);

			System.out.println("Api height in cm :" + f_apih_cms);

			System.out.println("MaritalSatus :" + companies.get(j).get("MARITALSTATUS"));
			System.out.println("phoneverified :" + companies.get(j).get("PHONEVERIFIED"));
			System.out.println("MATRI ID :" + companies.get(j).get("MASKEDMATRIID"));
			String matrid = companies.get(j).get("MASKEDMATRIID");
			// System.out.println(matrid);
			System.out.println("Denomination :" + companies.get(j).get("DENOMINATION"));
			System.out.println("Country :" + companies.get(j).get("COUNTRY"));
			System.out.println("Star :" + companies.get(j).get("STAR"));
			System.out.println("city :" + companies.get(j).get("CITY"));
			System.out.println("State :" + companies.get(j).get("STATE"));
			System.out.println("Education :" + companies.get(j).get("EDUCATION"));
			System.out.println("Caste :" + companies.get(j).get("CASTE"));
			System.out.println("subcaste :" + companies.get(j).get("SUBCASTE"));
			System.out.println("occupation :" + companies.get(j).get("OCCUPATION"));
			System.out.println("\n");
			System.out.println("*******   Validating the Advanced seacrh values and api values    *********");
			System.out.println("\n");
			
			//////////////// AGE VALIDATION/////////////
			
			boolean agestatus = false;
			
			if (a >= agef && a <= ageTo) {
				
				agestatus = true;

				System.out.println( "AGE : " + a + " is in between " + agef + " and " + ageTo );
			}
			
			asrt.assertTrue(agestatus, a + " is not in between " + agef + " and " + ageTo + "for matrid : " + matrid );

			//////////////// HEIGHT VALIDATION  /////////////
			
			
			boolean htstatus = false;
			if (f_apih_cms >= ppcmsfrom1 && f_apih_cms <= ppcmsfrom) {
				htstatus = true;

				System.out.println("Height : " + f_apih_cms + " is in between " + ppcmsfrom1 + " and " + ppcmsfrom);
			}
			asrt.assertTrue(htstatus, f_apih_cms + " is not in between " + ppcmsfrom1 + " and " + ppcmsfrom + "for matrid : " + matrid);

			/// ***********************  MARITAL STATUS  *********************************** //

			String apimaritalstus = companies.get(j).get("MARITALSTATUS");
			boolean mtstatus = false;
			if (apimaritalstus.equals("Unmarried")) {
				mtstatus = true;
				System.out.println("Marital status : " + apimaritalstus + " is present in the Advanced search country field ");

			}
			
			asrt.assertTrue(mtstatus, "marital status Value is selected as " + apimaritalstus + "for matriid : " + matrid);

			/// *********************** Denomination STATUS***********************************//
			

			String apidinomination = companies.get(j).get("DENOMINATION");

			boolean apiden = false;
			
			if (denlistvalue > 0) {

				for (int de = 0; de < arr5.length; de++) {
					if (apidinomination.equals(arr5[de])) {
						apiden = true;
						System.out.println("Denomination :  " + apidinomination + "   is present in the Advanced search country field  " + arr5[de]);
						break;
					}
				}
			if (true) {
				asrt.assertTrue(apiden,
						"denomination Value is selected as  " + apidinomination + "  for matriid : " + matrid);
			}
			}
			else {
				System.out.println("Denomination Value is given as :" + PP_Any + "from search field");

			}

			// =========================Country
			// validation=================================================================
			
			String apiCountry = companies.get(j).get("COUNTRY");
			try {
				if (!PPcountrylist.contains("Any")) {
				boolean ctstatus = false;
				for (int b = 0; b < arr.length; b++) {
					if (apiCountry.equals(arr[b])) {
						ctstatus = true;
						System.out.println("Country : " + apiCountry
								+ " is present in the Advanced search country field  " + arr[b]);
						break;
					}
				}
				if (true) {
					asrt.assertTrue(ctstatus, "Country Value is selected as " + apiCountry + "for matriid :" + matrid);
				}
				
				}
				
			} catch (Exception e) {
				System.out.println("Country Value is given as ANY from search field");
			}

			// *******************state validation************************//

			String apistate = companies.get(j).get("STATE");
			// System.out.println("api state " + j + ": " + companies.get(j).get("STATE"));
			try {

				if (apiCountry.contains("India") && !PPstate.contains("Any")) {
					boolean ststatus = false;
					for (int l = 0; l < arr.length; l++) {
						// System.out
						// .println(" api state : " + companies.get(j).get("STATE") + "is validating
						// with " + arr[l]);
						if (apiCountry.equals(arr[l])) {
							ststatus = true;
							System.out.println("State : " + apistate + " is present in the " + arr[l]);
							break;
						}
					}
					if (true) {
						asrt.assertTrue(ststatus, "state Value is selected as " + apistate + "for matriid :" + matrid);
					}
				}
					else if (apiCountry.equals("India")) {
						System.out.println(
								"State status : " + apistate + " is present in the Advanced search country field India");
					} else {
						System.out
								.println(" State status is selected as any /country selected other than india in serach......");
					}
			} catch (Exception e) {
				System.out.println("As country value is selected as any , state can be any value");
			}
			// *********************************SUB CASTE Validation
			// ******************************//
			try {

				String apiSubcaste = companies.get(j).get("SUBCASTE");
				// System.out.println("api country " + j + ": " +
				// companies.get(j).get("COUNTRY"));
				boolean subctstatus = false;
				for (int sc = 0; sc < arr1.length; sc++) {
					// System.out
					// .println(" api country : " + companies.get(j).get("COUNTRY") + " is
					// validating with " + arr[b]);
					if (apiSubcaste.equals(arr1[sc])) {
						subctstatus = true;
						System.out.println("Sub Caste : " + apiSubcaste
								+ " is present in the Advanced search country field  " + arr1[sc]);
						break;
					}
				}
				if (true) {
					asrt.assertTrue(subctstatus,
							"Sub caste Value is selected as " + apiSubcaste + "for matriid :" + matrid);
				}
			} catch (Exception e) {
				System.out.println("No subcaste value is present in api");
			}
			// ********************************* CASTE Validation
			// ******************************//
			try {
				String apicaste = companies.get(j).get("CASTE");
				// System.out.println("api country " + j + ": " +
				// companies.get(j).get("COUNTRY"));
				boolean caststatus = false;
				for (int sca = 0; sca < arr2.length; sca++) {
					// System.out
					// .println(" api country : " + companies.get(j).get("COUNTRY") + " is
					// validating with " + arr[b]);
					if (apicaste.equals(arr2[sca])) {
						caststatus = true;
						System.out.println("Caste :  " + apicaste + "  is present in the Advanced search country field  "
								+ arr2[sca]);
						break;
					}
				}
				if (true) {
					asrt.assertTrue(caststatus, " caste Value is selected as  " + apicaste + "for matriid : " + matrid);
				}

			} catch (Exception e) {
				System.out.println("Caste value is not present not updated in api values............");
			}
			// *********************************STAR Validation
			// ******************************//

			String apistar = companies.get(j).get("STAR");
			// System.out.println("api country " + j + ": " +
			// companies.get(j).get("COUNTRY"));

			try {
				boolean apistarl = false;
				for (int sl1 = 0; sl1 < arr3.length; sl1++) {
					// System.out
					// .println(" api country : " + companies.get(j).get("COUNTRY") + " is
					// validating with " + arr[b]);
					if (apistar.equals(arr3[sl1])) {
						apistarl = true;
						System.out.println(" STAR  : " + apistar + " is present in the Advanced search country field  "
								+ arr3[sl1]);
						break;
					}
				}
				if (true) {
					asrt.assertTrue(apistarl, "STAR Value is selected as " + apistar + "for matriid :" + matrid);
				}

			} catch (Exception e) {
				System.out.println("STAR value is selected as Any /not present in search field");
			}

		}
		asrt.assertAll();

	}

	@Test(enabled = true)
	public void Search_Verify() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\CBS\\SAI-master\\API_Testing\\driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.communitymatrimony.com");

		inbox_POM i = new inbox_POM(driver);
		Actions acc = new Actions(driver);
		Search s = new Search(driver);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		SoftAssert asrt1 = new SoftAssert();
		try {
			Base.click(i.getMatriId());
			Base.typeData(i.getMatriId(), "CHY458603");

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
		acc.moveToElement(s.getSearch()).build().perform();
		Thread.sleep(7000);
		acc.moveToElement(s.getAdvanced_search()).build().perform();
		Thread.sleep(6000);
		Base.click(s.getAdvanced_search());

		Thread.sleep(1500);
		////////////////// SEARCH AGE FROM /////////////////////
		Select sl = new Select(s.getAgeFrom());
		search_agefrom = sl.getFirstSelectedOption().getText();
		agef = Integer.parseInt(search_agefrom);
		System.out.println("Search Age from :" + search_agefrom);
		////////////////////// SEARCH AGE TO//////////////////////
		Select s1 = new Select(s.getAgeTo());
		search_ageTo = s1.getFirstSelectedOption().getText();
		ageTo = Integer.parseInt(search_ageTo);
		System.out.println("Search Age To :" + s1.getFirstSelectedOption().getText());

		////////////////////// SEARCH HEIGHT FROM//////////////////////
		Select s2 = new Select(s.getHeightFrom());
		Search_heigf = s2.getFirstSelectedOption().getText();
		String[] ht1;
		ht1 = Search_heigf.split(" ");
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
		System.out.println("After converting height from value: " + ppcmsfrom1);

		/*try {
			int i23 = Integer.parseInt(ht1[2]);
			System.out.println("i23: " + i23);
			String ss1 = i12 + "." + i23;
			System.out.println("ss1: " + ss1);

		} catch (Exception e) {
			System.out.println("******");
		}
*/
		////////////////////// SEARCH HEIGHT TO//////////////////////
		Select s3 = new Select(s.getHeightTo());
		Search_heigt = s3.getFirstSelectedOption().getText();
		String[] ht;
		ht = Search_heigt.split(" ");
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
		System.out.println("After converting height to value : " + ppcmsfrom);

		/*try {
			int i2 = Integer.parseInt(ht[2]);
			System.out.println("i2: " + i2);
			String ss = i1 + "." + i2;
			System.out.println("ss: " + ss);

		} catch (Exception e) {
			System.out.println("******");
		}*/
		Thread.sleep(1000);
		WebElement M_any = driver.findElement(By.xpath("//*[@id=\"Maritalvalidation\"]/div[1]/span/label"));
		Thread.sleep(1000);
		
		if (s.getMarital_status_any().isSelected()) {
			
			System.out.println(M_any.getText());
			
		} else {

			System.out.println("Any value not selected");
		}

		WebElement M_unm = driver.findElement(By.xpath("//*[@id=\"Maritalvalidation\"]/div[2]/span/label"));
		Thread.sleep(1000);
		if (s.getMarital_status_unmarried().isSelected()) {
			
			System.out.println(M_unm.getText());
		} else {

			System.out.println("unmarried value  not selected");

		}

		WebElement m_wi = driver.findElement(By.xpath("//*[@id=\"Maritalvalidation\"]/div[3]/span/label"));
		Thread.sleep(1000);
		if (s.getMarital_status_widow().isSelected()) {
			System.out.println(m_wi.getText());
		} else {
			System.out.println("widow value  not selected");

		}
		WebElement M_di = driver.findElement(By.xpath("//*[@id=\"Maritalvalidation\"]/div[4]/span/label"));
		Thread.sleep(1000);
		if (s.getMarital_status_divorceed().isSelected()) {
			System.out.println(M_di.getText());

		} else {

			System.out.println("divorced value  not selected");

		}
		WebElement M_se = driver.findElement(By.xpath("//*[@id=\"Maritalvalidation\"]/div[5]/span/label"));
		Thread.sleep(1000);
		if (s.getMarital_status_seperated().isSelected()) {
			System.out.println(M_se.getText());
		} else {
			System.out.println("seperated value  not selected");
		}

		/////////////// Advance SEARCH DENOMINATION VALUE /////////////////////////
		try {
			boolean den_value = false;
			Select s11 = new Select(s.getdenom_value());
			List<WebElement> denomi = s11.getOptions();

			denlistvalue = denomi.size();
			System.out.println(denlistvalue);
			if (denlistvalue > 0) {
				den_value = true;
				arr5 = new String[denomi.size()];
				for (m = 0; m < denomi.size(); m++) {

					PPdenomi = denomi.get(m).getText();
					System.out.println(" denomination string value " + m + " " + PPsubcaste);
					arr5[m] = PPdenomi;
					System.out.println(" denomination String value after adding in to array : " + arr5[m]);
				}
			} else {
				PP_Any = "Any";
				System.out.println("denomination  value is selected as :" + PP_Any);
			}
		} catch (Exception e) {
			System.out.println("There is no denomination field present for this domain.");
		}

		//////////////// **********COUNTRY****************////////////////
		js.executeScript("window.scrollBy(0,350)");

		Thread.sleep(1000);
		boolean cuntry = false;
		Select s6 = new Select(s.getCountry_deselect());
		List<WebElement> countrylist = s6.getOptions();
		int listvalue = countrylist.size();
		System.out.println(listvalue);
		if (listvalue > 0) {
			cuntry = true;
			arr = new String[countrylist.size()];
			for (k = 0; k < countrylist.size(); k++) {
				PPcountrylist = countrylist.get(k).getText();
				System.out.println("country value " + k + " " + PPcountrylist);
				arr[k] = PPcountrylist;
				System.out.println("country value after adding in to array : " + arr[k]);
			}
		} else {
			PP_Any = "Any";
			System.out.println("Country living value is selected as :" + PP_Any);
		}

		/////////////// Advance SEARCH STATE VALUE /////////////////////////

		Thread.sleep(1000);
		boolean state = false;
		Select s7 = new Select(s.getResiding_state_deselect());
		List<WebElement> statelist = s7.getOptions();

		int slistvalue = statelist.size();
		System.out.println(slistvalue);
		if (slistvalue > 0) {
			state = true;
			arr = new String[statelist.size()];
			for (int a = 0; a < statelist.size(); a++) {

				PPstate = statelist.get(a).getText();
				System.out.println(" state string value " + a + " " + PPstate);
				arr[a] = PPstate;
				System.out.println(" state String value after adding in to array : " + arr[a]);
			}
		} else {
			PP_Any = "Any";
			System.out.println("state living value is selected as :" + PP_Any);
		}
		Thread.sleep(1000);
		try {

			boolean subcaste = false;
			Select s8 = new Select(s.getSubcaste_deselect());
			List<WebElement> scaste = s8.getOptions();

			int sublistvalue = scaste.size();
			System.out.println(sublistvalue);
			if (sublistvalue > 0) {
				subcaste = true;
				arr1 = new String[scaste.size()];
				for (h = 0; h < scaste.size(); h++) {

					PPsubcaste = scaste.get(h).getText();
					System.out.println(" Subcaste string value " + h + " " + PPsubcaste);
					arr1[h] = PPsubcaste;
					System.out.println(" subcaste String value after adding in to array : " + arr1[h]);
				}
			} else {
				PP_Any = "Any";
				System.out.println("subcaste  value is selected as :" + PP_Any);
			}
		} catch (Exception e) {
			System.out.println("There is no subcaste field present for this domain.");
		}
		Thread.sleep(1000);
		try {

			boolean caste = false;
			Select s9 = new Select(s.getcaste_deselect());
			List<WebElement> castev = s9.getOptions();

			int castelistvalue = castev.size();
			System.out.println(castelistvalue);
			if (castelistvalue > 0) {
				caste = true;
				arr2 = new String[castev.size()];
				for (hc = 0; hc < castev.size(); hc++) {

					PPcaste = castev.get(hc).getText();
					System.out.println(" caste string value " + hc + " " + PPcaste);
					arr2[hc] = PPcaste;
					System.out.println("caste String value after adding in to array : " + arr2[hc]);
				}
			} else {
				PP_Any = "Any";
				System.out.println("caste  value is selected as :" + PP_Any);
			}

		} catch (Exception e) {
			System.out.println("Caste value is not present in the Advance search field...............");
		}

		try {

			boolean star = false;
			Select s10 = new Select(s.getStar_deselect());
			List<WebElement> starl = s10.getOptions();

			int starlistvalue = starl.size();
			System.out.println(starlistvalue);
			if (starlistvalue > 0) {
				star = true;
				arr3 = new String[starl.size()];
				for (sls = 0; sls < starl.size(); sls++) {
					PPstar = starl.get(sls).getText();
					System.out.println(" star string value " + sls + " " + PPstar);
					arr3[sls] = PPcaste;
					System.out.println("star String value after adding in to array : " + arr3[sls]);
				}
			} else {
				PP_Any = "Any";
				System.out.println("star  value is selected as :" + PP_Any);
			}

		} catch (Exception e) {
			System.out.println("star value is not present in the Advance search field...............");

	}
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"srcform\"]/div[3]/div[13]/div[1]/input[1]")).click();
		
		
		
		
		
		
	}
}
