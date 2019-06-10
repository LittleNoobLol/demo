package com.example.demo.controller;


import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        long startTime = System.currentTimeMillis();    //获取开始时间
        System.out.println("开始时间:" + startTime);
        for (int i = 0; i < 1000; i++) {
            Employee employee = new Employee();
            employee.setName("张三" + i);
            employee.setAge((int) (Math.random() * 100));
            employee.setState(false);
            employee.setPassword("123456");
            employeeDao.add(employee);
        }
        long endTime = System.currentTimeMillis();    //获取结束时间

        System.out.println("\t程序运行时间：" + endTime + "ms");    //输出程序运行时间
        return "ok";
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show() {
        return "show";
    }
}
