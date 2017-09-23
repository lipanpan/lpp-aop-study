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
