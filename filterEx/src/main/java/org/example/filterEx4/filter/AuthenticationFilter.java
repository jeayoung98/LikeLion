package org.example.filterEx4.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Setter;
import org.example.filterEx4.entity.User;
import org.example.filterEx4.service.UserService;
import org.springframework.stereotype.Service;


import java.io.IOException;

@Setter
@Service
public class AuthenticationFilter implements Filter {
    private UserService userService;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            String path = request.getRequestURI(); // 요청주소 ex) /welcome , /loginform, /admin/list
            String auth = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("auth")) {
                        auth = cookie.getValue();
                        break;
                    }
                }
            }
            // 인증된 사용자
            if(auth != null) {
                // 요청 url 에 따라서 http://localhost:8080/admin -- Role 이 ROLE_ADMIN 인 사용자에게만 인가 되도록
                User user = userService.findByUsername(auth);
                if (user != null) {
                    if((path.equals("/admin")&& user
                            .getRoles()
                            .stream()
                            .anyMatch(role -> role.getName().equals("ROLE_ADMIN")))
                        ||
                            (path.equals("/info") && user
                                    .getRoles()
                                    .stream()
                                    .anyMatch(role -> role.getName().equals("ROLE_USER"))
                            )
                    ){
                        filterChain.doFilter(servletRequest, servletResponse);
                        UserContext.clear();
                        return;
                    }
                }

                // 권한이 없는 사용자가 접근 하려고 한다면
                if (path.equals("/admin") || path.equals("/info")) {
                    response.sendRedirect("/access-denied");
                } else {
                    filterChain.doFilter(servletRequest, servletResponse);
                    UserContext.clear();
                }
//                User user = new User();
//                user.setUsername(auth);
//
//                UserContext.setUser(user);
            }
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            UserContext.clear();
        }
    }
}
