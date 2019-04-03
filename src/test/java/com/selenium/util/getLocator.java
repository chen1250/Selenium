package com.selenium.util;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class getLocator {
    public static By bystr(String key){
        ProUtil proUtil = new ProUtil("properties.properties");
        String locator = proUtil.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        System.out.println(locatorType);
        System.out.println(locatorValue);
        if(locatorType.equals("id")){
            return  By.id(locatorValue);
        }else if (locatorType.equals("name")){
            return  By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return By.className(locatorValue);
        }else if (locatorType.equals("tagName")){
            return By.tagName(locatorValue);
        }else if (locatorType.equals("linkText")){
            return By.linkText(locatorValue);
        }else if (locatorType.equals("partialLinkText")){
            return  By.partialLinkText(locatorValue);
        }else{
            return By.xpath(locatorValue);
        }

   }

}
