package com.example.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lipan on 2017/9/23.
 * Describe: 访问日志切面逻辑
 */
public class AccessLogInvocationHandler implements InvocationHandler {

    // 代理的目标对象
    private Object target = null;

    public AccessLogInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("AccessLogInvocationHandler：begin invoke method:" + method.getName());
        long beginTime = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        System.out.println("AccessLogInvocationHandler：end invoke method:" + method.getName() + "| time=" +
                (System.currentTimeMillis() - beginTime) / 1000.0);
        return result;
    }

}
