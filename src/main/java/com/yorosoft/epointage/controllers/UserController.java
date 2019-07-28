package com.yorosoft.epointage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/addUser")
    public ModelAndView addUser(){
        ModelAndView view = new ModelAndView();
        view.setViewName("addUser");
        return view;
    }

    @GetMapping("/userList")
    public ModelAndView userList(){
        ModelAndView view = new ModelAndView();
        view.setViewName("userList");
        return view;
    }
}
