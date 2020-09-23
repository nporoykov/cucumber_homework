package com.cucumber.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public DriverManager() {
    }

    public static void setupDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriverThreadLocal.set(driver);
    }

    public static WebDriver getWebDriver() {
        return webDriverThreadLocal.get();
    }

    public static void quitDriver() {
        Optional.ofNullable(getWebDriver()).ifPresent(WebDriver::quit);
    }
}