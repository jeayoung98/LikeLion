package org.example.filterEx3;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.filterEx2.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @GetMapping("/loginform")
    public String loginform(Model model) {
        model.addAttribute("user", new User());
        return "loginform";
    }

    @PostMapping("/login")
    public String loginform(@ModelAttribute("user") User user, HttpServletResponse response) {
        // 사용자가 보낸 username 과 패스워드가 서버가 원하는 정보와 일치하는지 확인
        // 사용자 정보를 유지하게 하면 됨.
        if (user.getUsername().equals("jung") && user.getPassword().equals("1234")) {
            // 실제 서비스에서는 아이디 암호를 검사해서 진행하겠지만 여기서는 간단하게 진행
            Cookie cookie = new Cookie("auth", "jung");
            cookie.setPath("/");

            // 이렇게 생성된 쿠키는 다시 클라이언트에게 보내짐
            response.addCookie(cookie);
        }
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/info")
    @ResponseBody
    public String info(HttpServletRequest request) {
        String auth = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie != null) {
                if (cookie.getName().equals("auth")) {
                    auth = cookie.getValue();
                    break;
                }
            }
        }

        if (auth != null) {
            return "redirect:/welcome";
        } else return "redirect:/loginform";
    }
}
