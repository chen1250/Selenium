package com.selenium.page;

import com.selenium.base.DriverBase;
import com.selenium.util.getLocator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginPage extends BasePage {
    public loginPage(DriverBase driver) {
        super(driver);
    }
    /**
     * 封装输入用户名
     */
    public WebElement getUserName(){
       return element(getLocator.bystr("user"));
    }
    /**
     * 封装输入密码
     */
    public  WebElement getPassword(){
        return  element(getLocator.bystr("pass"));
    }
    /**
     * 封装登录按钮
     */
    public  WebElement getButton(){
        return  element(getLocator.bystr("buttons"));
    }
}
