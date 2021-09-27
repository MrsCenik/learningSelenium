package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01PageResource {
    public static void main(String[] args) {
        //Set the path
        System.setProperty("webdriver.chrome.driver",
                "/Users/ismailcenik/Documents/selenium dependencies/drivers/chromedriver");
        //Create/open chrome driver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //getPageSource() returns page source code as a string
        //We might use this to verify if a certain text exist in the entire page
        //Note that pageSource is not used a lot to do assertions because it is too general and can lead false result
        String pageSource= driver.getPageSource();
        System.out.println(pageSource.contains("Most-loved dresses"));
        if(pageSource.contains("Most-loved dresses")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.close();
    }
}
