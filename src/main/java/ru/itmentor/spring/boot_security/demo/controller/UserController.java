package ru.itmentor.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itmentor.spring.boot_security.demo.service.UserDetailsServiceImp;
import ru.itmentor.spring.boot_security.demo.service.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final UserDetailsServiceImp userDetailsService;

    @Autowired
    public UserController(UserService userService, UserDetailsServiceImp userDetailsService) {
        this.userDetailsService = userDetailsService;
        this.userService = userService;
    }

    @GetMapping()
    public String indexPage(ModelMap model, Principal principal) {
        model.addAttribute("user", userDetailsService.findByName(principal.getName()));
        return "user";
    }


}
