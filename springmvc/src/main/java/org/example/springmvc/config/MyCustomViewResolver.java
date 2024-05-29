package org.example.springmvc.config;

import lombok.Setter;
import org.example.springmvc.view.MyCustomView;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@Setter
public class MyCustomViewResolver implements ViewResolver, Ordered {
    private int order;
    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        if(viewName.startsWith("my-prefix")) return new MyCustomView();
        return null; // 다음 view resolver 가 처리 .
    }
}
