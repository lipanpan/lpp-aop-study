package com.example.aop.javassist;

import javassist.util.proxy.MethodFilter;

import java.lang.reflect.Method;

/**
 * Created by lipan on 2017/9/25.
 * Describe: Javassist 测试用例
 */
public class JavassistTest {

    public static void main(String[] args) throws Exception {
        MethodFilter filter = new MethodFilter() {
            @Override
            public boolean isHandled(Method m) {
                // 只针对hello方法进行拦截处理
                if("hello".equals(m.getName())) {
                    return true;
                }
                return false;
            }
        };
        HelloWelcomeImpl helloWelcome = JavassistProxyFactory.getProxy(HelloWelcomeImpl.class, filter, new
                AccessLogAdviceNew());
        helloWelcome.hello("lipan");
        helloWelcome.welcome("lipan");
    }

}
