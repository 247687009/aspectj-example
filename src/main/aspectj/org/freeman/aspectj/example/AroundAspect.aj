package org.freeman.aspectj.example;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by freeman on 2016/5/3.
 */
public aspect AroundAspect {

    private ConcurrentHashMap<String, Object> hashMap = new ConcurrentHashMap<>(100);
    pointcut cache():execution(* find(..));

    Object around(): cache(){
        if (hashMap.containsKey(String.valueOf(thisJoinPoint.getArgs()[0]))) {
            return "我是缓存返回的结果";
        }
        System.out.println(thisJoinPoint.getTarget());
        System.out.println(thisJoinPoint.getThis());
        Object proceed = proceed();
        hashMap.put(String.valueOf(thisJoinPoint.getArgs()[0]), proceed);
        return proceed;
    }

}
