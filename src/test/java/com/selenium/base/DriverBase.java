package com.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DriverBase {
    WebDriver driver;
    public DriverBase(String brower){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.getName(brower);

    }
    /**
     * 关闭浏览器
     */
    public void close(){
        driver.quit();
    }
    /**
     * 打开网页
     */
    public void get(String url){
        driver.get(url);
    }
    /**
     * 获取driver
     */
    public WebDriver getDriver(){
        return  driver;
    }
    /**
     * 封装element
     */
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return  element;
    }
    /**
     * 封装等待
     */
    public void sleep(int s){
       driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
    }
}
