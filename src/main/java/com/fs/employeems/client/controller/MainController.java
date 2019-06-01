package com.fs.employeems.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee-ms-client")
public class MainController {

    @GetMapping("/index")
    public String index() {
        System.out.println("request received");
        return "employee";
    }

    @GetMapping("/department")
    public String department() {
        return "department";
    }

    @GetMapping("/employee")
    public String employee() {
        return "employee";
    }

    @GetMapping("/employee_add")
    public String employee_add() {
        return "employee_add";
    }

    @GetMapping("/position")
    public String position() {
        return "position";
    }

}
