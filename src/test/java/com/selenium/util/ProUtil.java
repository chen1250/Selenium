package com.selenium.util;

import java.io.*;
import java.util.Properties;

public class ProUtil {
    private Properties pro;
    private String path;
    /**
     * 构造方法
     */
    public ProUtil(String path){
    this.path = path;
    this.pro = readProper();
    }
    /**
     * 读取配置文件
     */
    public Properties readProper(){
        Properties pro = new Properties();
        try {
            InputStream inputStream = new FileInputStream(path);
            BufferedInputStream in = new BufferedInputStream(inputStream);
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  pro;
    }
    public String getPro(String key){
        if(pro.containsKey(key)){
            String u = pro.getProperty(key);
            return  u;
        }else {
            System.out.println("你获取的key值不对");
            return  "";
        }

    }
}
