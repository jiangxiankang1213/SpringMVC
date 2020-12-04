package com.shenlan.test.DuoTai;

/**
 * @author Jiang-XK
 * @description:
 * @date 2020-12-2 10:00
 * @param: * @param null
 * @return:
 */
public class Test {
    public static void main(String[] args) {
        People p = new Stu();

        Stu s = (Stu)p;
        p.eat();
        s.play();
    }
}
