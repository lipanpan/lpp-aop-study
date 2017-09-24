package com.example.aop.cglib.core;

import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lipan on 2017/9/24.
 * Describe: 切面上下文
 */
public class AdviceContext {

    // 目标对象
    private Object target = null;

    // 方法
    private Method method = null;

    // 方法参数
    private Object[] args = null;

    // 代理方法
    private MethodProxy methodProxy = null;

    // 附加属性
    private Map<String, Object> dataMap = new HashMap<String, Object>();

    public Object getTarget() {
        return target;
    }

    public AdviceContext setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Method getMethod() {
        return method;
    }

    public AdviceContext setMethod(Method method) {
        this.method = method;
        return this;
    }

    public Object[] getArgs() {
        return args;
    }

    public AdviceContext setArgs(Object[] args) {
        this.args = args;
        return this;
    }

    public MethodProxy getMethodProxy() {
        return methodProxy;
    }

    public AdviceContext setMethodProxy(MethodProxy methodProxy) {
        this.methodProxy = methodProxy;
        return this;
    }

    public void setAttribute(String key, Object value) {
        dataMap.put(key, value);
    }

    public Object getAttribute(String key) {
        return dataMap.get(key);
    }

}
