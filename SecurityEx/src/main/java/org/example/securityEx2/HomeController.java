package org.example.securityEx2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    // 계정이 user 하나만 존재 -- 계정 추가
    // 인증만 되면 어떤 페이지든 갈 수 있음. -- 권한을 추가할 필요가 있음.

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
