package com.hand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhongLingYun
 * @Date: 2018/8/17 14:48
 * @Description:
 */
public class BeanApplication {
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        // /这里调用初始化
        SystemOut out = (SystemOut)context.getBean("test");
        System.out.println("Bean");
        out.setMessage("你好");
        // 第一次
        out.getMessage();
        // 第二此请求
        SystemOut out1=(SystemOut)context.getBean("test");
        out1.getMessage();
        // 不自动关闭就不会调用销毁
        //这里调用销毁
        context.registerShutdownHook();
        // 如果scope="prototype"虽然保持了每次提供的的对象不一样，但是造成的bean只会创建，调用init但是不会去
        // 调用destroy销毁
        //  即使是调用了context.registerShutdownHook();




    }
}
