package com.how2java.aop.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author Jiang-XK
 * @description:
 * @date 2020-12-4 9:52
 * @param: * @param null
 * @return:
 */
@Component
@Controller
public class TestController {

    public void testController(){
        System.out.println("控制器");
    }
}
