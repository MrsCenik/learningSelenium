package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day01FirefoxBrowserDemo {
    public static void main(String[] args) {
        //Set Path
        System.setProperty("webdriver.gecko.driver",
                        "/Users/ismailcenik/Documents/selenium dependencies/drivers/geckodriver");
        //Create gecko driver
        WebDriver driver = new FirefoxDriver();
        //Open google home page
        driver.get("https://www.google.com/");
        //Maximize the window
        driver.manage().window().maximize();
        //Close the window
        driver.close();

    }
}
