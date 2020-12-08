package com.shenlan.springmvc;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.logging.Logger;


@Controller
@RequestMapping("/hello")
public class HelloController{
    private static final Log logger = LogFactory.getLog(HelloController.class);
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        logger.info("开始HelloWord Obj啦");
        HashMap<String,String> a=new HashMap<String,String>();
        model.addAttribute("message", "Hello Spring MVC Framework!");
        logger.info("结束啦。。。。");
        return "hello";
    }
};
