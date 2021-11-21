package org.example.ba03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

//表示当前类是切面类
//来增加业务功能
@Aspect
public class MyAspect {

   @Around(value = "execution( * *..SomeSerciceImpl.around(String ,Integer ))")
    public Object myAround(ProceedingJoinPoint pjd) throws Throwable {
      String name="";
      Object[] args = pjd.getArgs();
      if(args!=null&&args.length>1){
         Object arg=args[0];
         name = (String) arg;
      }
      Object obj=null;
       //增强功能
      System.out.println("环绕通知：在目标方法之前执行的，列如日志输出,时间："+new Date());

      if ("lishi".equals(name)){//控制通知
         obj=pjd.proceed();//类似jdk动态代理相当于Menth()
      }
      System.out.println("环绕通知：在目标方法之后执行的，列如处理事务");
       if(obj!=null){
          obj="hello word";
       }
      return  obj;

   }

}
