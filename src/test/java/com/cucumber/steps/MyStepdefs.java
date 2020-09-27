package com.cucumber.steps;

import com.cucumber.driver.DriverManager;
import com.cucumber.hooks.DriverHooks;
import com.cucumber.pages.HeaderPage;
import com.cucumber.pages.LoginPage;
import com.cucumber.pages.ProfilePage;
import com.cucumber.pages.ProgramPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.cucumber.driver.DriverManager.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class MyStepdefs //extends DriverHooks
{
   // LoginPage loginPage = new LoginPage();
   // ProfilePage profilePage = new ProfilePage();
   // ProgramPage programPage = new ProgramPage();

    @Given("I navigate to Otus main page by {string}")
    public void iNavigateToOtusMainPageByHttpsOtusRu(String url) {
        getWebDriver().navigate().to(url);
    }

    @When("I press Login button")
    public void iPressButtonButton() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickAuth();
    }

    @And("I enter {string} and {string} into loginField")
    public void iEnterLoginAndPassIntoLoginField(String login, String pass) {
        LoginPage loginPage = new LoginPage();
        loginPage.auth(login, pass);
    }

    @Then("I should see h2 {string}")
    public void iShouldSeeButtonMyCources(String butName) {
        ProfilePage profilePage = new ProfilePage();
        profilePage.checkLogin(butName);
    }

    @When("I select tab {string}")
    public void iSelectTabTabName(String programName) {
         ProfilePage profilePage = new ProfilePage();
         profilePage.selectProgram(programName);
    }

    @Then("I should see {int} courses in development")
    public void iShouldSeeNumberOfCoursesCourses(Integer Count) {
        ProgramPage programPage = new ProgramPage();
        assertThat(Count).isEqualTo(programPage.checkProgramNumbers());
    }

    @When("I select header link {string}")
    public void iSelectHeaderLinkLinkName(String linkName) {
        ProfilePage profilePage = new ProfilePage();
        profilePage.selectHeader(linkName);
    }

    @Then("I should see {string} title on a page")
    public void iShouldSeeTitleNameTitleOnAPage(String titleName) {
        HeaderPage headerpage = new HeaderPage();
        assertThat(headerpage.titleReturn(titleName)).contains(titleName);
    }
}
