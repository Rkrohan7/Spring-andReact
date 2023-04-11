package com.project.aop.controller;

import com.project.aop.service.Myinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @RestController = @Controller + @ResponseBody

@Controller
public class AopController {

    @Autowired
    private Myinterface myinterface;

    @ResponseBody
    @GetMapping("/testaop")
    public String checkAop(){
      return myinterface.testAop();
    }

   // @ResponseBody
    @GetMapping("/check")
    public String checkPage(){
        return "index.html";
    }
}

// thymeleaf