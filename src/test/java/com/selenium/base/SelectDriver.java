package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    public WebDriver getName(String brower){
        if (brower.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.marionette",".//driver//geckodriver.exe");
                return new FirefoxDriver();
        }else{
            System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe");
            return  new ChromeDriver();
        }

    }
}
