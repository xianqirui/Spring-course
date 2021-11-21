package com.xqr.service.impl;

import com.xqr.service.SomeService;
import com.xqr.util.ServiceTool;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        //ServiceTool.dolog();
        System.out.println("执行doSome");
        //ServiceTool.d0thing();
    }

    @Override
    public void doOther() {
        System.out.println("执行doOther");
    }
}
