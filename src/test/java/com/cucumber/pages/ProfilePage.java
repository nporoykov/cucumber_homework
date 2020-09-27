package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

//        import org.apache.logging.log4j.LogManager;
//        import org.apache.logging.log4j.Logger;

public class ProfilePage extends BasePage {

    private String titleCheck = "//h2[text()='Цифровые навыки от ведущих экспертов']";

    private String programName = "//div[@id='categories_id']//a[@title='%s']";

    private String headerName = "//div[contains(@class, 'header2_subheader-container__right')]//a[@title='%s']";

    public void selectProgram(String streamName) {
        try{
            waitForElement(By.xpath("//button[contains(text(), 'Согласен')]")).click();
            waitForElement(By.xpath("//div[contains(@class, 'new-log-reg')]")).click();
            //<div class="new-log-reg">
            //  logger.info("");
        }catch (Exception e){
          //  logger.info("");
        }
        waitForElement(By.xpath(format(programName, streamName))).click();
      //  return new ProgramPage();
    }

    public void selectHeader(String headerNameName) {
        try{
            waitForElement(By.xpath("//button[contains(text(), 'Согласен')]")).click();
            waitForElement(By.xpath("//div[contains(@class, 'new-log-reg')]")).click();
            //<div class="new-log-reg">
            //  logger.info("");
        }catch (Exception e){
            //  logger.info("");
        }
        waitForElement(By.xpath(format(headerName, headerNameName))).click();
        //  return new ProgramPage();
    }

    public void checkLogin(String butName){
        assertEquals(butName, waitForElement(By.xpath(titleCheck)).getText());

      //  return this;
    }

}