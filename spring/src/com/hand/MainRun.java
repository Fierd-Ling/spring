package com.hand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhongLingYun
 * @Date: 2018/8/17 09:50
 * @Description:
 */
public class MainRun {
    /**
     * 　　* @Description: 通過application 获取bean
     * 　　* @param [args]
     * 　　* @return void
     * 　　* @throws
     * 　　* @author zhongLingYun
     * 　　* @date 2018/8/17 14:21
     *
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        SystemOut systemOut = (SystemOut) context.getBean("helloWorld");
        systemOut.getMessage();
    }
}