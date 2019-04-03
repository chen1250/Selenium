package com.selenium.testcase;

import com.selenium.base.DriverBase;

public class CaseBase {
    public DriverBase InDriver(String brower){
        return  new DriverBase(brower);
    }
}
