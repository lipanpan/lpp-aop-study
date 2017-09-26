package com.example.aop.javassist.core;

import javassist.util.proxy.MethodHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lipan on 2017/9/24.
 * Describe: 抽象横切面
 */
public abstract class AbstractAdviceHandler implements AdviceMethod, MethodHandler {

    @Override
    public Object invoke(Object var1, Method var2, Method var3, Object[] var4) throws Throwable {
        AdviceContext context = new AdviceContext();
        context.setTarget(var1).setMethod(var2).setArgs(var4).setMethodProxy(var3);
        before(context);
        Object result;
        try {
            around(context);
            result = var3.invoke(var1, var4);
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
