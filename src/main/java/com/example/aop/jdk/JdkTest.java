package com.example.aop.jdk;

import java.lang.reflect.Proxy;

/**
 * Created by lipan on 2017/9/23.
 * Describe: 测试类
 *
 */
public class JdkTest {

    public static void main(String[] args) {

        IHelloWorld helloWorld = (IHelloWorld) Proxy.newProxyInstance(
                JdkTest.class.getClassLoader(),
                new Class<?>[]{IHelloWorld.class, IWelcomeWorld.class},
                new AccessLogInvocationHandler(new HelloWelcomeImpl()));

        IWelcomeWorld welcomeWorld = (IWelcomeWorld) Proxy.newProxyInstance(
                JdkTest.class.getClassLoader(),
                new Class<?>[]{IHelloWorld.class, IWelcomeWorld.class},
                new AccessLogInvocationHandler(new HelloWelcomeImpl()));

        helloWorld.hello("lipan");
        welcomeWorld.welcome("lipan");

    }


}
