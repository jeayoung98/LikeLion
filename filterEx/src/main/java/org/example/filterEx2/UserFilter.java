package org.example.filterEx2;

import jakarta.servlet.*;

import java.io.IOException;

public class UserFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 사용자가 요청하면서 보낸 값이 있다면 추출해서 UserContext 에 저장하는 코드 구현.
        try {
            User user = new User();
            user.setUsername("jung");
            user.setPassword("1234");

            UserContext.setUser(user); // UserContext 에 값을 저장 했을때 이값을 어디서 사용 할 수 있는지 ..
            filterChain.doFilter(servletRequest, servletResponse);
        }finally {
            UserContext.clear();
            // 쓰레드를 사용하므로, 기존에 사용했던 스레드를 또 쓸 수 있음.
            // 그때 ThreadLocal 에 값이 남아있으면 안되므로 clear
        }




    }


}
