package org.freeman.example;

/**
 * Created by freeman on 2016/5/3.
 *
 execution(public *.*(..))　　所有的public方法。
 execution(* hello(..))            所有的hello()方法
 execution(String hello(..))   所有返回值为String的hello方法。
 execution(* hello(String))  　　所有参数为String类型的hello()
 execution(* hello(String..))      至少有一个参数，且第一个参数类型为String的hello方法
 execution(* com.aspect..*(..))  　所有com.aspect包，以及子孙包下的所有方法
 execution(* com..*.*Dao.find*(..))　　com包下的所有一Dao结尾的类的一find开头的方法
 */
public class HelloWorld {

    public void hello() {

    }
}
