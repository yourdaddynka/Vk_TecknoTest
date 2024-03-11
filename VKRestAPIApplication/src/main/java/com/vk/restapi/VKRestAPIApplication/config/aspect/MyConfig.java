package com.vk.restapi.VKRestAPIApplication.config.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.vk.restapi.VKRestAPIApplication")
@EnableAspectJAutoProxy
public class MyConfig {
}
