package com.hand;

/**
 * @Auther: zhongLingYun
 * @Date: 2018/8/17 09:47
 * @Description:
 */
public class SystemOut {
    private String message;
    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public  void init(){
        System.out.println("init");
    }
    public  void destroy(){
        System.out.println("destroy");
    }
}

