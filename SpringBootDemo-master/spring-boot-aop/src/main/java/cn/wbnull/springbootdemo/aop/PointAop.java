package cn.wbnull.springbootdemo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointAop {
    @Pointcut("execution(public * cn.wbnull.springbootdemo.taop.*.*(..))")
    private void pointAop(){

    }

    @Before("pointAop()")
    public void beforeAop(){
        System.out.println("before");
    }

    @After("pointAop()")
    public void afterAop(){
        System.out.println("after");
    }

}
