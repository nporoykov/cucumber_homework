package com.cucumber.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;


public class HeaderPage extends BasePage{
    private String headerPageTitle = "//h1[contains(text(), '%s')]";


    public String titleReturn(String headerName){
        return waitForElement(By.xpath(format(headerPageTitle, headerName))).getText();
    }

}
