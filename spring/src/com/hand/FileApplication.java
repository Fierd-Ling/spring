package com.hand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Auther: zhongLingYun
 * @Date: 2018/8/17 14:31
 * @Description:
 */
public class FileApplication {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("G:\\spring\\src\\Spring.xml");
        SystemOut systemOut = (SystemOut) context.getBean("helloWorld");
        System.out.println("FileApplication");
        systemOut.getMessage();
    }
}
