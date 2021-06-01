package testsceipt_PWA;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.Base;
import com.ObjectRepository.Login_Pom;
import com.ObjectRepository.Search;
import com.ObjectRepository.SearchApp_pom;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class Search_App {
	double ppcmsto, ppcmsfrom, ppcmsfrom1;
	String Requested_Id = null;
	String requested_deatils = null;
	String matid, country, State, star, ageFro, ageT, marital, search_agefrom, search_ageTo, Search_heigf, Search_heigt,
			Caste, PP_Any, PPcountrylist, x, PPstate, PPsubcaste, PPcaste, PPstar, subcaste, Sect, Denomination,
			Division;
	int ageFrom, ageTo, ageFrom1, ageTo1, i, total, denlistvalue, agef, heigt, heigtto, h, m, heightfrom, k, hc, sls;
	float heightTo;
	float heightFrom, heightFrom1, heightTo1, heightFrom2, heightTo2, Height, apiheightFrom;

	String[] arr, arr1, arr2, arr3, arr5;
	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "Untitled";
	protected AndroidDriver<AndroidElement> driver = null;

	DesiredCapabilities dc = new DesiredCapabilities();

	@BeforeTest
	public void setUp() throws MalformedURLException {
	       dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability(MobileCapabilityType.UDID, "936534f4");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.community.matrimony");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.domaininstance.ui.activities.Splash");
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);

	}

	@Test
	public void testUntitled() throws InterruptedException {

		Login_Pom l1 = new Login_Pom(driver);
	SearchApp_pom s = new SearchApp_pom(driver);

		try {
			Thread.sleep(2000);
			// b.login123("AGR11", "cbstest");
			Thread.sleep(5000);
			Base.click(l1.getLogin_skip_btn());
			Thread.sleep(2000);
			Base.click(l1.getLogin_btn());

			// Base.click(l.getEnter_Matrid());
			Thread.sleep(2000);
			Base.typeData(l1.getEnter_Matrid(), "CHY458603");
			Thread.sleep(2000);
			Base.typeData(l1.getEnter_passwrd(), "cbstest");
			Thread.sleep(2000);
			Base.click(l1.getEnter_Login());

			// Base.login123("SOU143878", "cbstest");
			System.out.println("login succesffully completed.....");
		} catch (Exception e) {
			System.out.println("Already Login.................");
		}

		Thread.sleep(10000);
		try {

			Thread.sleep(4000);
			Base.click(l1.getQuickrespnse_clse_btn());
			System.out.println("quick Response page Handled......");

		} catch (Exception e) {
			System.out.println("no quick response page displayed.....");
		}

		Thread.sleep(2000);
		try {

			Thread.sleep(4000);
			Base.click(driver.findElement(By.xpath("//*[@id='skip']")));
			System.out.println("Payment intermediate page Handled.....");

		} catch (Exception e) {
			System.out.println("no Payment intermediate page Handled .....");
		}

		try {

			Thread.sleep(4000);
			Base.click(l1.getInter_close());
			System.out.println("intermediate page Handled......");

		} catch (Exception e) {
			System.out.println("no intermediate page displayed.....");
		}

		Thread.sleep(5000);
		try {
			Base.click(l1.getNotification_access_later());
		} catch (Exception e) {
			System.out.println("Notification handled");
		}
		Thread.sleep(5000);

		Thread.sleep(5000);
		Base.click(s.getSearch_btn());

		
		Thread.sleep(5000);
		Base.click(s.getSearch_now_btn());

		Thread.sleep(5000);
		String Age = driver.findElement(By.xpath("//*[normalize-space(text()) = 'Age']")).getText();
		System.out.println(Age);

		Thread.sleep(5000);
		String Height = driver.findElement(By.xpath("//*[contains(text(),'Height')]")).getText();
		System.out.println(Height);

		Thread.sleep(5000);
		marital = driver.findElement(By.xpath("//*[contains(text(),'Marital Status')]")).getText();
		System.out.println(marital); /// Split the reguar search #key VALUE Age, Height , Marital Status
		Thread.sleep(5000);
		String[] ab = Age.split(" : ");
		String Agee = ab[1].toString();
		System.out.println(Agee);

		String[] A = Agee.split("to");
		String Ag = A[0].toString();
		System.out.println(Ag);
		String[] aG = Ag.split(" yrs");
		String AgeFrom = aG[0].toString();
		System.out.println("Age From = " + AgeFrom);
		agef = Integer.parseInt(AgeFrom);
		System.out.println("Age From = " + agef);

		String AgeT = A[1].toString();
		System.out.println(AgeT);
		String[] aG1 = AgeT.split(" yrs");
		String AgeTO = aG1[0].toString();
		String agrt = AgeTO.trim();
		System.out.println("Age To = " + AgeTO);
		ageTo = Integer.parseInt(agrt);
		System.out.println("Age To = " + ageTo);

		/// HEIGHT/////////////////
		String[] h1 = Height.split(" : ");
		System.out.println(h1[1]);
		String he1 = h1[1].toString();
		String[] h = he1.split(" to ");
		// System.out.println(h[1]);
		String he = h[0].toString();
		System.out.println(he);
		double htcms;
		String[] ht;
		ht = he.split(" ");
		System.out.println(ht[0]);
		String se = ht[0].replace("ft", "");
		System.out.println(se);
		int i1 = Integer.parseInt(se);
		System.out.println("i1: " + i1);

		try {

			String s1 = ht[1].replace("in", "");
			System.out.println(s1);
			htcms = Search.convertFeetandInchesToCentimeter(se, s1);
			System.out.println(htcms + "in is present");
		} catch (Exception e2) {
			htcms = Search.convertFeetandInchesToCentimeter(se, "0");
			System.out.println(htcms + "in is not present");
		}
		System.out.println(htcms);
		ppcmsfrom = Math.ceil(htcms);
		System.out.println("After converting height from value : " + ppcmsfrom);

		String het = h[1].toString();
		System.out.println(het);
		double htcms1;
		String[] htto;
		htto = het.split(" ");
		System.out.println(htto[0]);
		String s12 = htto[0].replace("ft", "");
		System.out.println(s12);
		int i12 = Integer.parseInt(s12);
		System.out.println("i1: " + i12);
		try {

			String s211 = htto[1].replace("in", "");
			System.out.println(s211);
			htcms1 = Search.convertFeetandInchesToCentimeter(s12, s211);
			System.out.println(htcms1 + " inches is present");
		} catch (Exception e2) {
			htcms1 = Search.convertFeetandInchesToCentimeter(s12, "0");
			System.out.println(htcms1 + " inches is not present");
		}

		System.out.println(htcms1);
		ppcmsfrom1 = Math.ceil(htcms1);
		System.out.println("After converting height to value: " + ppcmsfrom1);

		driver.findElement(By.xpath("//*[@text='More']")).click();

		 
		   //****************DIVISION FROM SEARCH**********************//
		
		try {
			Thread.sleep(2000);
			Division = driver.findElement(By.xpath("//*[contains(text(),'Division')]")).getText();
			System.out.println("search Division status :  " + Division);
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println("There is no Division field in Search field");
		}
		
		//****************SUBCASTE**********************//
		
		try {
			Thread.sleep(2000);
			subcaste = driver.findElement(By.xpath("//*[contains(text(),'Subcaste')]")).getText();
			System.out.println("search subcaste status :  " + subcaste);
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println("There is no subcaste field in Search field");
		}
		
		//****************CASTE FROM SEARCH**********************//
		
		try {
			Thread.sleep(2000);
			Caste = driver.findElement(By.xpath("//*[contains(text(),'Caste')]")).getText();
			System.out.println("search Caste status :  " + Caste);
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println("There is no Caste field in Search field");
		}

		Thread.sleep(4000);
		driver.swipe(0, 800, 0, 0, 2000);
		Thread.sleep(2000);
		
		//****************COUNTRY FROM SEARCH**********************//
		
		String country1 = driver.findElement(By.xpath("//*[contains(text(),'Country')]")).getText();
		System.out.println("search country status :  " + country1);
		
		String[] couns =country1.split(" : ");
		country = couns[1].toString();
		System.out.println(country);
		
		
		
		Thread.sleep(4000);
		//****************STATE FROM SEARCH**********************//
		if (country.contains("India")) {
			Thread.sleep(4000);
			State = driver.findElement(By.xpath("//*[contains(text(),'State')]")).getText();
			System.out.println("search State status :  " + State);
			Thread.sleep(4000);

		} else {
			System.out.println("Country selected as other than India,so state can be any");
		}

		Thread.sleep(4000);
		driver.swipe(0, 800, 0, 0, 2000);

		//****************SECT FROM SEARCH**********************//
		
		try {
			Thread.sleep(2000);
			Sect = driver.findElement(By.xpath("//*[contains(text(),'Sect')]")).getText();
			System.out.println("search Sect status :  " + Sect);
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println("There is no sect field in Search field");
		}

		//****************DENOMINATION FROM SEARCH**********************//
		
		try {
			Thread.sleep(2000);
			Denomination = driver.findElement(By.xpath("//*[contains(text(),'Denomination')]")).getText();
			System.out.println("search Denomination status :  " + Denomination);
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println("There is no Denomination field in Search field");
		}

	}

	@Test(priority = 2)
	public void search_PWA() throws InterruptedException {
		SoftAssert asrt = new SoftAssert();
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("admin");
		authScheme.setPassword("lRqW6WNT");
		RestAssured.authentication = authScheme;

		RestAssured.baseURI = "https://www.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&MatriId=KMC451599&start=0&resultperpage=20";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://www.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&MatriId=KMC451599&start=0&resultperpage=20");
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

		List<Map<String, String>> companies = response.jsonPath().getList("SEARCHRES.PROFILE");
		for (int j = 0; j < companies.size(); j++) {
			System.out.println("\n");
			System.out.println("*****   Profile NO: " + j + "   *******");
			System.out.println("\n");
			// System.out.println(j);
			System.out.println("Name :" + companies.get(j).get("NAME"));

			String age = companies.get(j).get("AGE");
			Integer a = Integer.parseInt(age);

			System.out.println("Age :" + companies.get(j).get("AGE"));
			System.out.println("Gender :" + companies.get(j).get("GENDER"));

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

				System.out.println("AGE : " + a + " is in between " + agef + " and " + ageTo);
			}
			asrt.assertTrue(agestatus, a + " is not in between " + agef + " and " + ageTo + "for matrid : " + matrid);

			        //////////////// HEIGHT VALIDATION/////////////

			boolean htstatus = false;
			if (f_apih_cms >= ppcmsfrom && f_apih_cms <= ppcmsfrom1) {
				htstatus = true;

				System.out.println("Height : " + f_apih_cms + " is in between " + ppcmsfrom + " and " + ppcmsfrom1);
			}
			asrt.assertTrue(htstatus,
					f_apih_cms + " is not in between " + ppcmsfrom + " and " + ppcmsfrom1 + "for matrid : " + matrid);

			/// ***********************MARITAL STATUS VALIDATION***********************************///

			String apimaritalstus = companies.get(j).get("MARITALSTATUS");

			if (!marital.contains("Any")) {
				boolean mtstatus = false;
				if (marital.contains(apimaritalstus)) {
					// System.out.println(marital);
					mtstatus = true;
					System.out.println("Marital status : " + apimaritalstus
							+ " is present in the Advanced search field " + marital);
				}

				asrt.assertTrue(mtstatus,
						" marital status Value is selected as  " + apimaritalstus + " for matriid : " + matrid);
			}

			else {

				System.out.println("Marital status is selected as any in serach......");
			}

			/// ***********************COUNTRY STATUS VALIDATION***********************************///
			
			String apicountry = companies.get(j).get("COUNTRY");

			if (!country.contains("Any")) {

				boolean countrystatus = false;
				if (country.contains(apicountry)) {
					countrystatus = true;
					System.out.println("Country status :  " + apicountry
							+ " is present in the Advanced search country field   : " + country);
				}

				asrt.assertTrue(countrystatus,
						" Country Value is selected as  " + apicountry + "  for matriid : " + matrid);
			}

			else {

				System.out.println(" Country status is selected as any in serach......");
			}

			/// ***********************STATE STATUS VALIDATION***********************************///
			
			
			String apistate = companies.get(j).get("STATE");

			if (country.contains("India") && !State.contains("Any")) {

				boolean statestatus = false;
				if (State.contains(apistate)) {
					statestatus = true;
					System.out.println(" State status :  " + apistate
							+ "  is present in the Advanced search country field : " + State);
				}

				asrt.assertTrue(statestatus, " state Value is selected as " + apistate + "  for matriid : " + matrid);
			}

			else if (country.equals("India")) {
				System.out.println(
						"State status : " + apistate + " is present in the Advanced search country field India");
			} else {
				System.out
						.println(" State status is selected as any /country selected other than india in serach......");
			}

			/// ***********************DENOMINATION STATUS VALIDATION***********************************///

			String apidinomination = companies.get(j).get("DENOMINATION");
			try {
				if (!Denomination.contains("Any")) {
					boolean apiden = false;
					if (Denomination.contains(apidinomination)) {
						// System.out.println(marital);
						apiden = true;
						System.out.println("Denomination status : " + apidinomination
								+ " is present in the Advanced search field " + Denomination);
					}

					asrt.assertTrue(apiden, "Denomination status Value is selected as " + apidinomination
							+ "  for matriid : " + matrid);
				}

				else {

					System.out.println("Denomination status is selected as any in seatrch......");
				}

			} catch (Exception e) {

				System.out.println("There is no denomination field present in search....");
			}

			/// ***********************CASTE STATUS VALIDATION***********************************///

			String apicaste = companies.get(j).get("CASTE");
			try {
				if (!Caste.contains("Any")) {

					boolean castestatus = false;
					if (Caste.contains(apicaste)) {
						castestatus = true;
						System.out.println(
								"Caste status : " + apicaste + " is present in the Advanced search  field : " + Caste);
					}

					asrt.assertTrue(castestatus,
							"Caste Value is selected as  " + apicaste + " for matriid : " + matrid);
				}

				else {

					System.out.println(" Caste status is selected as any in serach......");
				}
			} catch (Exception e) {
				System.out.println("There is caste field present for matri id : " + matrid);
			}
			
			
			/// ***********************DIVISION STATUS VALIDATION***********************************///
			try {
				if (!Division.contains("Any")) {

					boolean castestatus1= false;
					if (Division.contains(apicaste)) {
						castestatus1 = true;
						System.out.println(
								"Division status : " + apicaste + " is present in the Advanced search  field : " + Division);
					}

					asrt.assertTrue(castestatus1,
							"Division Value is selected as  " + apicaste + " for matriid : " + matrid);
				}

				else {

					System.out.println(" Division status is selected as any in serach......");
				}
			} catch (Exception e) {
				System.out.println("There is no division field present for matri id : " + matrid);
			}

			/// ***********************SUBCASTE STATUS VALIDATION***********************************///

			String apisubcaste = companies.get(j).get("SUBCASTE");
			
			try {
				if (!subcaste.contains("Any")) {

					boolean subcastestatus = false;
					if (subcaste.contains(apisubcaste)) {
						subcastestatus = true;
						System.out.println("Sub Caste status : " + apisubcaste + " is present in the Advanced search field  : " + subcaste);
					}

					asrt.assertTrue(subcastestatus," Sub Caste Value is selected as  " + apisubcaste + " for matriid : " + matrid);
				}

				else {

					System.out.println(" Sub Caste status is selected as any in serach......");
				}
			} catch (Exception e) {
				System.out.println("There is no sub caste field present for matri id : " + matrid);
			}

		}

		asrt.assertAll();

	}

}
