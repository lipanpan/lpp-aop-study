package com.example.aop.aspectJ;

/**
 * Created by lipan on 2017/9/28.
 * Describe: aspectJ 静态预编译，需要使用AJC编译器代替javac原生编译器，来处理aspect
 * ，pointcut，before，after等aspectJ关键字
 */
public class AspectJTest {

    public static void main(String[] args) {
        HelloWelcomeImpl impl = new HelloWelcomeImpl();
        impl.hello("lipan");
        impl.welcome("lipan");
    }

}
