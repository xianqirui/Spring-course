package com.xqr;

import com.xqr.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void test01(){
        String config="applocationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //从容器中获取service
        BuyGoodsService buyGoodsService = (BuyGoodsService) ac.getBean("BuyGoodsService");
        buyGoodsService.buy(1001,200);
    }
}
