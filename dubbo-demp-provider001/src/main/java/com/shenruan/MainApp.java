package com.shenruan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo" +
                "-provider001.xml"});
        context.start();
        System.out.println("服务提供者001注册服务成功，端口：20881");
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // press any key to exit
        context.close();
    }

}

