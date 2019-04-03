package com.selenium.handle;

import com.selenium.base.DriverBase;
import  com.selenium.page.loginPage;

public class loginPageHandle {
    public DriverBase driver;
    public loginPage lp;
    public loginPageHandle(DriverBase driver){
        this.driver = driver;
        lp = new loginPage(driver);
    }
    /**
     * 输入用户名
     */
    public void sendKeysUser(String name){
        lp.sendKeys(lp.getUserName(),name);
    }
    /**
     * 输入密码
     */
    public void sendKeysPassword(String password){
        lp.sendKeys(lp.getPassword(),password);
    }
    /**
     * 点击登录
     */
    public void clickButton(){
        lp.click(lp.getButton());
    }
    /**
     * 判断页面是否显示
     */
    public boolean assLoginPage(){
      return lp.assertElementIs(lp.getUserName());
    }

}
