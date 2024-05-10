package sample.run;

import sample.bean.MyBean;
import sample.config.MyBeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEx1 {
    public static void main(String[] args) {
        // 직접 사용 하는 경우 !
//        MyBean bean = new MyBean();
//        bean.setName("hi");

        // 1. 에노테이션으로 알려줌 컴포넌트 스캔하도록
        // 2. 자바 파일을 통해 알려줌

//        BeanFactory -> 빈을 생성하는데 간단한 기능만 포함 . aop 기술은 사용 x
        System.out.println("ApplicationContext 생성전 !");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class); // 공장이 생성될때 어떤 빈을 생성해야할지 알아야함.
        System.out.println("ApplicationContext 생성후 !");

        MyBean bean1 = (MyBean) context.getBean("myBean"); // lookup 방식 . --id를 알려줌
        bean1.setName("jung");
        System.out.println(bean1);

//        MyBean bean2 = context.getBean(MyBean.class); // 타입만 알려줌 .
        MyBean bean2 = context.getBean("myBean2",MyBean.class);
        bean2.setName("hong");
        System.out.println(bean2);
        System.out.println(bean1);

        if(bean1 == bean2) System.out.println("bean1, bean2 같음");
        else System.out.println("bean1, bean2 다름");

        MyBean bean3 = context.getBean("myBean", MyBean.class);

        if(bean3 == bean1) System.out.println("bean1,bean3 같음");
        else System.out.println("bean1, bean3 다름");

        MyBean bean4 = context.getBean("myBean3", MyBean.class);
        bean4.setName("kim");
        System.out.println(bean4);

        MyBean bean5 = context.getBean("myBean3", MyBean.class);
        bean5.setName("lee");
        System.out.println(bean5);
        // 3. xml을 통해 알려줌 . 현재는 많이 사용 x

    }

}
