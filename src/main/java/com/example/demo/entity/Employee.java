package com.example.demo.entity;

import lombok.Data;

/**
 * @author: lizhongxin
 * @create: 2019-05-23 17:46
 **/
@Data
public class Employee {
    private int id;
    private String name;
    private String password;
    private int age;
    private String createTime;
    private boolean state;
}
