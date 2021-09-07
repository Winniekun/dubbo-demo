package com.wkk.springbootdubboconsumer;

import com.wkk.springbootdubboapi.api.HelloApi;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@EnableDubbo
@SpringBootApplication
public class SpringBootDubboConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootDubboConsumerApplication.class, args);
        HelloApi demoService = (HelloApi) context.getBean("demoService");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(demoService.sengMsg(s));
        }
    }

}
