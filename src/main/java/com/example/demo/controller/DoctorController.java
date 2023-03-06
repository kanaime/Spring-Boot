package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String index() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/2")
    @ResponseBody
    public String index2() {
        return "David Tennant";
    }

    @GetMapping("/doctor/3")
    @ResponseBody
    public String index3() {
        return "Jodie Whittake";
    }
}
