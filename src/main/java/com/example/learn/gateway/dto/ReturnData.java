package com.example.learn.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/18 17:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class  ReturnData<T> {
    private int code;

    private String mass;

    private T data;


}
