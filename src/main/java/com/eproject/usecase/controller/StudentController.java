package com.eproject.usecase.controller;

import com.eproject.usecase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listStudent",studentService.getAllStudents());
        return "index";
    }

}
