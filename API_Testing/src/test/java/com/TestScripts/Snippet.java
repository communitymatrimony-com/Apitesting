package com.TestScripts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.Base;
import com.ObjectRepository.inbox_POM;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Snippet extends Base {

	WebDriver driver;
	String Requested_Id = null;
	String requested_deatils = null;
	String matid, asd, ageFro, ageT, maritalStatus, mariedstatus1, Religion, Religion1, Caste, Caste1, SubCaste,
			SubCaste1, Education, Education1, education;
	int ageFrom, ageTo, ageFrom1, ageTo1;
	float heightFrom, heightFrom1, heightTo, heightTo1, heightFrom2, heightTo2, Height;
	String[] bachelor_values = {"MBA / PGDM","B.Com.", "B.sc","MBA","MFM","BE","MFM"};

	@Test(priority = 2)
	public void dailySeven() {

		RestAssured.baseURI = "https://www.communitymatrimony.com/api/webservicecall.php?filename=D7Matches&MatriId=BRH2994315&OutputType=2&AppType=2";

		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("admin");
		authScheme.setPassword("lRqW6WNT");
		RestAssured.authentication = authScheme;
		SoftAssert asrt = new SoftAssert();
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://www.communitymatrimony.com/api/webservicecall.php?filename=D7Matches&MatriId=BRH2994315&OutputType=2&AppType=2");

		JsonPath jsonPathEvaluator = response.jsonPath();

		int statusCode = response.getStatusCode();
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
		System.out.println("Errormessage.........." + ERRORDESC);

		if (!ERRORDESC.equalsIgnoreCase("Sorry No Record's Found")) {

			List<Map<String, String>> profile_details = response.jsonPath().getList("D7ALLPROFILEDETAILS");

			System.out.println(
					"Number of profiles in the daily matches section.........." + profile_details.size() + "\n");
			for (int j = 0; j < profile_details.size(); j++) {
				
				System.out.println("\n"+j+"\n");
				String MID = profile_details.get(j).get("MATRIID");
				System.out.println(profile_details.get(j).get("MATRIID"));
				String age = profile_details.get(j).get("AGE");
				Integer age1 = Integer.parseInt(age);

				System.out.println("Age is:" + age1);

				String photo = profile_details.get(j).get("PHOTOCOUNT");

				System.out.println("Photo Count for this " + MID + "  is " + photo);
				String Education1 = profile_details.get(j).get("EDUCATIONLONG");
				System.out.println(Education1);

				String Heig = profile_details.get(j).get("HEIGHT");
				System.out.println(Heig);
				String[] heiii = Heig.split("/");
				String heig = heiii[0].toString().trim();

				if (heig.endsWith("in")) {

					String[] hei = heig.split(" ft ");
					String heig1 = hei[0].toString().trim();

					String[] heigh = hei[1].split(" in");
					String heigg = heigh[0].toString().trim();

					String heightFro = heig1 + "." + heigg;
					Height = Float.parseFloat(heightFro);
				} else {

					String[] hei = heig.split(" ft");
					String heig1 = hei[0].toString().trim();
					Height = Float.parseFloat(heig1);

				}
				try {

					if (ageFrom == age1 || ageTo >= age1) {
						System.out.println(age1 + " is in between " + ageFrom + " and " + ageTo);
					} else {
						System.out.println(age1 + " is not in between " + ageFrom + " and " + ageTo);
					}
				} catch (Exception e) {

				}
				if (heightFrom == Height || heightTo >= Height) {
					System.out.println(Height + " is in between " + heightFrom + " and " + heightTo);
				} else {
					System.out.println(Height + " is not in between " + heightFrom + " and " + heightTo);
				}

				try {

					if (education.contains(Education1)) {
						System.out.println("Education  Verified");
					} else {
						System.out.println("Education not Verified  ");
					}

				} catch (Exception e) {

				}
				
			///validating education values	
				
				try {
					if(education.contains("Bachelors - Arts / Science / Commerce / Others")) {
						for (int i = 0; i < bachelor_values.length; i++) {
							if (bachelor_values[i].contains(Education1)) {
								System.out.println("Array value "+ bachelor_values[i]  + " is present in " + Education1);
							break;
							}
							
						else {
								System.out.println("not present");
							}
						}
						
					
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		} else {
			System.out.println("No Daily Matches found for this matriid");
		}
	}

	@Test(priority = 1, enabled = true)
	public void Inbox_verify() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.communitymatrimony.com");
		inbox_POM i = new inbox_POM(driver);
		Actions acc = new Actions(driver);
		
		driver.manage().window().maximize();
		try {
			Base.click(i.getMatriId());// MDA281774 //MUS2066206 //EZH710533
			Base.typeData(i.getMatriId(), "BRH2994315");
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
			System.out.println("Intermediate photo not available");
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
		try {
			Base.click(driver.findElement(By.xpath("/html/body/div[1]/div[1]/a")));
		} catch (Exception e) {
		}
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}
		acc.moveToElement(
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/div[3]/div[2]/div[1]/a")))
				.build().perform();
		try {
			Base.click(driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[1]/div/div/div[3]/div[2]/div[2]/div[2]/div/div[3]/div[1]/ul/li[2]/a")));
		} catch (Exception e) {
		}
		try {
			Base.click(driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/a/img")));
		} catch (Exception e) {
		}

		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build()
				.perform();
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")))
				.build().perform();
		Thread.sleep(2000);
		Base.click(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")));
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
			System.out.println(":::" + heightTo);

		} else {

			String[] hei1 = he1.split(" ft");
			String heig1 = hei1[0].toString().trim();

			heightTo = Float.parseFloat(heig1);
			System.out.println(":::" + heightTo);

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
		boolean more = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div/div/div[7]/div[1]/div/div[1]/div[9]/form/div[26]/div[1]/span[2]/span[2]"))
				.isDisplayed();

		if (more == true) {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div[1]/div/div/div[7]/div[1]/div/div[1]/div[9]/form/div[26]/div[1]/span[2]/span[2]"))
					.click();
			education = driver.findElement(By.xpath("//span[contains(text(),'Education - ')]//following::span[1]"))
					.getText();

			System.out.println("Education : " + education);
		} else {
			Education = driver.findElement(By.xpath("//span[contains(text(),'Education - ')]//following::span[1]"))
					.getText();
			System.out.println("Education : " + Education);
		}
	}

}