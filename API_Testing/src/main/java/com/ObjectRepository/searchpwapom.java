package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpwapom {
        public searchpwapom(WebDriver driver) {
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


        @FindBy(xpath="/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[4]")
        private WebElement search1;

        public WebElement getSearch1() {
                return search1;
        }


        @FindBy(xpath="//input[@placeholder='Search By Id']")
        private WebElement id;

        public WebElement getId() {
                return id;
        }

        @FindBy(xpath="//span[@class='ficon icon-tick-select padd5']")
        private WebElement tick;

        public WebElement getTick() {
                return tick;
        }









}
