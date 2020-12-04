package com.how2java.aop.test;

import com.how2java.aop.controller.TestController;
import com.how2java.aop.service.ProductService;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Jiang-XK
 * @description:
 * @date 2020-12-4 14:23
 * @param: * @param null
 * @return:
 */
public class TestSpringAopTest extends TestCase {

    @Test
    public void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        productService.doSomeService();
        TestController testController=(TestController)context.getBean("testController");
        testController.testController();
    }
}