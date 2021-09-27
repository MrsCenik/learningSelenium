package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01BasicNavigation {
    /*
            Create a new class under : BasicNavigations
            Create main method
            Set Path
            Create chrome driver
            Open google home page https://www.google.com/.
            On the same class, Navigate to amazon home page https://www.amazon.com/
            Navigate back to google
            Navigate forward to amazon
            Refresh the page
            Maximize the window
            Close/Quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        //Set the path
        System.setProperty("webdriver.chrome.driver",
                "/Users/ismailcenik/Documents/selenium dependencies/drivers/chromedriver");
        //Create/open chrome driver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
        Thread.sleep(5000); //putting 5 seconds hard wait

//        driver.navigate().to("https://www.google.com/");
        //On the same clasee navigate to amazon.com
        driver.get("https://www.amazon.com/");
        //Navigate back to google
        driver.navigate().back();
        Thread.sleep(5000);
        //Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(5000);

        //refresh
        driver.navigate().refresh();

        //close the browser
        driver.close();
        /*
                NOTES:
               ** What is the difference between get() navidate().to()?
                  *get() is used more than navigate().to(), cause it is shorter
                  *get() is a little faster
                  *get() takes ONLY string as parameter, but navigate().to() takes string or URL as parameter
                  *navigate() has followup methods(forward, back, refresh)
               ** What is the difference between close() and quit()
                  *close() closes only the current working browser
                  *quit() closes all working browser
         */
        //How to add some wait using JAVA
        //Thread.sleep(5000); wait for 5 second before the next step
        //This is a JAVA wait. this is not selenium wait
        //For this reason, Thread.sleep is not recommend to use
        //Because this ius a HARD WAIT. It means page will not matter what
        //For example, if page need only 1 second, then the page will wait 5 second based on Thread.sleep(5000)
        //Note that we will learn Selenium wait to wait DYNAMICALLY
    }
}
