package com.zaurtregulov.spring.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zaurtregulov.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {


}
