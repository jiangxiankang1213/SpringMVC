package com.how2java.aop.test;

import com.how2java.aop.controller.TestController;
import com.how2java.aop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiang-XK
 * @description:
 * @date 2020-12-4 10:01
 * @param: * @param null
 * @return:
 */
public class TestSpringAop {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        productService.doSomeService();
        TestController testController=(TestController)context.getBean("testController");
        testController.testController();
      /*  TestController testController = (TestController) context.getBean("testController");
        testController.testController();*/
    }
}
