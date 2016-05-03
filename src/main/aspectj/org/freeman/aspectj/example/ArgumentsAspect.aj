package org.freeman.aspectj.example;

import org.aspectj.lang.JoinPoint;

/**
 * Created by freeman on 2016/5/3.
 */
public aspect ArgumentsAspect {
    pointcut arguments(String name) : execution(void org.freeman.example.Arguments.arguments(java.lang.String)) && args(name);

    before(String name ): arguments(name){
        System.out.println("Hello World" + name);
    }
}
