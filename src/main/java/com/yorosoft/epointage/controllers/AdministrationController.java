package com.yorosoft.epointage.controllers;

import com.yorosoft.epointage.models.Privilege;
import com.yorosoft.epointage.repositories.PrivilegeRepository;
import com.yorosoft.epointage.services.Implementation.PrivilegeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class AdministrationController {

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Autowired
    private PrivilegeServiceImpl privilegeService;

    @GetMapping("/addRole")
    public ModelAndView addRole(){
        ModelAndView view = new ModelAndView();
        view.setViewName("addRole");
        return view;
    }

    @GetMapping("/roleList")
    public ModelAndView roleList(){
        ModelAndView view = new ModelAndView();
        view.setViewName("roleList");
        return view;
    }

    @GetMapping("/addPrivilege")
    public ModelAndView addPrivilege(Model model){
        ModelAndView view = new ModelAndView();
        view.setViewName("addPrivilege");

        return view;
    }

    @PostMapping("/addPrivilege")
    public ModelAndView addPrivilege(@Valid Privilege privilege, BindingResult result, Model model){
        ModelAndView view = new ModelAndView();
        view.setViewName("addPrivilege");
        if (result.hasErrors()) {
            return view;
        }
        privilegeRepository.save(privilege);
        view.addObject("privileges", privilegeRepository.findAll());
        return view;
    }


    @GetMapping("/privilegeList")
    public ModelAndView privilegeList(){
        ModelAndView view = new ModelAndView();
        view.setViewName("privilegeList");
        return view;
    }
}
