package com.selenium.business;

import com.selenium.base.DriverBase;
import  com.selenium.handle.loginPageHandle;

public class LoginPro {
   public loginPageHandle lph;
   public  DriverBase driver;
    public LoginPro(DriverBase driver){
        this.driver = driver;
        lph = new loginPageHandle(driver);
    }
    public void login(String name,String password){
        if (lph.assLoginPage()){
            lph.sendKeysUser(name);
            lph.sendKeysPassword(password);
            lph.clickButton();
        }else {
            System.out.println("页面不存在");
      }
    }
}
