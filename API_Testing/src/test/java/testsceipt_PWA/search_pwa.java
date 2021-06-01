package testsceipt_PWA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.Base;
import com.ObjectRepository.Search;
import com.ObjectRepository.searchpwapom;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class search_pwa extends Base {
	double ppcmsto, ppcmsfrom, ppcmsfrom1;
	String Requested_Id = null;
	String requested_deatils = null;
	String matid, country, State, star, ageFro, ageT, marital, search_agefrom, search_ageTo, Search_heigf, Search_heigt,
			Caste, PP_Any, PPcountrylist, x, PPstate, PPsubcaste, PPcaste, PPstar, subcaste, Sect, Division,
			Denomination;
	int ageFrom, ageTo, ageFrom1, ageTo1, i, total, denlistvalue, agef, heigt, heigtto, h, m, heightfrom, k, hc, sls;
	float heightTo;
	float heightFrom, heightFrom1, heightTo1, heightFrom2, heightTo2, Height, apiheightFrom;

	String[] arr, arr1, arr2, arr3, arr5;

	public static WebDriver driver;
	String driverExecutablePath = "F:\\Softwares\\CBS\\SAI-master\\API_Testing\\lib\\chromedriver.exe";

	@Test(priority = 2)
	public void search_PWA() throws InterruptedException {
		SoftAssert asrt = new SoftAssert();
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("admin");
		authScheme.setPassword("lRqW6WNT");
		RestAssured.authentication = authScheme;

		RestAssured.baseURI = "https://www.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&MatriId=CHR2072240&start=0&resultperpage=20";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://www.communitymatrimony.com/api/webservicecall.php?filename=searchcurl&Module=Allmatches&MatriId=CHR2072240&start=0&resultperpage=20");
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

			/// ***********************MARITAL STATUS***********************************//

			String apimaritalstus = companies.get(j).get("MARITALSTATUS");

			if (!marital.equals("Any")) {
				boolean mtstatus = false;
				if (marital.contains(apimaritalstus)) {
					// System.out.println(marital);
					mtstatus = true;
					System.out.println("Marital status : " + apimaritalstus
							+ " is present in the Advanced search field " + marital);
				}

				asrt.assertTrue(mtstatus,
						"marital status Value is selected as " + apimaritalstus + "for matriid : " + matrid);
			}

			else {

				System.out.println("Marital status is selected as any in serach......");
			}

			/////////////////// Country/////////////////////////

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

			////////////// Denomination////////////////////

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

			////////// CASTE VAlidation///////////////////

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
				System.out.println("There is  no caste field present for matri id : " + matrid);
			}
			// String apicaste = companies.get(j).get("CASTE");

			//////////////////// Division//////////////////////
			try {
				if (!Division.contains("Any")) {

					boolean castestatus1 = false;
					if (Division.contains(apicaste)) {
						castestatus1 = true;
						System.out.println("Division status : " + apicaste
								+ " is present in the Advanced search  field : " + Division);
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

			///////////////// SUB CASTE Validation///////////////////////

			String apisubcaste = companies.get(j).get("SUBCASTE");
			try {
				if (!subcaste.contains("Any")) {

					boolean subcastestatus = false;
					if (subcaste.contains(apisubcaste)) {
						subcastestatus = true;
						System.out.println("Sub Caste status : " + apisubcaste
								+ " is present in the Advanced search field  : " + subcaste);
					}

					asrt.assertTrue(subcastestatus,
							" Sub Caste Value is selected as  " + apisubcaste + " for matriid : " + matrid);
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

	@Test(priority = 1)
	public void testUntitled() throws Throwable {

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Pixel 2");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		chromeOptions.addArguments("--disable-notifications");
		driver = new ChromeDriver(chromeOptions);

		searchpwapom rp = new searchpwapom(driver);
		Thread.sleep(5000);
		driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// login
		WebElement e = driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a = new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e, "CHR2072240").build().perform();

		Thread.sleep(4000);

		WebElement d = driver.findElement(By.xpath("//*[@id='password1']"));
		Thread.sleep(4000);
		Actions b = new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d, "cbstest").build().perform();

		Thread.sleep(4000);
		Base.click(rp.getLogin());
		Thread.sleep(8000);

		Thread.sleep(4000);
		Base.click(rp.getSearch1());

		Thread.sleep(4000);
		// driver.findElement(By.xpath("//input[@placeholder='Search
		// ById']")).sendKeys(String.valueOf(Base.getExcelData1("search", 1,1)));

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='search_icon']")).click();

		try {
			Thread.sleep(4000);
			String text = driver.findElement(By.xpath(
					"/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[2]/ion-grid[2]/ion-row[1]/ion-col/p"))
					.getText();
			System.out.println(text);

		} catch (Exception e2) {

		}

		/// regular search

		// age
		Thread.sleep(4000);
		String Age = driver.findElement(By.xpath(
				"/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[1]/div[1]/div/ion-label/div[2]"))
				.getText();
		System.out.println(Age);
		Thread.sleep(5000);
		String[] A = Age.split(" - ");
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
		System.out.println("Age To = " + AgeTO);
		ageTo = Integer.parseInt(AgeTO);
		System.out.println("Age To = " + ageTo);

		// height

		Thread.sleep(4000);

		String Height = driver.findElement(By.xpath(
				"/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[2]/div[1]/div/ion-label/div[2]"))
				.getText();

		System.out.println(driver.findElement(By.xpath(
				"/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[2]/div[1]/div/ion-label/div[2]"))
				.getText());

		String[] h = Height.split(" - ");
		String he = h[0].toString();
		System.out.println(he);
		double htcms;
		String[] ht;
		ht = he.split(" ");
		System.out.println(ht[0]);
		String s = ht[0].replace("ft", "");
		System.out.println(s);
		int i1 = Integer.parseInt(s);
		System.out.println("i1: " + i1);

		try {

			String s1 = ht[1].replace("in", "");
			System.out.println(s1);
			htcms = Search.convertFeetandInchesToCentimeter(s, s1);
			System.out.println(htcms + "in is present");
		} catch (Exception e2) {
			htcms = Search.convertFeetandInchesToCentimeter(s, "0");
			System.out.println(htcms + "in is not present");
		}
		System.out.println(htcms);
		ppcmsfrom = Math.ceil(htcms);
		System.out.println("After converting height from value : " + ppcmsfrom);

		// String[] h = Height.split(" - ");J
		String het = h[1].toString();
		System.out.println(het);
		double htcms1;
		String[] htto;
		htto = het.split(" ");
		System.out.println(htto[0]);
		String s12 = htto[0].replace("ft", "");
		System.out.println(s);
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

		// marital status

		Thread.sleep(4000);

		marital = driver.findElement(By.xpath("//*[text()='Marital Status']/following-sibling::*")).getText();

		System.out.println("search marital status :  " + marital);

		try {
			Thread.sleep(2000);
			Division = driver.findElement(By.xpath("//*[text()='Division']/following-sibling::*")).getText();
			System.out.println("search Division status :  " + Division);
			Thread.sleep(4000);
		} catch (Exception e2) {
			System.out.println("There is no Division field in Search field");
		}

		Thread.sleep(4000);

		// Caste
		try {
			Caste = driver.findElement(By.xpath("//*[text()='Caste / Division']/following-sibling::*")).getText();
			System.out.println("search caste status :  " + Caste);

		} catch (Exception e2) {
			System.out.println("There is no Caste field in Search field");
		}

		// SubCaste
		try {
			Thread.sleep(4000);
			subcaste = driver.findElement(By.xpath("//*[text()='Subcaste']/following-sibling::*")).getText();

			System.out.println("search subcaste status :  " + subcaste);

		} catch (Exception e2) {
			System.out.println("There is no Subcaste field in Search field");
		}

		/*
		 * // star
		 * /html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/
		 * ion-row/ion-col/form/div[2]/ion-list/ion-item[4]/div[1]/div/ion-label/div[2]
		 * Thread.sleep(4000); star = driver.findElement(By.xpath(
		 * "/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[4]/div[1]/div/ion-label/div[2]"
		 * )) .getText(); System.out.println("search star status :  " + star);
		 */

		try {
			Thread.sleep(4000);
			Sect = driver.findElement(By.xpath("//*[text()='Sect']/following-sibling::*")).getText();

			System.out.println("search Sect status :  " + Sect);

		} catch (Exception e2) {
			System.out.println("Sect value is not given.......");
		}

		try {
			Thread.sleep(2000);
			Denomination = driver.findElement(By.xpath("//*[text()='Denomination']/following-sibling::*")).getText();
			System.out.println("search Denomination status :  " + Denomination);
			Thread.sleep(4000);
		} catch (Exception e2) {
			System.out.println("There is no Denomination field in Search field");
		}

		// *[text()='Sect']/following-sibling::*

		// country

		Thread.sleep(8000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement edi2 = driver.findElement(By.xpath(
				"/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[6]/div[1]/div"));
		js2.executeScript("arguments[0].scrollIntoView(true);", edi2);

		Thread.sleep(4000);
		country = driver.findElement(By.xpath("//*[text()='Country']/following-sibling::*")).getText();
		System.out.println("search country status :  " + country);
		Thread.sleep(4000);

		// State

		if (country.contains("India")) {
			Thread.sleep(4000);
			State = driver.findElement(By.xpath("//*[text()='State']/following-sibling::*")).getText();
			System.out.println("search State status :  " + State);
			Thread.sleep(4000);

		} else {
			System.out.println("Country selected as other than India,so state can be any");
		}

		// search now
		/*
		 * Thread.sleep(4000); driver.findElement(By.xpath(
		 * "/html/body/ion-app/ng-component/page-search/ion-footer/ion-toolbar/div[2]/ion-grid/ion-row/ion-col[3]"
		 * )).click();
		 * 
		 * try { Thread.sleep(4000); WebElement
		 * txt=driver.findElement(By.xpath("(//span[@class='matriid_txt'])[1]")); String
		 * keysearch=txt.getText(); System.out.println(keysearch); } catch (Exception
		 * e2) { }
		 * 
		 * 
		 * try { Thread.sleep(4000); WebElement txt=driver.findElement(By.xpath(
		 * "/html/body/ion-app/ng-component/page-search/ion-content/div[2]/page-matches/ion-content/div[2]/div/div"
		 * )); String keysearch=txt.getText(); System.out.println(keysearch); } catch
		 * (Exception e2) { }
		 */

	}
}
