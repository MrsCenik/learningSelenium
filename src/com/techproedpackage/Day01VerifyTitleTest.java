package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ismailcenik/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //Verify if google title is "google"

        String expectedTitle = "google";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("Actual: " + expectedTitle);
            System.out.println("Expected: " + actualTitle);
        }
        driver.close();
        /*
            NOTES:
            Our script fails cause google!=Google
                1.Run the script again
                2.Manual Testing to make sure functionality is good
                3.Communicate with BA(who write Acceptance Criteria) of sometimes PO(providing the AC)
                to make sure the document(AC) has no error/typo

            As testers, we do not fix the documents! Or ignore the errors like errors-typo, mossing criteria
            Our goal is to WRITE SCRIPT TO CATCH BUGS
                                 NOT A CODE TO PASS
                 4. Should I open a JIRA?
                    -Follow the company culture
                    -Some companies do not open JIRA ticket if the story is in development
                    -Talk to dev to fix thr issue quickly
                  5. When fixed, then we retest

                  In some companies, tester open ticket as soon as they find a bug

                    *Note: If you find a bug that is already developed, then we should communicate to verify the bug
                    Then open a JIRA Ticket
         */
    }
}
