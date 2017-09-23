package com.example.aop.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lipan on 2017/9/24.
 * Describe: 基于CGLIB的访问日志横切面
 */
public class AccessLogAdvice implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws
            Throwable {
        System.out.println("AccessLogAdvice：begin invoke method:" + method.getName());
        long beginTime = System.currentTimeMillis();
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("AccessLogAdvice：end invoke method:" + method.getName() + "| time=" + (System
                .currentTimeMillis() - beginTime) / 1000.0);
        return result;
    }

}
