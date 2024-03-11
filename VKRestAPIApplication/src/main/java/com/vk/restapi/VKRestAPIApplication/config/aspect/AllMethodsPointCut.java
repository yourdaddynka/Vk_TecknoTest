package com.vk.restapi.VKRestAPIApplication.config.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class AllMethodsPointCut {

    @Pointcut("execution(* com.vk.restapi.VKRestAPIApplication.krud.AllServiceCRUDController.*(..)) ||"
            + "execution(* com.vk.restapi.VKRestAPIApplication.controller.JsonPlaceholderProxyController.*(..))")
    public void allMethods() {
    }

    @Pointcut("execution(* com.vk.restapi.VKRestAPIApplication.controller.*.*User*(..))")
    public void allMethodsFromUser() {
    }

    @Pointcut("execution(* com.vk.restapi.VKRestAPIApplication.controller.*.*Album*(..))")
    public void allMethodsFromAlbum() {
    }

    @Pointcut("execution(* com.vk.restapi.VKRestAPIApplication.controller.*.*Comment*(..))")
    public void allMethodsFromComment() {
    }

    @Pointcut("execution(* com.vk.restapi.VKRestAPIApplication.controller.*.*Photo*(..))")
    public void allMethodsFromPhoto() {
    }

    @Pointcut("execution(* com.vk.restapi.VKRestAPIApplication.controller.*.*Post*(..))")
    public void allMethodsFromPost() {
    }

    @Pointcut("execution(* com.vk.restapi.VKRestAPIApplication.controller.*.*Todo*(..))")
    public void allMethodsFromTodo() {
    }
}
