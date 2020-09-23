package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

//        import org.apache.logging.log4j.LogManager;
//        import org.apache.logging.log4j.Logger;

public class ProfilePage extends BasePage {

    private String titleCheck = "//h2[text()='Цифровые навыки от ведущих экспертов']";

    private String programName = "//a[contains(title(),'%s')]";

    public ProgramPage selectProgram(String streamName) {
        waitForElement(By.xpath(format(programName, streamName))).click();

        return new ProgramPage();
    }

    public ProfilePage checkLogin(String butName){
        assertEquals(butName, waitForElement(By.xpath(titleCheck)).getText());

        return this;
    }

}