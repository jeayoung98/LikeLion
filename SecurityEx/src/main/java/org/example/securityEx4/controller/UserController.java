package org.example.securityEx4.controller;

import lombok.RequiredArgsConstructor;
import org.example.securityEx4.domain.User;
import org.example.securityEx4.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/userregform")
    public String userregform() {
        return "users/userregform";
    }

    @PostMapping("/userreg")
    public String userreg(@ModelAttribute("user") User user,
                          BindingResult result) {

        userService.registerUser(user);
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "users/welcome";
    }
}
