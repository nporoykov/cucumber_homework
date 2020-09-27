package com.cucumber.pages;

import com.cucumber.pages.BasePage;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import com.cucumber.pages.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.String.format;
//import utils.WebDriverFactory;


public class LoginPage extends BasePage {

    private String loginButton = "button.header2__auth";

    private String accField = "input.js-email-input";

    private String passField = "input.js-psw-input";

    private String logButton = "div.new-input-line>button";

    public void clickAuth(){
       waitForElement(By.cssSelector(loginButton)).click();

     //  return this;
    }

    public void auth(String account, String pass) {
        waitForElement(By.cssSelector(accField)).sendKeys(account);
        waitForElement(By.cssSelector(passField)).sendKeys(pass);
        waitForElement(By.cssSelector(logButton)).click();

       // return new ProfilePage();
    }
}