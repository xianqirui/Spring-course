package org.example.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

//表示当前类是切面类
//来增加业务功能
@Aspect
public class MyAspect {
@AfterThrowing(value = "execution( * *..SomeSerciceImpl.Throwing(String ,Integer ))",throwing ="ex")
   public void AfterThrowing(Throwable ex){
    System.out.println("异常通知"+ex.getMessage());
}



}
