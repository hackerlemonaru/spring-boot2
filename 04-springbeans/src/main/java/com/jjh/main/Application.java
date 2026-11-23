package com.jjh.main;

import com.jjh.beans.ExpensiveService;
import com.jjh.message.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.jjh.beans.CalculationService;
import com.jjh.beans.DataService;
import com.jjh.beans.PrintService;
import com.jjh.logging.LoggingService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jjh.message","com.jjh.beans"})
public class Application {
    public static void main(String[] args) {
        System.out.println("Main - Obtaining Application Context");
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Main - requesting MessageService");
        //MessageService service = (MessageService)ctx.getBean("MessageService");
