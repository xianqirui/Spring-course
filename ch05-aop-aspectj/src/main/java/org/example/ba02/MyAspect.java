package org.example.ba02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

//表示当前类是切面类
//来增加业务功能
@Aspect
public class MyAspect {
    //后置通知
   @AfterReturning(value = "execution(* org.example.ba02.SomeSerciceImpl.doOther(String ,Integer ))",returning = "res")
    public void AfterReturning(Object res){
       System.out.println("后置通知的返回值为："+res);
       if(res.equals("abcd")){

       }

        System.out.println("后置通知，时间:"+new Date());
    }

}
