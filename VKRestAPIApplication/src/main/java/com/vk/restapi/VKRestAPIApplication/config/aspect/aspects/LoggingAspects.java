package com.vk.restapi.VKRestAPIApplication.config.aspect.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@Aspect
@Order(10)
public class LoggingAspects {
    private static final Logger logger = LogManager.getLogger(LoggingAspects.class);

    @Before("com.vk.restapi.VKRestAPIApplication.config.aspect.aspects.AllMethodsPointCut.allMethods()")
    public void beforeControllerMethodExecution(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        LocalDateTime currentDateTime = LocalDateTime.now();
        Object[] args = joinPoint.getArgs();
        logger.info("Method '{}' is about to be executed by user '{}' at {} with arguments: {}", methodName, username, currentDateTime, Arrays.toString(args));
    }


}
