package com.niu.springbootinterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 控制器
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/22 3:28 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/22 3:28 下午
 * @updateRemark:
 * @version: 1.0
 **/
@RestController
public class MyController {


    @GetMapping("test")
    public Object test(){
        System.out.println("test接口");
        return "ok";
    }
}
