package org.example.oauthEx.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.example.oauthEx.domain.User;
import org.example.oauthEx.service.UserService;

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
