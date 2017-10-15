package com.example.aop.aspectJ;

/**
 * Created by lipan on 2017/9/28.
 * Describe: aspect 切面
 */
public aspect AccessLogAdviceNew {

    pointcut printBeginLog():execution(* com.example.aop.aspectJ.HelloWelcomeImpl.*(..));

    before(): printBeginLog(){
        System.out.println("AccessLogAdviceNew：begin invoke method");
    }

    Object around():printAroundLog(){
        System.out.println("AccessLogAdviceNew：begin invoke method");
        Object result = proceed();
        System.out.println("AccessLogAdviceNew：begin invoke method");
    }

    after()returning:afterReturning(){

    }

    after()throwing:afterThrowing(ExceptionType type){
        System.out.println();
    }

}
