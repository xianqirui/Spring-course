package org.example.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

//表示当前类是切面类
//来增加业务功能
@Aspect
public class MyAspect {
    //定义方法，实现切面功能
    /*方法定义要求：
    * 1.公共类
    * 2.没返回值
    * 3.自定义方法名*/
    //@Before():前置通知注解
    //属性：value
   /* @Before(value = "execution(public void org.example.ba01.SomeSerciceImpl.doSome(String ,Integer ))")
    public void myBefore(){
        System.out.println("前置通知，时间:"+new Date());
    }*/
   /* @Before(value = "execution( void org.example.ba01.SomeSerciceImpl.doSome(String ,Integer ))")
    public void myBefore(){
        System.out.println("前置通知，时间:"+new Date());
    }*/
    //JoinPoint:业务方法
           // 可以在通知方法中获取方法执行的信息
   @AfterReturning(value = "execution( void *..SomeSerciceImpl.doSome(String ,Integer ))")
    public void myBefore(JoinPoint js){
       //获取方法的完整定义
       System.out.println(js.getSignature());
       //获取连接点的参数个数
       System.out.println(js.getArgs());
       //方法参数信息
       Object[] args = js.getArgs();
       for (Object arg:args){
           System.out.println(arg);
       }
       System.out.println("前置通知，时间:"+new Date());
    }

    /*@Before(value = "execution(void doSome(String ,Integer ))")
    public void myBefore(){
        System.out.println("前置通知，时间:"+new Date());
    }*/
}
