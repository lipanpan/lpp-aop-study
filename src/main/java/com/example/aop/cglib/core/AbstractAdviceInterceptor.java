package com.example.aop.cglib.core;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lipan on 2017/9/24.
 * Describe: 抽象横切面
 */
public abstract class AbstractAdviceInterceptor implements AdviceMethod, MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws
            Throwable {
        AdviceContext context = new AdviceContext();
        context.setTarget(o).setMethod(method).setArgs(objects).setMethodProxy(methodProxy);
        before(context);
        Object result;
        try {
            around(context);
            result = methodProxy.invokeSuper(o, objects);
            around(context);
        } catch (Exception e) {
            handleException(context, e);
            throw e;
        } finally {
            after(context);
        }
        return result;
    }

    @Override
    public void before(AdviceContext context) {
    }

    @Override
    public void around(AdviceContext context) {
    }

    @Override
    public void after(AdviceContext context) {
    }

    @Override
    public void handleException(AdviceContext context, Exception e) {
    }

}
