package org.freeman.example;

/**
 * Created by freeman on 2016/5/3.
 * 需求 只拦截 bar里面的foo方法
 */
public class CFow {
    public void foo() {
        System.out.println("foo......");
    }

    public void bar() {
        foo();
        System.out.println("bar.........");
    }

    public void testMethod() {
        foo();
    }
}
