package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;



public class editpppom extends Base {
        public editpppom(WebDriver driver) {
                PageFactory.initElements(driver, this);

        }
        @FindBy(xpath="//*[@id='idEmail']")
        private WebElement username;

        @FindBy(xpath="//*[@id='password1']")
        private WebElement password;

        @FindBy(xpath="//*[@id='login-button']")
        private WebElement login;

        public WebElement getUsername() {
                return username;
        }

        public WebElement getPassword() {
                return password;
        }

        public WebElement getLogin() {
                return login;
        }

        @FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[5]")
        private WebElement editpp;

        @FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]/a/img")
        private WebElement basicdetails;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
        private WebElement maritalstatus;

        public WebElement getEditpp() {
                return editpp;
        }

        public WebElement getBasicdetails() {
                return basicdetails;
        }

        public WebElement getMaritalstatus() {
                return maritalstatus;
        }

        @FindBy(xpath="//*[@id='PP_have_child']/div[2]")
        private WebElement havechildren;

        public WebElement getHavechildren() {
                return havechildren;
        }

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]/div[2]")
        private WebElement heightfrom;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[4]/div[2]")
        private WebElement heightto;

        public WebElement getHeightfrom() {
                return heightfrom;
        }

        public WebElement getHeightto() {
                return heightto;
        }

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[7]/div[2]")
        private WebElement mothertongue;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[8]/div[2]")
        private WebElement physcialstatus;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[9]/div[2]")
        private WebElement eatinghabit;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[10]/div[2]")
        private WebElement drinkinghabit;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[11]/div[2]")
        private WebElement smokinghabit        ;

        public WebElement getMothertongue() {
                return mothertongue;
        }

        public WebElement getPhyscialstatus() {
                return physcialstatus;
        }

        public WebElement getEatinghabit() {
                return eatinghabit;
        }

        public WebElement getDrinkinghabit() {
                return drinkinghabit;
        }

        public WebElement getSmokinghabit() {
                return smokinghabit;
        }

        @FindBy(xpath="//*[@id='edit-prof_footer']/div[2]")
        private WebElement save        ;

        public WebElement getSave() {
                return save;
        }

        @FindBy(xpath="//*[@id='editpp-pwa']/div[4]/div[1]/div[2]")
        private WebElement religiousinformation        ;

        @FindBy(xpath="//label[contains(text(),'Subcaste')]//following::input[1]")
        private WebElement subcaste        ;

        @FindBy(xpath="//label[contains(text(),'Dosham')]//following::input[1]")
        private WebElement dosham;

        @FindBy(xpath="//label[contains(text(),'Star')]//following::input[1]")
        private WebElement star;

        public WebElement getReligiousinformation() {
                return religiousinformation;
        }

        @FindBy(xpath="//label[contains(text(),'Religion')]//following::input[1]")
        private WebElement religion;
    public WebElement getReligion() {
                return religion;
        }

        public WebElement getSubcaste() {
                return subcaste;
        }

        public WebElement getDosham() {
                return dosham;
        }

        public WebElement getStar() {
                return star;
        }

        @FindBy(xpath="//*[@id='edit-prof_footer']/div[2]")
        private WebElement save2;

        public WebElement getSave2() {
                return save2;
        }

        @FindBy(xpath="//*[@id='editpp-pwa']/div[5]/div[1]/div[2]")
        private WebElement professionalinformation;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
        private WebElement education;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[2]/div[2]")
        private WebElement occupation;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]/div[2]")
        private WebElement annualincomefrom;

        @FindBy(xpath="//*[@id='PP_Annual_income_To_display']/div[2]")
        private WebElement annualincometo;

        public WebElement getProfessionalinformation() {
                return professionalinformation;
        }

        public WebElement getEducation() {
                return education;
        }

        public WebElement getOccupation() {
                return occupation;
        }

        public WebElement getAnnualincomefrom() {
                return annualincomefrom;
        }

        public WebElement getAnnualincometo() {
                return annualincometo;
        }


        @FindBy(xpath="//*[@id='wap-edit-profile']/div[4]/div[9]/div[1]/div[2]")
        private WebElement locationpreference;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
        private WebElement country;

        @FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[5]/div[2]")
        private WebElement citizenship;

        public WebElement getLocationpreference() {
                return locationpreference;
        }

        public WebElement getCountry() {
                return country;
        }

        public WebElement getCitizenship() {
                return citizenship;
        }

        @FindBy(xpath="//*[@id='PP_Residing_Indian_State']")
        private WebElement state;

        @FindBy(xpath="//*[@id='PP_Residing_city']")
        private WebElement city;

        public WebElement getState() {
                return state;
        }

        public WebElement getCity() {
                return city;
        }


        @FindBy(xpath="//div[@class='linknb more_link']")
        private WebElement morepreference;

        public WebElement getMorepreference() {
                return morepreference;
        }


        @FindBy(xpath="//ion-label[contains(text(),'Settings')]")
        private WebElement setting;

        public WebElement getSetting() {
                return setting;
        }
}