package org.freeman.example;

import org.freeman.aspectj.example.HelloWorldAspect;
import org.junit.Test;

/**
 * Created by freeman on 2016/5/3.
 */
public class HelloWorldTest {
    /**
     * @see org.freeman.example.HelloWorld
     * @see HelloWorldAspect
     */
    @Test
    public void testHello() {
        new HelloWorld().hello();
    }
}
