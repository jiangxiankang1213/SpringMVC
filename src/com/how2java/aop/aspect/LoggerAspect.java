package com.how2java.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Jiang-XK
 * @description: 简单的日志切面
 * @date 2020-12-4 9:37
 * @param: * @param null
 * @return:
 */
public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("日志开始-" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("日志结束-" + joinPoint.getSignature().getName());
        return object;
    }

    public void before(){
        System.out.println("最先开始---" );

    }

    public void after(){
        System.out.println("最后结束的---" );
    }
}
