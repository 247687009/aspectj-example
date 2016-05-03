package org.freeman.aspectj.example;

/**
 * Created by freeman on 2016/5/3.
 */
public aspect HelloWorldAspect {
    pointcut hello() : execution(void org.freeman.example.HelloWorld.hello(..));

    before(): hello(){
        System.out.println("Hello World");
    }
}
