package org.example.aopex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAspect {
    @Pointcut("execution(* org.example.aopex.SimpleService.*(..))")
    public void pc() {

    }

    @Pointcut("execution(* hello())")
    public void pc2() {

    }

    @Before("execution(* org.example.aopex.SimpleService.*(..))")
    public void before(JoinPoint joinPoint) {

        System.out.println("Before :::::::::::::::::" + joinPoint.getSignature().getName());
    }

    @After("execution(String org.example.aopex.SimpleService.*(..))")
    public void after() {
        System.out.println("After ::::::::::::::");
    }

    @AfterReturning(pointcut = "execution(String org.example.aopex.*.*(..))", returning = "result") // 리턴값 String 인것만
    public void afterReturningServiceMethod(JoinPoint joinPoint, Object result) {
        System.out.println("After method: " + joinPoint.getSignature().getName() + ", return value: " + result);
    }

    @Before("execution(* setName(..))")
    public void beforeName(JoinPoint joinPoint) {
        System.out.println("beforeName::::::::::::::: ");
        System.out.println("method name::::::" + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object ob : args) {
            System.out.println("::::::::인자 -> " + ob);
        }
    }

    @AfterThrowing(value = "pc2()", throwing = "ex") // 예외를 발생시켰을때만 실행
    public void afterThrowing(Throwable ex) {
        System.out.println("AfterThrowing ::::::::::::::::::::");
        System.out.println("exception value ::" + ex);
    }

    @Around("pc()")
    public String around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Around run :::::::::::::: 실제 호출된 메서드가 실행되기 전에 할일 구현");

        String value = (String) joinPoint.proceed(); // 실제 target 메서드를 호출

        System.out.println("Around run :::::::::::::: 실제 호출된 메서드가 실행된 후 할일 구현");
        value += "jung aop run !!";
        return value;
    }
}
