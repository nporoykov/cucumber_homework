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
   // private Logger logger = LogManager.getLogger(LoginPage.class);

   // @FindBy(css="button.header2__auth") //локатор кнопки раздела логина
    private String loginButton = "button.header2__auth";
   // private WebElement loginButton;

  //  @FindBy(css="input.js-email-input")  //локатор поля аккаунта
    private String accField = "input.js-email-input";
  //  private WebElement accField;

  //  @FindBy(css="input.js-psw-input")  //локатор поля пароля
    private String passField = "input.js-psw-input";
 //   private WebElement passField;

  //  @FindBy(css="div.new-input-line>button")  //локатор кнопки логина
    private String logButton = "div.new-input-line>button";
  //  private WebElement logButton;

  /* public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }*/

/*    public LoginPage open(String url) {
        driver.get(url);
     //   logger.info("Открыта страница "+"https://otus.ru\n");
        return this;
    } */

    public LoginPage clickAuth(){
       waitForElement(By.cssSelector(loginButton)).click();
    //    loginButton.click();
    //    logger.info("Перешли на подстраницу логина");
       return this;
    }

    public ProfilePage auth(String account, String pass) {
        waitForElement(By.cssSelector(accField)).sendKeys(account);
        waitForElement(By.cssSelector(passField)).sendKeys(pass);
        waitForElement(By.cssSelector(logButton)).click();
  //      logger.info("Залогинились на сайте");

        return new ProfilePage();
    }
}