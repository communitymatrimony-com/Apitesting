package com.TestScripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.Base;
import com.ObjectRepository.Inbox;
import com.ObjectRepository.ProfileViewNotContacted;
import com.ObjectRepository.Search;
import com.ObjectRepository.inbox_POM;

public class viewed_not_contact_actions extends Base {

	WebDriver driver;

	@Test
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\CBS\\SAI-master\\API_Testing\\lib\\chromedriver.exe");
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
		SoftAssert asrt1 = new SoftAssert();
		try {
			Base.click(i.getMatriId());
			Base.typeData(i.getMatriId(), "RDY485145");

			Base.click(i.getPaswwordclr());
			Base.typeData(i.getPassword(), "cbstest123");

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
		// p.getMy_home().click();
		acc.moveToElement(p.getMy_home()).build().perform();
		acc.moveToElement(p.getProfile_viewed_not_contacted()).build().perform();
		p.getProfile_viewed_not_contacted().click();
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("(//a[@class='popupclose'])[2]")).click();
		} catch (Exception e) {
			e.getMessage();
		}

		/////// send mail scenario////////
		Thread.sleep(25000);
		// List<WebElement> matrid =
		// driver.findElements(By.xpath("//*[@id='hide_no_result']"));
		List<WebElement> mail = driver.findElements(By.xpath("//a[@title='Send Mail']"));
		for (int j = 0; j < 1; j++) {
			Thread.sleep(25000);
			System.out.println(mail.size());
			Thread.sleep(15000);
			acc.moveToElement(mail.get(j)).build().perform();

			Thread.sleep(15000);
			mail.get(j).click();
			// String matri = matrid.get(j).getText();
			// System.out.println("clicked on send mail for id : " + matri);
			// String parent = driver.getWindowHandle();
			// System.out.println("Parent Window Id : " + parent);

			Set<String> set = driver.getWindowHandles();
			System.out.println("child window :" + set);
			Iterator<String> iterator = set.iterator();
			String parentwindow = iterator.next();
			String childwindow = iterator.next();

			Thread.sleep(5000);
			driver.switchTo().window(childwindow);
			Thread.sleep(5000);
			String upgrade = driver.findElement(By.xpath("//*[@id='n1']")).getText();

			// asrt.assertEquals(upgrade, "MEMBERSHIP PLANS",
			// "naviagte to upgrade page succesfully from matri ID : " + matri);
			driver.close();
			driver.switchTo().window(parentwindow);
			// driver.switchTo().parentFrame();

		}

		//////////////// view mobile number scenario/////////////////////
		Thread.sleep(5000);
		List<WebElement> mobilenumber = driver.findElements(By.xpath("//a[@title='View Mobile No. / Send SMS']"));
		System.out.println(mobilenumber.size());

		// WebElement element = driver.findElements(By.xpath(“//a[@title='View Mobile
		// No. / Send SMS']”));
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		for (int k = 0; k < 3; k++) {
			System.out.println(mobilenumber.size());
			Thread.sleep(10000);
			// String matri1 = matrid.get(k).getText();
			mobilenumber.get(k).click();
			System.out.println("clicked on mobile number");
			// String parent = driver.getWindowHandle();
			// System.out.println("Parent Window Id : " + parent);
			
			try {
				Thread.sleep(2000);
				WebElement mobil_close = driver.findElement(By.xpath("//*[@id='request_call_back_popup']/a"));
				if (mobil_close.isDisplayed()) {
					mobil_close.click();
				}
				
				
				
				
				//driver.findElement(By.xpath("//*[@id='request_call_back_popup']/a")).click();
			} catch (Exception e) {
				Set<String> set1 = driver.getWindowHandles();
				System.out.println("child window :" + set1);
				Iterator<String> iterator1 = set1.iterator();
				String parentwindow1 = iterator1.next();
				String childwindow1 = iterator1.next();

				Thread.sleep(5000);
				driver.switchTo().window(childwindow1);
				Thread.sleep(5000);
				//String upgrade1 = driver.findElement(By.xpath("//*[@id='n1']")).getText();
				//Thread.sleep(5000);
				// asrt.assertEquals(upgrade1, "MEMBERSHIP PLANS");
				// asrt.assertEquals(upgrade1, "MEMBERSHIP PLANS",
				// "naviagte to upgrade page succesfully from matri ID : " + matri1);
				//Thread.sleep(5000);
				driver.close();
				Thread.sleep(5000);
				driver.switchTo().window(parentwindow1);
			}
			

		}

		////////////////////////// View horoscope/////////////////////////////////////

		Thread.sleep(5000);
		List<WebElement> view_horoscope = driver.findElements(By.xpath("//a[@title='View Horoscope']"));
		System.out.println(view_horoscope.size());

		// WebElement element = driver.findElements(By.xpath(“//a[@title='View Mobile
		// No. / Send SMS']”));
		// JavascriptExecutor executor = (JavascriptExecutor) driver;

		for (int m = 0; m < view_horoscope.size(); m++) {
			System.out.println(view_horoscope.size());
			Thread.sleep(10000);
			// String matri12 = matrid.get(m).getText();
			view_horoscope.get(m).click();
			// System.out.println(matri12);
			System.out.println("clicked on view horoscope");
			// String parent = driver.getWindowHandle();
			// System.out.println("Parent Window Id : " + parent);

			Set<String> set12 = driver.getWindowHandles();
			System.out.println("child window :" + set12);
			Iterator<String> iterator12 = set12.iterator();
			String parentwindow12 = iterator12.next();
			String childwindow12 = iterator12.next();

			Thread.sleep(5000);
			driver.switchTo().window(childwindow12);
			Thread.sleep(5000);
			String upgrade12 = driver.findElement(By.xpath("//*[@id='n1']")).getText();
			Thread.sleep(5000);
			// asrt.assertEquals(upgrade1, "MEMBERSHIP PLANS");
			// asrt.assertEquals(upgrade12, "MEMBERSHIP PLANS",
			// "naviagte to upgrade page from horoscope icon succesfully from matri ID : " +
			// matri12);
			Thread.sleep(5000);
			driver.close();
			Thread.sleep(5000);
			driver.switchTo().window(parentwindow12);
			// driver.switchTo().parentFrame();

		}

		acc.moveToElement(p.getLogout_menu()).build().perform();
		Thread.sleep(1000);

		acc.moveToElement(p.getLogout()).build().perform();
		Base.click(p.getLogout());
		System.out.println("Logged out successfully");
		Thread.sleep(5000);

		asrt.assertAll();

	}
	/*
	 * acc.moveToElement(p.getProfile_viewed_not_contacted()).build().perform();
	 * Base.click(p.getProfile_viewed_not_contacted()); Thread.sleep(5000);
	 * 
	 * //////////////////////////////////// Direct Scroll
	 * /////////////////////////////
	 * 
	 * 
	 * String a = p.getProfile_count().getText(); Integer b = Integer.parseInt(a);
	 * System.out.println(b); int count = (b/10); System.out.println(count);
	 * Thread.sleep(2000);
	 * 
	 * //////////////////////////////////////// Scroll Test
	 * 
	 * if (count>=10) { Thread.sleep(1000); for (int j = 0; j <=3; j++) {
	 * //j<=count-1 Thread.sleep(1000);
	 * 
	 * for (int k = 0; k <=12; k++) { Thread.sleep(1000);
	 * js.executeScript("window.scrollBy(0,350)");
	 * 
	 * }
	 * 
	 * try { Thread.sleep(3000); Base.click(p.getNext()); } catch (Exception e) {
	 * e.getMessage(); }
	 * 
	 * }
	 * 
	 * } else { System.out.println("The displayed profile is less than 10"); }
	 * Thread.sleep(5000); ///////////////////////////////// View Profile //
	 * wait.until(ExpectedConditions.elementToBeClickable(p.getViewProfile_click()))
	 * ; Base.click(p.getViewProfile_click()); Thread.sleep(1000);
	 * 
	 * String parent = driver.getWindowHandle();
	 * System.out.println("Parent Window Id : " +parent);
	 * 
	 * Set<String> child = driver.getWindowHandles(); for (String handle : child) {
	 * Thread.sleep(1000); if (parent.equals(child)) { Thread.sleep(3000);
	 * driver.switchTo().window(handle); driver.close();
	 * 
	 * } driver.switchTo().defaultContent(); } Thread.sleep(5000);
	 * //////////////////////////////////////////// Logout
	 * 
	 * acc.moveToElement(p.getLogout_menu()).build().perform(); Thread.sleep(1000);
	 * 
	 * acc.moveToElement(p.getLogout()).build().perform();
	 * Base.click(p.getLogout()); System.out.println("Logged out successfully");
	 * Thread.sleep(5000);
	 * 
	 * }
	 */

}
