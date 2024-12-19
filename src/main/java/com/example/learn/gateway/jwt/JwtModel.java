package com.example.learn.gateway.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/18 17:53
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtModel {
    private String userName;

    private List<String> roleIdList;
}
