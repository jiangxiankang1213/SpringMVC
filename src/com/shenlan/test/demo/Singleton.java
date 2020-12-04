package com.shenlan.test.demo;

/**
 * @author Jiang-XK
 * @description:
 * @date 2020-12-1 15:12
 * @param: * @param null
 * @return:
 */
public class Singleton {
    /**
     * @ClassName :
     * @Description :  用于单例模式的测试和学习
     * @Author : Jiang-XK
     * @Date: 2020-12-1 15:37 
     */
        private Singleton(){
            System.out.println("Singleton is create");
        }
        private static Singleton instance = new Singleton();
        public static Singleton getInsatnce(){
            return instance;
        }
        public static void createString(){
            System.out.println("createString in Singleton");
        }

        public static void main(String[] args){
            Singleton.createString();
        }

}
