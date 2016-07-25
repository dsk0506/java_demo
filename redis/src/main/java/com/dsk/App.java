package com.dsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Spring Boot启动类;
 *
 * @author dsk(QQ:393573645)
 * @version v.0.1
 */

@SpringBootApplication
@ServletComponentScan
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx =SpringApplication.run(App.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");

       /* String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }*/
    }

}