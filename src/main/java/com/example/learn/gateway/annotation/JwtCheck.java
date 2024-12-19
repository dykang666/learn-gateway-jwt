package com.example.learn.gateway.annotation;

import java.lang.annotation.*;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 描述: jwt检查注解
 * 目前主要用于 AuthController的testJwtCheck方法
 * @date 2024/12/18 18:10
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JwtCheck {
    String value() default "";
}
