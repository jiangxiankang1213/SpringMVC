package com.how2java.ProxyAop.service.impl;

import com.how2java.ProxyAop.service.User;

/**
 * @author Jiang-XK
 * @description:
 * @date 2020-12-4 11:28
 * @param: * @param null
 * @return:
 */
public class UserImpl implements User {
    @Override
    public void delete() {
        System.out.println("删除用户");
    }
    @Override
    public void insert() {
        System.out.println("添加用户");
    }
    @Override
    public void update() {
        System.out.println("修改用户");
    }
}
