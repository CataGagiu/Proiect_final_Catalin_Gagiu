package com.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class PaginaDeBaza
{
    WebDriver driver;

    @Parameters({"browserParam"})
    @BeforeTest(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser)
    {
        //open page
        String url = "https://www.saucedemo.com/";
        switch (browser)
        {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
    }

    public void inchideBrowser()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

}
