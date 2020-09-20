package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

//        import org.apache.logging.log4j.LogManager;
//        import org.apache.logging.log4j.Logger;

public class ProfilePage extends BasePage {

    private String titleCheck = "//h2[text()='Цифровые навыки от ведущих экспертов']";

    private String progButton = "//a[contains(title(),'Программирование')]";

    private String infraButton = "//a[contains(title(),'Инфраструктура')]";

    private String secureButton = "//a[contains(title(),'Информационная безопасность')]";

    private String scienceButton = "//a[contains(title(),'Data Science')]";

    private String manageButton = "//a[contains(title(),'Управление')]";

    public ProfilePage checkLogin(String butName){
        assertEquals(butName, waitForElement(By.xpath(titleCheck)).getText());

        return this;
    }

}