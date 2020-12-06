package com.shenlan.springmvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController{
    //static Logger log = Logger.getLogger(HelloController.class.getName());
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        //log.info("Going to create HelloWord Obj");
        model.addAttribute("message", "Hello Spring MVC Framework!");
        //log.info("Exiting the program");
        return "hello";
    }
}
