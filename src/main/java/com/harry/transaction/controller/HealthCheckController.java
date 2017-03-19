package com.harry.transaction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheckController {

    @RequestMapping(value = "health_check", method = RequestMethod.GET)
    @ResponseBody
    public String check(){
        return "SUCCESS";
    }
}