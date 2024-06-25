package org.example.filterEx2;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<UserFilter> authenticationFilter() {
        FilterRegistrationBean<UserFilter> registrationBean = new FilterRegistrationBean<>();
        UserFilter userFilter = new UserFilter();
        registrationBean.setFilter(userFilter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1); // 필터 실행시 우선순위 . 작을수록 우선순위 높음
        return registrationBean;
    }
}
