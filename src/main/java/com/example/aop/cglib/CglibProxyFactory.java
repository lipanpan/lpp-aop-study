package com.example.aop.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by lipan on 2017/9/24.
 * Describe: CGLIB代理工厂
 */
public class CglibProxyFactory {

    /**
     * 创建代理类实例
     * @param clazz
     * @param callback
     * @return
     */
    public static Object getProxy(Class clazz, Callback callback) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz); //设者要创建子类的类
        enhancer.setCallback(callback); //设置回调的对象
        return enhancer.create(); //通过字节码技术动态创建子类实例,
    }

}
