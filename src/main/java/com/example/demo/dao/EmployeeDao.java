package com.example.demo.dao;

import com.example.demo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: lizhongxin
 * @create: 2019-05-24 09:21
 **/
@Mapper
public interface EmployeeDao {
    int add(Employee employee);
}
