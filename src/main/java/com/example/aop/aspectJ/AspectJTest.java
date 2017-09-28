package com.example.aop.aspectJ;

/**
 * Created by lipan on 2017/9/28.
 * Describe: aspectJ 单元测试
 */
public class AspectJTest {

    public static void main(String[] args) {
        HelloWelcomeImpl impl = new HelloWelcomeImpl();
        impl.hello("lipan");
        impl.welcome("lipan");
    }

}
