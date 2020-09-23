package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

public class ProgramPage extends BasePage{

   private String programCount = "//div[contains(text(), 'Курсов:')]";

   public void checkProgramNumbers(Integer Count){
        String courses = waitForElement(By.xpath(programCount)).getText();
        assertThat(Count).isEqualTo(Integer.valueOf(courses.substring(courses.indexOf(' ')).trim()));
   }
}
