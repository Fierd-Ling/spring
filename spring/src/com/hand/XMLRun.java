package com.hand;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Auther: zhongLingYun
 * @Date: 2018/8/17 14:22
 * @Description:
 */
public class XMLRun {
    /**
     　　* @Description: 通過xmlBeanFactroy获取bean
     　　* @param [args]
     　　* @return void
     　　* @throws
     　　* @author zhongLingYun
     　　* @date 2018/8/17 14:25
     　　*/
    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Spring.xml"));
        SystemOut obj = (SystemOut) factory.getBean("helloWorld");
        System.out.println("xmlRun");
        obj.getMessage();

    }
}
