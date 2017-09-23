package com.example.aop.jdk;

/**
 * Created by lipan on 2017/9/23.
 * Describe: 业务接口具体实现类
 */
public class HelloWelcomeImpl implements IHelloWorld, IWelcomeWorld {

    @Override
    public void hello(String name) {
        System.out.println("hello " + name + " !");
    }

    @Override
    public void welcome(String name) {
        System.out.println("welcome " + name + " to BeiJing !");
    }

}
