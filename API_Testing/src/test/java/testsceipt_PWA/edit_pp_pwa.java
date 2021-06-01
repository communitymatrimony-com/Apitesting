package testsceipt_PWA;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

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

import com.Base.Pwa_Base;
import com.ObjectRepository.editpppom;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class edit_pp_pwa extends Pwa_Base{
        public static WebDriver driver;
        String driverExecutablePath = "F:\\Softwares\\CBS\\SAI-master\\API_Testing\\lib\\chromedriver.exe";

         ExtentReports report;
     ExtentTest logger;
       @BeforeMethod
       public void setUp1() throws MalformedURLException {
           System.setProperty("webdriver.chrome.driver",driverExecutablePath);
           Map<String, String> mobileEmulation = new HashMap<String,String>();
           mobileEmulation.put("deviceName", "Pixel 2");

           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setExperimentalOption("mobileEmulation",mobileEmulation);
           chromeOptions.addArguments("--disable-notifications");
           driver = new ChromeDriver(chromeOptions);



       }

       @Test
       public void testUntitled() throws Throwable {

               editpppom rp= new editpppom(driver);
               Thread.sleep(5000);
                    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


                    //login
                    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
                        Actions a=new Actions(driver);
                        Thread.sleep(4000);
                        a.sendKeys(e,"RDY485145").build().perform();

                    Thread.sleep(4000);

                    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
                    Thread.sleep(4000);
                        Actions b=new Actions(driver);
                        Thread.sleep(4000);
                        b.sendKeys(d,"cbstest123").build().perform();

                  Thread.sleep(4000);
                Pwa_Base.click(rp.getLogin());

                try {
                        Thread.sleep(8000);
                        driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();


                } catch (Exception e2) {
                        //System.out.println("no element 1");
                }

                try {
                        Thread.sleep(8000);
                        driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();


                } catch (Exception e2) {
                        //System.out.println("no element 2");
                }

                try {
                        Thread.sleep(8000);
                        driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span")).click();


                } catch (Exception e2) {
                        //System.out.println("no element 3");
                }

                Thread.sleep(4000);
                Pwa_Base.click(rp.getEditpp());

                Thread.sleep(4000);
                Pwa_Base.click(rp.getBasicdetails());

                Thread.sleep(4000);
                Pwa_Base.click(rp.getMaritalstatus());

//                WebElement marital1=driver.findElement(By.xpath("//*[@id='chkbox0']"));
//
//                //WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox2']"));
//                WebElement marital4=driver.findElement(By.xpath("//*[@id='chkbox3']"));
//                WebElement marital5=driver.findElement(By.xpath("//*[@id='chkbox4']"));
//

                Thread.sleep(4000);
                if (Pwa_Base.getExcelData("pp", 1, 1).contains("Widow")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox2']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 1).contains("Unmarried")) {
                        WebElement marital2=driver.findElement(By.xpath("//*[@id='chkbox1']"));
                        if (marital2.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital2.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 1).contains("Doesn't matter")) {
                        WebElement marital0=driver.findElement(By.xpath("//*[@id='chkbox0']"));
                        if (marital0.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital0.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 1).contains("Divorced")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox3']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 1).contains("Separated")) {
                        WebElement marital4=driver.findElement(By.xpath("//*[@id='chkbox4']"));
                        if (marital4.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital4.click();
                        }
                }

                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                try {
                        Thread.sleep(4000);
                        Pwa_Base.click(rp.getHavechildren());

                        Thread.sleep(4000);
                        driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();

                        Thread.sleep(4000);
                        Pwa_Base.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp",1, 2)+"')]")));

                } catch (Exception e2) {

                }

                Thread.sleep(4000);
                Pwa_Base.click(rp.getHeightfrom());

                Thread.sleep(4000);
                Pwa_Base.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("pp",1, 3)+"')]")));

                Thread.sleep(4000);
                Pwa_Base.click(rp.getHeightto());

                Thread.sleep(4000);
                Pwa_Base.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("pp",1, 4)+"')]")));

                Thread.sleep(4000);
                Pwa_Base.click(rp.getMothertongue());

                Thread.sleep(4000);
                WebElement lang=driver.findElement(By.xpath("//*[@id='chkbox0_0']"));
                if (lang.isEnabled()) {
                        System.out.println("älready selected");
                }
                else {
                        lang.click();
                }
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                Thread.sleep(4000);
                Pwa_Base.click(rp.getPhyscialstatus());

                Thread.sleep(4000);
                if (Pwa_Base.getExcelData("pp", 1, 8).contains("Normal")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox0']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 8).contains("PhysicallyChallenged")) {
                        WebElement marital2=driver.findElement(By.xpath("//*[@id='chkbox1']"));
                        if (marital2.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital2.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 8).contains("Doesn't matter")) {
                        WebElement marital0=driver.findElement(By.xpath("//*[@id='chkbox2']"));
                        if (marital0.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital0.click();
                        }
                }
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                Thread.sleep(4000);
                Pwa_Base.click(rp.getEatinghabit());
                Thread.sleep(4000);
                if (Pwa_Base.getExcelData("pp", 1, 9).contains("Doesn't matter")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox0']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 9).contains("Vegetarian")) {
                        WebElement marital2=driver.findElement(By.xpath("//*[@id='chkbox1']"));
                        if (marital2.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital2.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 9).contains("Non vegetarian")) {
                        WebElement marital0=driver.findElement(By.xpath("//*[@id='chkbox2']"));
                        if (marital0.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital0.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 9).contains("Eggetarian")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox3']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 9).contains("Vegan")) {
                        WebElement marital4=driver.findElement(By.xpath("//*[@id='chkbox4']"));
                        if (marital4.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital4.click();
                        }
                }
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                Thread.sleep(4000);
                Pwa_Base.click(rp.getDrinkinghabit());
                Thread.sleep(4000);
                if (Pwa_Base.getExcelData("pp", 1, 10).contains("Doesn't matter")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox0']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 10).contains("Non-drinker")) {
                        WebElement marital2=driver.findElement(By.xpath("//*[@id='chkbox1']"));
                        if (marital2.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital2.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 10).contains("Light / Socialdrinker")) {
                        WebElement marital0=driver.findElement(By.xpath("//*[@id='chkbox2']"));
                        if (marital0.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital0.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 10).contains("Regular drinker")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox3']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();


                Thread.sleep(8000);
                   JavascriptExecutor js2 = (JavascriptExecutor)driver;
                     WebElement edi2=
driver.findElement(By.xpath("//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[11]/div[2]"));
                            js2.executeScript("arguments[0].scrollIntoView(true);",edi2);
                Thread.sleep(4000);
                Pwa_Base.click(rp.getSmokinghabit());
                Thread.sleep(4000);
                if (Pwa_Base.getExcelData("pp", 1, 11).contains("Doesn't matter")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox0']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 11).contains("Non-smoker")) {
                        WebElement marital2=driver.findElement(By.xpath("//*[@id='chkbox1']"));
                        if (marital2.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital2.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 11).contains("Light / Socialsmoker")) {
                        WebElement marital0=driver.findElement(By.xpath("//*[@id='chkbox2']"));
                        if (marital0.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital0.click();
                        }
                }else if (Pwa_Base.getExcelData("pp", 1, 11).contains("Regular smoker")) {
                        WebElement marital3=driver.findElement(By.xpath("//*[@id='chkbox3']"));
                        if (marital3.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                marital3.click();
                        }
                }
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                Thread.sleep(3000);
                   JavascriptExecutor js = (JavascriptExecutor)driver;
                     WebElement edit=
driver.findElement(By.xpath("//*[@id='edit-prof_footer']/div[2]"));
                            js.executeScript("arguments[0].scrollIntoView(true);",edit);


                Thread.sleep(4000);
                Pwa_Base.click(rp.getSave());

                Thread.sleep(6000);
                driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();



                //religious information//

                Thread.sleep(4000);
                Pwa_Base.click(rp.getReligiousinformation());

                Thread.sleep(4000);
                Pwa_Base.click(rp.getSubcaste());
                Thread.sleep(4000);
                WebElement caste=driver.findElement(By.xpath("//*[@id='chkbox0_0']"));
                if (caste.isEnabled()) {
                        System.out.println("älready selected");
                }
                else {
                        caste.click();
                }

                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();


                Thread.sleep(4000);
                Pwa_Base.click(rp.getDosham());

                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();

                Thread.sleep(4000);
                Pwa_Base.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp",4, 2)+"')]")));


                Thread.sleep(4000);
                Pwa_Base.click(rp.getStar());
                Thread.sleep(4000);
                WebElement star=driver.findElement(By.xpath("//*[@id='chkbox4']"));
                if (star.isEnabled()) {
                        System.out.println("älready selected");
                }
                else {
                        star.click();
                }

                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                Thread.sleep(4000);
                Pwa_Base.click(rp.getSave2());

                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();

                ////3rd///

                Thread.sleep(3000);
                   JavascriptExecutor js1 = (JavascriptExecutor)driver;
                     WebElement edit1=
driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[1]/div[2]"));
                            js1.executeScript("arguments[0].scrollIntoView(true);",edit1);

                 Thread.sleep(4000);
        Pwa_Base.click(rp.getProfessionalinformation());


                  Thread.sleep(6000);
                  Pwa_Base.click(rp.getEducation());
                  Thread.sleep(4000);
                  WebElement star1=driver.findElement(By.xpath("//*[@id='chkboxid']"));
                   star1.click();


                        Thread.sleep(4000);
                        driver.findElement(By.xpath("//*[@id='Icon_delete']/span")).click();

                        Thread.sleep(6000);
                        Pwa_Base.click(rp.getOccupation());
                        Thread.sleep(4000);
                        WebElement occu=driver.findElement(By.xpath("//*[@id='chkbox102_120']"));
                        if (occu.isEnabled()) {
                                System.out.println("älready selected");
                        }
                        else {
                                occu.click();
                        }

                        Thread.sleep(4000);
                        driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();


                  Thread.sleep(4000);
                Pwa_Base.click(rp.getAnnualincomefrom());
                 Thread.sleep(4000);
                  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
                  Thread.sleep(4000);
                  Pwa_Base.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp",7, 3)+"')]")));

                  Thread.sleep(4000);
                Pwa_Base.click(rp.getAnnualincomefrom());
                         Thread.sleep(4000);
                          driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
                          Thread.sleep(4000);

                          Pwa_Base.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp",7, 4)+"')]")));

                          Thread.sleep(4000);
                          Pwa_Base.click(rp.getSave2());

                          Thread.sleep(4000);
                          try {
                                driver.findElement(By.xpath("//*[@id='ValidationError_Popup']/img")).click();
                        } catch (Exception e2) {
                                System.out.println("no elements");
                        }

                  Thread.sleep(4000);
                 Pwa_Base.click(rp.getAnnualincometo());
                  Thread.sleep(4000);
                  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
                  Thread.sleep(4000);

                  Pwa_Base.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp",7, 5)+"')]")));

                  Thread.sleep(4000);
                  Pwa_Base.click(rp.getSave2());

                  Thread.sleep(4000);
                  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();

                  //Location
                  Thread.sleep(3000);
                           JavascriptExecutor js12 = (JavascriptExecutor)driver;
                             WebElement edit12=
driver.findElement(By.xpath("//*[@id='wap-edit-profile']/div[4]/div[9]/div[1]/div[2]"));
                                    js12.executeScript("arguments[0].scrollIntoView(true);",edit12);


                  Thread.sleep(4000);
          Pwa_Base.click(rp.getLocationpreference());




//                  Thread.sleep(3000);
//                 Pwa_Base.click(rp.getCountry());
//                  Thread.sleep(4000);
//                  WebElement country=driver.findElement(By.xpath("//*[@id='chkbox0']"));
//                        if (country.isSelected()) {
//                                System.out.println("älready selected");
//                        }
//                        else {
//                                country.click();
//                        }
//                  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
//
//
//                  Thread.sleep(4000);
//                        Pwa_Base.click(rp.getCitizenship());
//                         Thread.sleep(4000);
//                          WebElement citizen=driver.findElement(By.xpath("//*[@id='chkbox0']"));
//                                if (citizen.isSelected()) {
//                                        System.out.println("älready selected");
//                                }
//                                else {
//                                        citizen.click();
//                                }
//                          driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
//
                  Thread.sleep(4000);
                          Pwa_Base.click(rp.getCountry());
                          Thread.sleep(4000);
                          WebElement country1=driver.findElement(By.xpath("//*[@id='chkbox98']"));
                                if (country1.isSelected()) {
                                        System.out.println("älready selected");
                                }
                                else {
                                        country1.click();
                                }
                          driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();


                        try {
                                Thread.sleep(3000);
                                   JavascriptExecutor js123 = (JavascriptExecutor)driver;
                                     WebElement edit123=
driver.findElement(By.xpath("//*[@id='PP_Residing_Indian_State']"));
                                            js123.executeScript("arguments[0].scrollIntoView(true);",edit123);

                                  Thread.sleep(7000);
                                         Pwa_Base.click(rp.getState());
                                         Thread.sleep(4000);
                                         WebElement state=driver.findElement(By.xpath("//*[@id='chkbox31']"));
                                                if (state.isSelected()) {
                                                        System.out.println("älready selected");
                                                }
                                                else {
                                                        state.click();
                                                }

                                          Thread.sleep(4000);
                                          driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                        } catch (Exception e2) {
                                System.out.println("no state 1");
                        }

                        try {
                                Thread.sleep(3000);
                                   JavascriptExecutor js123 = (JavascriptExecutor)driver;
                                     WebElement edit123=
driver.findElement(By.xpath("//*[@id='PP_Indian_state_display']/div[2]"));
                                            js123.executeScript("arguments[0].scrollIntoView(true);",edit123);

                                  Thread.sleep(7000);
                                driver.findElement(By.xpath("//*[@id='PP_Indian_state_display']/div[2]")).click();
                                         Thread.sleep(4000);
                                         WebElement state=driver.findElement(By.xpath("//*[@id='chkbox31']"));
                                                if (state.isSelected()) {
                                                        System.out.println("älready selected");
                                                }
                                                else {
                                                        state.click();
                                                }

                                          Thread.sleep(4000);
                                          driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                        } catch (Exception e2) {
                                System.out.println("no state 1");
                        }

                        try {
                                Thread.sleep(3000);
                                   JavascriptExecutor js123 = (JavascriptExecutor)driver;
                                     WebElement edit123=
driver.findElement(By.xpath("//*[@id='PP_Indian_state_display']/div[2]/div"));
                                            js123.executeScript("arguments[0].scrollIntoView(true);",edit123);

                                  Thread.sleep(7000);
                                driver.findElement(By.xpath("//*[@id='PP_Indian_state_display']/div[2]/div")).click();
                                         Thread.sleep(4000);
                                         WebElement state=driver.findElement(By.xpath("//*[@id='chkbox31']"));
                                                if (state.isSelected()) {
                                                        System.out.println("älready selected");
                                                }
                                                else {
                                                        state.click();
                                                }

                                          Thread.sleep(4000);
                                          driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                        } catch (Exception e2) {
                                System.out.println("no state 1");
                        }

                  Thread.sleep(7000);
                 Pwa_Base.click(rp.getState());
                 Thread.sleep(4000);
                 WebElement state=driver.findElement(By.xpath("//*[@id='chkbox31']"));
                        if (state.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                state.click();
                        }

                  Thread.sleep(4000);
                  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                  Thread.sleep(7000);
                 Pwa_Base.click(rp.getCity());
                 Thread.sleep(4000);
                 WebElement city=driver.findElement(By.xpath("//*[@id='chkbox472']"));
                        if (city.isSelected()) {
                                System.out.println("älready selected");
                        }
                        else {
                                city.click();
                        }

                  Thread.sleep(4000);
                  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                  Thread.sleep(4000);
                Pwa_Base.click(rp.getCitizenship());
                 Thread.sleep(4000);
                  WebElement
citizenship=driver.findElement(By.xpath("//*[@id='chkbox30']"));
                        if (citizenship.isEnabled()) {
                                System.out.println("älready selected");
                        }
                        else {
                                citizenship.click();
                        }
                  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();

                  Thread.sleep(4000);
                 Pwa_Base.click(rp.getSave());

                  Thread.sleep(4000);
                  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();


                ///pp check/////
                  Thread.sleep(4000);
                  WebElement
marital2=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
                  String partner=marital2.getText();
                  System.out.println("marital status :"+partner);

                  try {
                          Thread.sleep(4000);
                          WebElement
havechild=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[2]/div[2]"));
                          String child=havechild.getText();
                          System.out.println("have children :"+child);

                } catch (Exception e2) {
                        System.out.println("no child");
                }

                  Thread.sleep(4000);
                  WebElement
age=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[3]/div[2]"));
                  String ppa=age.getText();
                  System.out.println("Age in pp:"+ppa);
                  String[] split=ppa.split(" - 35 Yrs");

                  String[] split1=ppa.split(" - ");

                  String[] split2=split1[1].split(" Yrs");

                  String ppage=(split[0]+"-"+split2[0]);
                  System.out.println("final pp age:"+ppage);

                  Thread.sleep(4000);
                  WebElement
height=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[4]/div[2]"));
                  String ppheight=height.getText();
                  System.out.println("Height in pp :"+ppheight);

                  Thread.sleep(4000);
                  WebElement
mother=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[5]/div[2]/span"));
                  String tongue=mother.getText();
                  System.out.println("mother tongue in pp :"+tongue);



                          Thread.sleep(4000);
                          WebElement
caste5=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[4]/div[2]/ul/li[1]/div[2]"));
                          String subcaste=caste5.getText();
                          System.out.println("subcaste in pp :"+subcaste);





                  Thread.sleep(4000);
                  WebElement
dosham=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[4]/div[2]/ul/li[2]/div[2]"));
                  String doshampp=dosham.getText();
                  System.out.println("Gotharam in pp :"+doshampp);

                  Thread.sleep(4000);
                  WebElement
star5=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[4]/div[2]/ul/li[3]/div[2]"));
                  String starpp=star5.getText();
                  System.out.println("Dosham in pp :"+starpp);


                  Thread.sleep(4000);
                  WebElement
edu=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[1]/div[2]"));
                  String edupp=edu.getText();
                  System.out.println("education in pp :"+edupp);


                  Thread.sleep(4000);
                  WebElement
occ=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
                  String occpp=occ.getText();
                  System.out.println("occupation in pp :"+occpp);


                  Thread.sleep(4000);
                  WebElement
income=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[3]/div[2]"));
                  String incomepp=income.getText();
                  System.out.println("income in pp :"+incomepp);


                  Thread.sleep(4000);
                  WebElement
country=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[2]"));
                  String countryp=country.getText();
//                  System.out.println("country in pp :"+countryp);
//                  String[] coun1=countryp.split(",");
//
//                  String countrypp=(coun1[0]+coun1[1]+coun1[2]+coun1[3]);
                  System.out.println("finalcountry in pp:"+countryp);



                  Thread.sleep(4000);
                  WebElement
state1=driver.findElement(By.xpath("(//div[contains(text(),'State')]//following::div[1])[3]"));
                  String statepp=state1.getText();
                  System.out.println("state in pp :"+statepp);



                  Thread.sleep(4000);
                  WebElement
city1=driver.findElement(By.xpath("(//div[contains(text(),'City')]//following::div[1])"));
                  String cityp=city1.getText();
                  System.out.println("city in pp :"+cityp);
                  String[] coun2=cityp.split(",");

                  String citypp=(coun2[0]+coun2[1]);
                  System.out.println("final city in pp:"+citypp);



                  Thread.sleep(4000);
                  WebElement
citizenship1=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[2]"));
                  String citizenship1pp=citizenship1.getText();
                  System.out.println("citizenship in pp :"+citizenship1pp);


                  //back//
                  Thread.sleep(4000);
                  driver.findElement(By.xpath("//*[@id='historyBack']")).click();

                  System.out.println("Search Values :");

                  ///search///
                  Thread.sleep(4000);
                  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[4]")).click();



                  Thread.sleep(4000);
                  WebElement
marital1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[3]/div[1]/div/ion-label/div[2]"));
                  String partner1=marital1.getText();
                  System.out.println("marital status in search :"+partner1);

                  Thread.sleep(4000);
                  WebElement
age1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[1]/div[1]/div/ion-label/div[2]"));
                  String ppae1=age1.getText();
                  System.out.println("Age in search:"+ppae1);

                  String[] split4=ppae1.split(" - 35 Yrs");
                  String[] split5=split4[0].split(" yrs");

                  String[] split6=ppae1.split("21 yrs - ");

                  String[] split7=split6[1].split(" yrs");

                  String ppage1=(split5[0]+"-"+split7[0]);
                  System.out.println("final search age:"+ppage1);

                  Thread.sleep(4000);
                  WebElement
height1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[2]/div[1]/div/ion-label/div[2]"));
                  String ppheight1=height1.getText();
                  System.out.println("Height in search :"+ppheight1);

                  Thread.sleep(4000);
                  WebElement
mother1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[2]/div[1]/div/ion-label/div[2]"));
                  String tongue1=mother1.getText();
                  System.out.println("mother tongue in search :"+tongue1);



                          Thread.sleep(4000);
                          WebElement
caste1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[1]/div[1]/div/ion-label/div[2]"));
                          String subcaste1=caste1.getText();
                          System.out.println("subcaste in search :"+subcaste1);





                  Thread.sleep(4000);
                  WebElement
dosham1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[4]/div[1]/div/ion-label/div[2]"));
                  String doshampp1=dosham1.getText();
                  System.out.println("dosham in search :"+doshampp1);

                  Thread.sleep(4000);
                  WebElement
star8=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[3]/div[1]/div/ion-label/div[2]"));
                  String starpp1=star8.getText();
                  System.out.println("starin search :"+starpp1);


                  Thread.sleep(4000);
                  WebElement
edu1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[8]/div[1]/div/ion-label/div[2]"));
                  String edupp1=edu1.getText();
                  System.out.println("education in search :"+edupp1);


                  Thread.sleep(4000);
                  WebElement
occ1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[9]/div[1]/div/ion-label/div[2]"));
                  String occpp1=occ1.getText();
                  System.out.println("occupation in search :"+occpp1);


                  Thread.sleep(4000);
                  WebElement
income1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[10]/div[1]/div/ion-label/div[2]"));
                  String incomepp1=income1.getText();
                  System.out.println("income in search :"+incomepp1);


                  Thread.sleep(4000);
                  WebElement country11=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[5]/div[1]/div/ion-label/div[2]"));
                  String countr=country11.getText();
                  System.out.println("country in search :"+countr);
                  String[] coun=countr.split(" ,");

                  String countrypp1=(coun[0]+coun[1]+coun[2]+coun[3]);
                  System.out.println("finalcountry:"+countrypp1);


                  Thread.sleep(4000);
                  WebElement state11=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[6]/div[1]/div/ion-label/div[2]"));
                  String statepp1=state11.getText();
                  System.out.println("state in search :"+statepp1);



                  Thread.sleep(4000);
                  WebElement
                             city11=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[7]/div[1]/div/ion-label/div[2]"));
                  String cityp1=city11.getText();
                  System.out.println("city in search :"+cityp1);
                  String[] coun4=cityp.split(",");

                  String citypp1=(coun4[0]+coun4[1]);
                  System.out.println("final city in search:"+citypp1);



                  if (partner.contains(partner1)) {
                        System.out.println("martial status matched");
                }
                  else {
                        System.out.println("martial status not matched");
                }


                  if (ppage.contains(ppage1)) {
                                System.out.println("age matched");
                        }
                          else {
                                System.out.println("age not matched");
                        }

                  if (ppheight.contains(ppheight1)) {
                                System.out.println("height matched");
                        }
                          else {
                                System.out.println("height matched");
                        }


                  if (tongue.contains(tongue1)) {
                                System.out.println("mother tongue matched");
                        }
                          else {
                                System.out.println("mother tongue not matched");
                        }

                  if (subcaste.contains(subcaste1)) {
                                System.out.println("subcaste matched");
                        }
                          else {
                                System.out.println("subcaste not matched");
                        }

                  if (doshampp.contains(doshampp1)) {
                                System.out.println("dosham matched");
                        }
                          else {
                                System.out.println("dosham not matched");
                        }

                  if (starpp.contains(starpp1)) {
                                System.out.println("star matched");
                        }
                          else {
                                System.out.println("star not matched");
                        }

                  if (occpp.contains(occpp1)||(occpp.contains("Any"))) {
                                System.out.println("occupation matched");
                        }
                          else {
                                System.out.println("occupation not matched");
                        }

                  if (edupp.contains(edupp1)) {
                                System.out.println("education matched");
                        }
                          else {
                                System.out.println("education not matched");
                        }


                  if (incomepp.contains(incomepp1)) {
                                System.out.println("income matched");
                        }
                          else {
                                System.out.println("income not matched");
                        }


                  if (countryp.contains(countrypp1)) {
                                System.out.println("country matched");
                        }
                          else {
                                System.out.println("country not matched");
                        }

                  if (statepp.contains(statepp)) {
                                System.out.println("state matched");
                        }
                          else {
                                System.out.println("state not matched");
                        }

                  if (citypp.contains(citypp1)) {
                                System.out.println("city matched");
                        }
                          else {
                                System.out.println("city not matched");
                        }















       }
}
