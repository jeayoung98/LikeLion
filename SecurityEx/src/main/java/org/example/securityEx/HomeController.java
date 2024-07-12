package org.example.securityEx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    // 계정이 user 하나만 존재 -- 계정 추가
    //

    @GetMapping("/info")
    public String info() {
        return "info";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
    @GetMapping("/loginForm")
    public String loginForm() {
        return "loginForm";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @GetMapping("/fail")
    public String fail() {
        return "fail";
    }
}
