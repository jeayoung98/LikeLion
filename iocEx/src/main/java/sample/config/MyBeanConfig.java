package sample.config;

import sample.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "sample.bean.")
public class MyBeanConfig {
    //    <bean id="myBean" class = "sample.MyBean"/>
//    @Bean
//    public MyBean myBean() {
//        return new MyBean();
//    }
    @Bean
    public MyBean myBean2() {
        return new MyBean();
    }
    @Bean
    @Scope("prototype")
    public MyBean myBean3() {
        return new MyBean();
    }
}
