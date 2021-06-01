package com.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.Base;
import com.ObjectRepository.ProfileViewNotContacted;
import com.ObjectRepository.Search;
import com.ObjectRepository.inbox_POM;

public class Destop_basic_code extends Base {

	WebDriver driver;
	String Requested_Id = null;
	String requested_deatils = null;
	String oppid, pf;
	int page_cou;

	@Test
	public void viewpro() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\chromedriver.exe");
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
			Base.typeData(i.getMatriId(), "BRH24770912");// KMC451599(no profile id)

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

		////////////////////////// click on Home button and who viewed my section
		////////////////////////// section////////////////////
		Thread.sleep(5000);
		acc.moveToElement(p.getMy_home()).build().perform();
		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Who viewed my profile')]"))).click()
				.perform();
		Thread.sleep(3000);
		/////////////////////////////////////////////////////////////////

		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[@class='popupclose'])[2]")).click();
		} catch (Exception e) {
			e.getMessage();
		}
		Thread.sleep(3000);

		//// Getting total profile count (METHOD 1)/////////////
		try {
			Thread.sleep(5000);
			WebElement profilecount = driver.findElement(By.xpath("//*[@id=\"total_div\"]/span[2]"));

			pf = profilecount.getText();
			// System.out.println(pf);
			Integer profile_count = Integer.parseInt(pf);

			Thread.sleep(5000);
			if (profile_count >= 1) {
				System.out.println("profiles are present for this profile and profile count is :  " + pf);
			}
		} catch (Exception e) {
			Thread.sleep(5000);
			String Noprofile_txt = driver.findElement(By.xpath("//*[text()=\"No member has viewed your profile.\"]"))
					.getText();
			System.err.println(Noprofile_txt);
		}

		Thread.sleep(5000);
		
		///////////////////// Getting MAtrid List (METHOD 2)//////////////////////

		List<WebElement> mat = driver.findElements(By.xpath("//*[@id='hide_no_result']/div[1]/a"));
		if (mat.isEmpty()) {
			System.err.println("No profiles present for this id");

		} else {
			Thread.sleep(5000);
			System.out.println(mat.size());
			Thread.sleep(5000);
			for (int j = 0; j < mat.size() - 1; j++) {
				// System.out.println(" matrid : " + mat.get(j).getText());
				oppid = mat.get(j).getText();
				System.out.println("profiles are present and displayed : " + oppid);
			}

		}
	}
}
