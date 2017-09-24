package com.example.aop.jdk;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lipan on 2017/9/23.
 * Describe: 利用JDK ProxyGenerator自动生成字节码class文件
 * public final class proxy$0 extends Proxy
 * implements IHelloWorld, IWelcomeWorld
 * {
 * ......
 * }
 * 由于java是单继承的，自动生成的代理类需要继承自Proxy，
 * JDK的动态代理只能针对接口，而无法针对class类进行动态代理的原因
 */
public class ProxyGeneratorDemo {

    public static void main(String[] args) throws IOException {
        String name = "proxy$0";
        byte[] classBytes = ProxyGenerator.generateProxyClass(name, new Class<?>[]{IHelloWorld.class,
                IWelcomeWorld.class});
        File file = new File("C:\\Users\\lipanpan\\Desktop\\" + name + ".class");
        if(!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream out = new FileOutputStream(file);
        out.write(classBytes, 0, classBytes.length);
        out.flush();
        out.close();
    }
}
