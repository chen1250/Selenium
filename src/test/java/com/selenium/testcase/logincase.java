package com.selenium.testcase;

import com.selenium.base.DriverBase;
import com.selenium.business.LoginPro;
import com.selenium.handle.loginPageHandle;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logincase extends CaseBase{
    public DriverBase driver;
    public LoginPro lps;
    public logincase(){
        this.driver = InDriver("chrome");
        lps = new LoginPro(driver);
    }
    @BeforeClass
    public void getHome(){
        driver.get("https://seller.dhgate.com");
        driver.findElement(By.className("t-JoinFree")).click();
        driver.sleep(3);
    }
    @Test
    public void login(){
        lps.login("backone","MISS1399427730");
        System.out.println("ssss");
    }
    @AfterClass
    public void getLose(){
        driver.close();
    }
}
