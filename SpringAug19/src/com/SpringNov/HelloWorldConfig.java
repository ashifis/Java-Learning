package com.SpringNov;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public int helloWorld(){
      return 5;   }
}
