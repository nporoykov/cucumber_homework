package com.cucumber.steps;

import com.cucumber.driver.DriverManager;
import com.cucumber.hooks.DriverHooks;
import com.cucumber.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.cucumber.driver.DriverManager.getWebDriver;

public class MyStepdefs //extends DriverHooks
{
    LoginPage loginPage = new LoginPage();

    @Before()
    public void setupDriver() {
        DriverManager.setupDriver();
    }

    @After()
    public void quitDriver() {
        DriverManager.quitDriver();
    }

    @Given("I navigate to Otus main page by {string}")
    public void iNavigateToOtusMainPageByHttpsOtusRu(String url) {
        getWebDriver().navigate().to(url);
    }

    @When("I press Login button")
    public void iPressButtonButton() {
   //     LoginPage loginPage = new LoginPage();
        loginPage.clickAuth();
    }

    @Then("I should see button {string}")
    public void iShouldSeeButtonMyCources(String butName) {
    }

    @And("I enter {string} and {string} into loginField")
    public void iEnterLoginAndPassIntoLoginField(String login, String pass) {
        loginPage.auth(login, pass);
    }
}
