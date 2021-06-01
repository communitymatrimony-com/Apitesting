package com.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Base.Base;
import com.ObjectRepository.inbox_POM;

public class ExcelConvert extends Base{
	
	
	WebDriver driver;

	
	@Test(priority=1)
	public void Inbox_verify() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.communitymatrimony.com");
	


		inbox_POM i = new inbox_POM(driver);
		Actions acc =new Actions(driver);

		
		driver.manage().window().maximize();
try {
		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "MDA281774");

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
	 acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
	 Thread.sleep(1500);
	 acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a"))).build().perform();
	 
	 Thread.sleep(2000);
	 Base.click(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")));
	 
	 Thread.sleep(3000);
	 
	 
	 
	 try {
		 
		 
		 String maritalStatus1 = driver.findElement(By.xpath("//span[contains(text(),'Marital Status - ')]//following::span[1]")).getText();
		   System.out.println(maritalStatus1);
		   
	 }catch (Exception e) {
			
		}
		 
	 
	 try {
		   String children = driver.findElement(By.xpath("//span[contains(text(),'Have Children - ')]//following::span[1]")).getText();
		   System.out.println(children);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Age = driver.findElement(By.xpath("//span[contains(text(),'Age - ')]//following::span[1]")).getText();
		   System.out.println(Age);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Height = driver.findElement(By.xpath("//span[contains(text(),'Height - ')]//following::span[1]")).getText();
		   System.out.println(Height);
	 }catch (Exception e) {
			
		}
		 
	 try {
		   
		   String MotherTongue = driver.findElement(By.xpath("//span[contains(text(),'Mother Tongue - ')]//following::span[1]")).getText();
		   System.out.println(MotherTongue);
	 }catch (Exception e) {
			
		}
		 
	 try {
		   
		   String Denomination = driver.findElement(By.xpath("//span[contains(text(),'Denomination - ')]//following::span[1]")).getText();
		   System.out.println(Denomination);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Division = driver.findElement(By.xpath("//span[contains(text(),'Division - ')]//following::span[1]")).getText();
		   System.out.println(Division);
	 }catch (Exception e) {
			
		}
		 
	 try {
		   
		   String Educationn = driver.findElement(By.xpath("//span[contains(text(),'Education - ')]//following::span[1]")).getText();
		   System.out.println(Educationn);
	 }catch (Exception e) {
			
		}
		 
	 try {
		   
		   String Occupation = driver.findElement(By.xpath("//span[contains(text(),'Occupation - ')]//following::span[1]")).getText();
		   System.out.println(Occupation);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Income = driver.findElement(By.xpath("//span[contains(text(),'Annual Income - ')]//following::span[1]")).getText();
		   System.out.println(Income);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Citizenship = driver.findElement(By.xpath("//span[contains(text(),'Citizenship - ')]//following::span[1]")).getText();
		   System.out.println(Citizenship);
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Country = driver.findElement(By.xpath("//span[contains(text(),'Country - ')]//following::span[1]")).getText();
		   System.out.println(Country);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Subcaste = driver.findElement(By.xpath("//span[contains(text(),'Subcaste - ')]//following::span[1]")).getText();
		   System.out.println(Subcaste);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String ChevvaiDosham = driver.findElement(By.xpath("//span[contains(text(),'Chevvai Dosham - ')]//following::span[1]")).getText();
		   System.out.println(ChevvaiDosham);
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String State = driver.findElement(By.xpath("//span[contains(text(),'State - ')]//following::span[1]")).getText();
		   System.out.println(State);
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String District = driver.findElement(By.xpath("//span[contains(text(),'District / City - ')]//following::span[1]")).getText();
		   System.out.println(District);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Religion = driver.findElement(By.xpath("//span[contains(text(),'Religion - ')]//following::span[1]")).getText();
		   System.out.println(Religion);
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Star = driver.findElement(By.xpath("//span[contains(text(),'Star - ')]//following::span[1]")).getText();
		   System.out.println(Star);
		   
	 }catch (Exception e) {
			
		}
		 
	 try {
		   String Manglik = driver.findElement(By.xpath("//span[contains(text(),'Manglik - ')]//following::span[1]")).getText();
		   System.out.println(Manglik);
		   
		 
		 
	 }catch (Exception e) {
		
	}
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
