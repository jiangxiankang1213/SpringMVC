package com.shenlan.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.logging.Logger;

@Controller
@RequestMapping("/hello")
public class HelloController{
    static Logger log = Logger.getLogger(HelloController.class.getName());
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        log.info("Going to create HelloWord Obj");
        HashMap<String,String> a=new HashMap<String,String>();
        model.addAttribute("message", "Hello Spring MVC Framework!");
        log.info("Exiting the program");
        return "hello";
    }
}
