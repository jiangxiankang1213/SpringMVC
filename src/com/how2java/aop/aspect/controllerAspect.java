package com.how2java.aop.aspect;

/**
 * @author Jiang-XK
 * @description: 这是一个测试切面的案例
 * @date 2020-12-4 9:35
 * @param: * @param null
 * @return:
 */
public class controllerAspect {
    public void testController(){
        //前置通知
        System.out.println("执行controller之前先执行这个方法再说==");
    }
}
