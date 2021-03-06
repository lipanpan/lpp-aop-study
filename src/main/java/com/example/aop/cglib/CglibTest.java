package com.example.aop.cglib;

/**
 * Created by lipan on 2017/9/24.
 * Describe: CGLIB测试用例
 */
public class CglibTest {

    public static void main(String[] args) {
        HelloWelcomeImpl proxyObj = CglibProxyFactory.getProxy(HelloWelcomeImpl.class, new AccessLogAdvice());
        proxyObj.hello("lipan");
        proxyObj.welcome("lipan");

        HelloWelcomeImpl proxyObjNew = CglibProxyFactory.getProxy(HelloWelcomeImpl.class, new
                AccessLogAdviceNew());
        proxyObjNew.hello("lipan");
        proxyObjNew.welcome("lipan");

    }

}
