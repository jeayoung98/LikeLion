package org.example.securityEx3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/abc") // Admin 만 접근
    public String abc() {
        return "abc";
    }

    @GetMapping("/def") // Admin , SuperUser 접근
    public String def() {
        return "def";
    }

    @GetMapping("/list") // Admin , SuperUser 접근
    public String list() {
        return "list";
    }

    @GetMapping("/add") // Admin , SuperUser 접근
    public String add() {
        return "add";
    }
}
