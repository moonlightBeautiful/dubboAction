package com.bjsasc;

import com.shenruan.service.ProcessService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        ProcessService processService = (ProcessService) context.getBean("processService");
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i = 0; i < 100; i++) {
            String result = processService.createProcess("机加工艺");
            switch (result) {
                case "服务001": {
                    i1++;
                    break;
                }
                case "服务002": {
                    i2++;
                    break;
                }
                default: {
                    i3++;
                }
            }
            System.out.println("消费服务，服务提供者为：" + result);
        }
        System.out.println("消费服务001：" + i1);
        System.out.println("消费服务002：" + i2);
        System.out.println("消费服务003：" + i3);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        context.close();
    }
}
