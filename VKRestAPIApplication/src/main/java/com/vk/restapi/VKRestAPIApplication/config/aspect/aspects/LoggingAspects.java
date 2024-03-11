package com.vk.restapi.VKRestAPIApplication.config.aspect.aspects;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@Aspect
@AllArgsConstructor
@Order(1)
public class LoggingAspects {
    private final Logger logger = LogManager.getLogger(LoggingAspects.class);
    private final LoggingAspectsService<Logging> service;
    private final HttpServletRequest request;

    @Before("com.vk.restapi.VKRestAPIApplication.config.aspect.AllMethodsPointCut.allMethods()")
    public void beforeControllerMethodExecution(JoinPoint joinPoint) {
        Object authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof UsernamePasswordAuthenticationToken) {
            String methodName = joinPoint.getSignature().getName();
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            LocalDateTime currentDateTime = LocalDateTime.now();
            String parameters = Arrays.toString(joinPoint.getArgs());
            String ipAddress = request.getRemoteAddr();
            service.save(new Logging(currentDateTime, username, methodName, parameters, ipAddress));
        }else {
            logger.error("Unauthorized access attempt in method: {}", joinPoint.getSignature().getName());
        }
    }
}