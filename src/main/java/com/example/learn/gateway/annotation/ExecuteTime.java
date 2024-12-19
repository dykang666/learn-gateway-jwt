package com.example.learn.gateway.annotation;

import java.lang.annotation.*;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 描述: 记录调用时间
 * @date 2024/12/18 18:09
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExecuteTime {
    String value() default "";
}
