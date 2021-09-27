package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        //1.Step: Set the path with System.setProperty
        System.setProperty("webdriver.chrome.driver",
                            "/Users/ismailcenik/Documents/selenium dependencies/drivers/chromedriver");
        //2.Step: Create WebDriver object. This is a must before creating any automation
        //Note: When we create driver object, I use polymorphism
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }
}
