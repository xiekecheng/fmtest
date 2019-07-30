package com.learn.fmtest5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @description: 日志切面类
 * @author: Kecheng Xie
 * @since: 2019-07-28 11:44
 **/
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.learn.fmtest5.service.*.*(..))")
    public void pc1(){

    }

    @Before(value = "pc1()")
    public void before(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println(name+"方法开始执行...");

    }

    @After(value = "pc1()")
    public void after(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println(name+"方法执行结束...");
    }

    @AfterReturning(value = "pc1()", returning = "result")
    public void afterReturning(JoinPoint jp,Object result){
        String name = jp.getSignature().getName();
        System.out.println(name+"方法的返回值为:" +result);
    }

    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint jp,Exception e){
        String name = jp.getSignature().getName();
        System.out.println(name+"方法抛出了异常:"+e.getMessage());
    }

    @Around("pc1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        return pjp.proceed();
    }
}
