package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer 
{
   public static void main(String[] args) 
   {
       new DemoApplication().configure(new SpringApplicationBuilder(DemoApplication.class)).run(args);
   }
}


//java -jar demo-0.0.1-SNAPSHOT.jar
