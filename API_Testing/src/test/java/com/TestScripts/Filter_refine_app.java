
package com.TestScripts;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.Base;
import com.Base.edit_pom_app;
import com.Base.login_pom_app;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;

public class Filter_refine_app {
	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "Untitled";
	protected AndroidDriver<AndroidElement> driver = null;
	String matid, asd, ageFro, ageT, maritalStatus, mariedstatus1, Religion, Religion1, Caste, Caste1, SubCaste,
			SubCaste1, Education, Education1, country1, Occupation, search_agefrom, search_ageTo, Search_heigf,
			Search_heigt, PP_Any, PPcountrylist, x, PPstate, PPsubcaste, PPcaste, PPstar, PPdenomi, id1;
	int ageFrom, ageTo, ageFrom1, ageTo1, i, total, denlistvalue, agef, heigt, heigtto, h, m, heightfrom, k, hc, sls,
			num;
	float heightTo;
	float heightFrom, heightFrom1, heightTo1, heightFrom2, heightTo2, Height, apiheightFrom;
	double ppcmsto, ppcmsfrom, ppcmsfrom1;
	String[] arr, arr1, arr2, arr3, arr5;

	DesiredCapabilities dc = new DesiredCapabilities();

	@BeforeTest
	public void setUp() throws MalformedURLException {
		dc.setCapability("reportDirectory", reportDirectory);
		dc.setCapability("reportFormat", reportFormat);
		dc.setCapability("testName", testName);
		dc.setCapability(MobileCapabilityType.UDID, "52003132ecda25f7");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.brahminmatrimony");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.domaininstance.ui.activities.Splash");
		driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.setLogLevel(Level.INFO);

	}

	@Test
	public void testUntitled() throws InterruptedException {
		SoftAssert asrt = new SoftAssert();
		edit_pom_app p1 = new edit_pom_app(driver);
		// Matches_Pom p = new Matches_Pom(driver);
		Base b = new Base();
		login_pom_app l = new login_pom_app(driver);
		// Delete_POM d = new Delete_POM(driver);
		for (int i = 0; i <= 0; i++) {
			try {
				Thread.sleep(2000);

				// Base.click(l.getLogin_skip_btn());
				Thread.sleep(2000);
				// Base.click(l.getLogin_btn());

				// BaseTest.click(l.getEnter_Matrid());
				Thread.sleep(2000);
				Base.typeData(l.getEnter_Matrid(), "BRH2881285");
				Thread.sleep(2000);
				Base.typeData(l.getEnter_passwrd(), "cbstest");
				Thread.sleep(2000);
				Base.click(l.getEnter_Login());

			} catch (Exception e) {
				System.out.println("Already Login.................");
			}
		}
		Thread.sleep(10000);

		try {

			Thread.sleep(4000);
			Base.click(l.getQuickrespnse_clse_btn());
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
			Base.click(l.getInter_close());
			System.out.println("intermediate page Handled......");

		} catch (Exception e) {
			System.out.println("no intermediate page displayed.....");
		}
		Thread.sleep(5000);
		b.click(driver.findElement(By.xpath("//*[@text='Matches']")));
		Thread.sleep(10000);

		/*
		 * b.click(driver.findElement(By.
		 * xpath("//*[@class='android.view.View' and ./*[@text='close']]")));
		 * Thread.sleep(5000);
		 * 
		 * //*[@text='Profile Created by']
		 * 
		 * 
		 * b.click(driver.findElement(By.
		 * xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@id='background-content'] and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[./*[./*[./*[@text='Filter & Refine']]]]]]]]/*[@class='android.view.View'])[7]/*[@class='android.view.View'])[1]/*[@class='android.view.View'])[1]/*[@class='android.view.View'])[2 and @top='true']"
		 * ))); Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//*[@text='Any']")).click(); Thread.sleep(5000);
		 * AndroidElement
		 * profile_created_by=driver.findElement(By.xpath("//*[@text='Sibling']"));
		 * String field_select = profile_created_by.getText();
		 * System.out.println(field_select); Thread.sleep(2000);
		 * profile_created_by.click(); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//*[@text='Submit']")).click();
		 * Thread.sleep(10000); //driver.findElement(By.
		 * xpath("//*[@text and @class='android.widget.Button' and ./parent::*[./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@class='android.view.View']]]]]]"
		 * )).click();
		 * driver.findElement(By.xpath("(//*[@class='android.widget.Button'])[6]")).
		 * click();
		 */
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Got it ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='android.widget.ToggleButton'])[2]")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath(
				"//*[@text and @class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@text]]]]"))
				.getText();
		String[] split_count = text.split(" ");
		String scount = split_count[0].toString();
		System.out.println(scount);
		/*
		 * String trims =scount.trim(); String sc1=trims.toString(); int counta =
		 * Integer.parseInt(sc1); System.out.println(counta);
		 */
		Thread.sleep(15000);
		driver.findElement(By.xpath(
				"(//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@id='background-content'] and ./parent::*[@class='android.view.View' and ./parent::*[./parent::*[./parent::*[@class='android.view.View']]]]]]/*/*/*[@class='android.view.View' and ./*[@text and @class='android.view.View'] and ./*[./*[./*[@class='android.view.View']]] and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@class='android.widget.Image']]]])[1]"))
				.click();
		Thread.sleep(15000);

		// taking the total ids count and splitting

		// click on view profile and get the matri id
		for (int i = 0; i < 100; i++) {

			Thread.sleep(15000);

			AndroidElement vp_id = driver.findElement(By.xpath("(//*[@class='android.view.View'])[37]"));
			String vp_id1 = vp_id.getText();
			System.out.println(vp_id1);
			String[] id = vp_id1.split(" ");
			id1 = id[0].toString();
			System.out.println(id1);
			// num = Integer.parseInt(id1);

			// MobileElement element = (MobileElement)
			// driver.findElement(MobileBy.AndroidUIAutomator(
			// "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
			// ".scrollIntoView(new UiSelector().text(\"Profile Created For\"))"));
			// (//*[@class='android.view.View' and ./parent::*[@class='android.view.View'
			// and (./preceding-sibling::* |
			// ./following-sibling::*)[@id='background-content'] and
			// ./parent::*[@class='android.view.View' and
			// ./parent::*[./parent::*[./parent::*[@class='android.view.View']]]]]]/*/*/*[@class='android.view.View'
			// and ./*[@text and @class='android.view.View'] and
			// ./*[./*[./*[@class='android.view.View']]] and (./preceding-sibling::* |
			// ./following-sibling::*)[./*[./*[@class='android.widget.Image']]]])[1]

			PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
			authScheme.setUserName("admin");
			authScheme.setPassword("lRqW6WNT");
			RestAssured.authentication = authScheme;

			RestAssured.baseURI = "https://api.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&MatriId=BRH2881285&EncryptId=186969e466e28df84a97e43ed3169ce3a325e6b5&GetAllPPCond=true&OutputType=2&AppType=1&Search_Id=&TokenId=5ca062fe3e477e3b87f31534259339fa0ddfa721&Gender=1&CommunityId=25&Page=1&resultperpage=20&igOpt=1&ignoredOpt=1&EnablePhotoRequest=1&EncPPCond=MS%5E%5E~%5E0%23%5E%23%40F%5E%5E~%5E18%23%5E%23%40T%5E%5E~%5E33%23%5E%23!F%5E%5E~%5E137.16%23%5E%23!T%5E%5E~%5E241.30%23%5E%23MT%5E%5E~%5E0%23%5E%23CO%5E%5E~%5E0%23%5E%23RST%5E%5E~%5E0%23%5E%23RD%5E%5E~%5E0%23%5E%23PSS%5E%5E~%5Etrue%23%5E%23HA%5E%5E~%5Efalse%23%5E%23AV%5E%5E~%5Etrue%23%5E%23AC%5E%5E~%5Etrue%23%5E%23SL%5E%5E~%5Etrue%23%5E%23IL%5E%5E~%5Etrue%23%5E%23CD%5ECat%5E~%5E0%23%5E%23sortbytype%5E~%5ERELEVANCE_FUNC%23%5E%23CAID%5E%5E~%5E0%23%5E%23SID%5E%5E~%5E0%23%5E%23STR%5E%5E~%5E0%23%5E%23GID%5E%5E~%5E0%23%5E%23SEC%5E%5E~%5E0%23%5E%23manglik%5E~%5E0%23%5E%23TAI%5E%5E~%5E0~0%23%5E%23annualincomeTo%5E~%5E0%23%5E%23OC%5E%5E~%5E0%23%5E%23PCB%5E%5E~%5E0%23%5E%23EI%5E%5E~%5E0%23%5E%23DR%5E%5E~%5E0%23%5E%23SM%5E%5E~%5E0%23%5E%23PS%5E%5E~%5E0%23%5E%23FT%5E%5E~%5E0%23%5E%23CI%5E%5E~%5E0%23%5E%23EH%5E%5E~%5E0%23%5E%23FS%5E%5E~%5E0%23%5E%23&alreadyViewedOpt=1&alreadyContOpt=1&photoOpt=1&horoscopeOpt=0&shortlistOpt=1&changesOpt=true&sortbytype=relevance_func&EnablePrime=0&refpp=&Module=search&Token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJJQVQiOjE2MTU4MDkxNzksIkpUSSI6IlFsSklNamc0TVRJNE5URTJNVFU0TURreE56a3VOREV5TkE9PSIsIklTUyI6Ind3dy5icmFobWlubWF0cmltb255LmNvbSIsIk5CRiI6MTYxNTgwOTE3OSwiRVhQIjoxNjE4NDAxMTc5LCJEYXRhIjp7Ik1hdHJpSWQiOiJCUkgyODgxMjg1IiwiRW5jSWQiOiIxODY5NjllNDY2ZTI4ZGY4NGE5N2U0M2VkMzE2OWNlM2EzMjVlNmI1In19.HXXAE3wzoGUjvWTg17SVPD1BkdGDN6vlv7jp4WkvZtc&resultperpage=100";

			RequestSpecification httpRequest = RestAssured.given();

			Response response = httpRequest.request(Method.GET,
					"https://api.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&MatriId=BRH2881285&EncryptId=186969e466e28df84a97e43ed3169ce3a325e6b5&GetAllPPCond=true&OutputType=2&AppType=1&Search_Id=&TokenId=5ca062fe3e477e3b87f31534259339fa0ddfa721&Gender=1&CommunityId=25&Page=1&resultperpage=20&igOpt=1&ignoredOpt=1&EnablePhotoRequest=1&EncPPCond=MS%5E%5E~%5E0%23%5E%23%40F%5E%5E~%5E18%23%5E%23%40T%5E%5E~%5E33%23%5E%23!F%5E%5E~%5E137.16%23%5E%23!T%5E%5E~%5E241.30%23%5E%23MT%5E%5E~%5E0%23%5E%23CO%5E%5E~%5E0%23%5E%23RST%5E%5E~%5E0%23%5E%23RD%5E%5E~%5E0%23%5E%23PSS%5E%5E~%5Etrue%23%5E%23HA%5E%5E~%5Efalse%23%5E%23AV%5E%5E~%5Etrue%23%5E%23AC%5E%5E~%5Etrue%23%5E%23SL%5E%5E~%5Etrue%23%5E%23IL%5E%5E~%5Etrue%23%5E%23CD%5ECat%5E~%5E0%23%5E%23sortbytype%5E~%5ERELEVANCE_FUNC%23%5E%23CAID%5E%5E~%5E0%23%5E%23SID%5E%5E~%5E0%23%5E%23STR%5E%5E~%5E0%23%5E%23GID%5E%5E~%5E0%23%5E%23SEC%5E%5E~%5E0%23%5E%23manglik%5E~%5E0%23%5E%23TAI%5E%5E~%5E0~0%23%5E%23annualincomeTo%5E~%5E0%23%5E%23OC%5E%5E~%5E0%23%5E%23PCB%5E%5E~%5E0%23%5E%23EI%5E%5E~%5E0%23%5E%23DR%5E%5E~%5E0%23%5E%23SM%5E%5E~%5E0%23%5E%23PS%5E%5E~%5E0%23%5E%23FT%5E%5E~%5E0%23%5E%23CI%5E%5E~%5E0%23%5E%23EH%5E%5E~%5E0%23%5E%23FS%5E%5E~%5E0%23%5E%23&alreadyViewedOpt=1&alreadyContOpt=1&photoOpt=1&horoscopeOpt=0&shortlistOpt=1&changesOpt=true&sortbytype=relevance_func&EnablePrime=0&refpp=&Module=search&Token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJJQVQiOjE2MTU4MDkxNzksIkpUSSI6IlFsSklNamc0TVRJNE5URTJNVFU0TURreE56a3VOREV5TkE9PSIsIklTUyI6Ind3dy5icmFobWlubWF0cmltb255LmNvbSIsIk5CRiI6MTYxNTgwOTE3OSwiRVhQIjoxNjE4NDAxMTc5LCJEYXRhIjp7Ik1hdHJpSWQiOiJCUkgyODgxMjg1IiwiRW5jSWQiOiIxODY5NjllNDY2ZTI4ZGY4NGE5N2U0M2VkMzE2OWNlM2EzMjVlNmI1In19.HXXAE3wzoGUjvWTg17SVPD1BkdGDN6vlv7jp4WkvZtc&resultperpage=100");
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

				String[] heightF1 = he1.split(" ");

				String he12 = heightF1[0].toString().trim();
				System.out.println(he12);

				String[] hecms = he12.split("cm");

				String he1223 = hecms[0].toString().trim();

				Integer f_apih_cms = Integer.parseInt(he1223);

				System.out.println("Api height in cm :" + f_apih_cms);

				System.out.println("MaritalSatus :" + response1.get(j).get("MARITALSTATUS"));
				System.out.println("phoneverified :" + response1.get(j).get("PHONEVERIFIED"));
				System.out.println("MATRI ID : " + response1.get(j).get("MASKEDMATRIID"));
				String matrid = response1.get(j).get("MASKEDMATRIID");
				System.out.println(matrid);
				System.out.println("Denomination : " + response1.get(j).get("DENOMINATION"));
				System.out.println("Country : " + response1.get(j).get("COUNTRY"));
				System.out.println("Star : " + response1.get(j).get("STAR"));
				System.out.println("city : " + response1.get(j).get("CITY"));
				System.out.println("State : " + response1.get(j).get("STATE"));
				System.out.println("Education : " + response1.get(j).get("EDUCATION"));
				System.out.println("Caste : " + response1.get(j).get("CASTE"));
				System.out.println("subcaste : " + response1.get(j).get("SUBCASTE"));
				System.out.println("occupation : " + response1.get(j).get("OCCUPATION"));
				System.out.println("\n");
				System.out.println("*******   Validating the Advanced seacrh values and api values    *********");
				System.out.println("\n");

				/*
				 * boolean agestatus = false;
				 * 
				 * if (a >= agef && a <= ageTo) {
				 * 
				 * agestatus = true;
				 * 
				 * System.out.println("AGE : " + a + " is in between " + agef + " and " +
				 * ageTo); }
				 * 
				 * asrt.assertTrue(agestatus, a + " is not in between " + agef + " and " + ageTo
				 * + "for matrid : " + matrid);
				 * 
				 * //////////////// HEIGHT VALIDATION /////////////
				 * 
				 * boolean htstatus = false; if (f_apih_cms >= ppcmsfrom1 && f_apih_cms <=
				 * ppcmsfrom) { htstatus = true;
				 * 
				 * System.out.println("Height : " + f_apih_cms + " is in between " + ppcmsfrom1
				 * + " and " + ppcmsfrom); } asrt.assertTrue(htstatus, f_apih_cms +
				 * " is not in between " + ppcmsfrom1 + " and " + ppcmsfrom + "for matrid : " +
				 * matrid);
				 * 
				 * /// *********************** MARITAL STATUS
				 ***********************************///

				/*
				 * String apimaritalstus = response1.get(j).get("MARITALSTATUS"); boolean
				 * mtstatus = false; if (apimaritalstus.equals("Unmarried")) { mtstatus = true;
				 * System.out.println( "Marital status : " + apimaritalstus +
				 * " is present in the Advanced search country field ");
				 */
				// }

				// asrt.assertTrue(mtstatus,
				// "marital status Value is selected as " + apimaritalstus + "for matriid : " +
				// matrid);
				List<Map<String, String>> response122 = response.jsonPath().getList("SEARCHRES.PROFILE.MASKEDMATRIID");
				System.out.println(response122);

				boolean mid = false;
				if (response122.contains(id1)) {
					mid = true;
					System.out.println("Matrid is :" + response122 + "is present in app listing " + id1);
				}
				asrt.assertTrue(mid, "mAtrid  Value is present as " + response122 + "is present in app listing " + id1);
			}
				Thread.sleep(10000);
				
					driver.findElement(By.xpath("//*[@text='']")).click();
			

			}

			// asrt.assertAll();

			/*
			 * @AfterTest public void tearDown() { // driver.resetApp(); driver.quit();
			 * reports.endTest(test); reports.flush(); // driver.resetApp(); //
			 * driver.quit();
			 * 
			 * // test.log(LogStatus.PASS, "Application Closed Succesfull"); //
			 * reports.endTest(test);
			 * 
			 * }
			 */
		
		asrt.assertAll();
	}

}