package com.example.aop.javassist.core;

/**
 * Created by lipan on 2017/9/24.
 * Describe: 织入方法
 */
public interface AdviceMethod {

    // 在调用目标方法之前执行
    void before(AdviceContext context);

    // 在调用目标方法环绕执行
    void around(AdviceContext context);

    // 在调用目标方法之后执行
    void after(AdviceContext context);

    // 在调用目标方法出现异常时执行
    void handleException(AdviceContext context, Exception e);

}
