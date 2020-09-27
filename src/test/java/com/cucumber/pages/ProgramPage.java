package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

public class ProgramPage extends BasePage{

  // private String programCount = "//div[@class ='title-new__info']//div[contains(text(), 'В разработке:')]";
  private String programCount = "//div[@class ='title-new__info']/div[2]";


    public Integer checkProgramNumbers(){
        String courses = waitForElement(By.xpath(programCount)).getText();
        return Integer.valueOf(courses.substring(courses.length()-1));
     //   assertThat(Count).isEqualTo(Integer.valueOf(courses.substring(courses.length()-1)));
   }
}
