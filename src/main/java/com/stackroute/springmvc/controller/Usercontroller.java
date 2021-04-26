package com.stackroute.springmvc.controller;
import com.stackroute.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Usercontroller {
    @RequestMapping("/")
    public String display(Model model)
    {
        User res=new User();
        res.setUsername("Anil");
        //provide reservation object to the model
        model.addAttribute("User", res);
        return "index";
    }
}