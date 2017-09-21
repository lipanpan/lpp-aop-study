# lpp-aop-study
AOP面向切面编程，是对OOP面向对象编程的一种补充，将非核心业务逻辑（例如：日志埋点，性能监控，安全校验等）编织成独立可复用的切面，与核心业务逻辑进行分离，减少对核心业务逻辑代码的侵入性。

# AOP编程常用框架
1. Spring AOP
   
   1.1. JDK 动态代理：仅能够对接口进行动态代理
   
   1.2. 利用字节码增强工具包cglib，可代理除final，static方法等之外的类
   
   Spring AOP是通过动态生成一个继承自原始类的类，增强其内部方法。属于动态织入。

2. AspectJ
  
   AspectJ 也是一个面向切面编程框架，但是它与Spring AOP的不同之处在于，它是在编译时，在类的指定切入点织入切面逻辑。就类似于我们在java中经常使用
   互斥锁synchronized关键字，在javac编译器时，会在使用该关键字的地方织入锁控制相关逻辑原理一样。所以，当我们使用AspectJ AOP框架时，要引入其指定的jar包，里面包含了AspectJ一些关于AOP特殊的关键字，那么，在编译解析这些关键字时，就必须使用AspectJ提供的编译器（扩展至javac编译器），对我们的工程源码进行编译。属于静态织入。
   
3. 常见字节码增强工具包
   
   3.1. javassist
   
   3.2. cglib
   
4. 参考链接

   4.1. https://www.mkyong.com/spring3/spring-aop-aspectj-annotation-example/
  

