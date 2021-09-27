package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01VerifyUrlTest {
            /*
                    1.Create a new class: VerifyURLTest
                    2.Navigate to google homepage
                    3.Verify if google homepage url is “www.google.com”
             */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ismailcenik/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String expectedURL = "https://www.google.com";
        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected URL: " + expectedURL);
            System.out.println("Actual URL: "+ actualURL);
        }
        driver.close();
        /*
            FAIL
            Expected URL: https://www.google.com
            Actual URL: https://www.google.com/

         */
    }
}
