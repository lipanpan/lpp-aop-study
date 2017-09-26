package com.example.aop.javassist;

import javassist.util.proxy.MethodFilter;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

/**
 * Created by lipan on 2017/9/24.
 * Describe: Javassist代理工厂
 * 参考链接：
 * https://www.ibm.com/developerworks/cn/java/j-dyn0916/
 * http://yonglin4605.iteye.com/blog/1396494
 */
public final class JavassistProxyFactory {

    /**
     * 泛型方法：获取javassist代理
     * @param clazz
     * @param filter
     * @param handler
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T getProxy(Class clazz, MethodFilter filter, MethodHandler handler) throws Exception {
        ProxyFactory factory = new ProxyFactory();
        //设置父类，ProxyFactory将会动态生成一个类，继承该父类
        factory.setSuperclass(clazz);
        //设置过滤器，判断哪些方法调用需要被拦截
        if(filter != null) {
            factory.setFilter(filter);
        }
        factory.setHandler(handler);
        Class<?> c = factory.createClass();
        return (T) c.newInstance();
    }

}
