package org.freeman.aspectj.example;

/**
 * Created by Administrator on 2016/5/3.
 */
public aspect CfowAspect {
    pointcut bar():execution(* bar(..));
    pointcut foo():execution(* foo(..));
    //排除掉自己 不然死循环
    pointcut barCfow():cflow(bar()) && !within(CfowAspect);
    //得到bar流程foo方法
    pointcut fooInBar(): barCfow() && foo();

    before(): fooInBar(){
        System.out.println("我是被拦截的bar中的foo方法");
    }

}
