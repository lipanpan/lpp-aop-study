package com.example.aop.javassist;

/**
 * Created by lipan on 2017/9/23.
 * Describe: 业务接口具体实现类
 */
public class HelloWelcomeImpl {

    public void hello(String name) {
        System.out.println("hello " + name + " !");
    }

    public void welcome(String name) {
        System.out.println("welcome " + name + " to BeiJing !");
    }

}
