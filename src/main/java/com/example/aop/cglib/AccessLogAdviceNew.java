package com.example.aop.cglib;

import com.example.aop.cglib.core.AbstractAdviceInterceptor;
import com.example.aop.cglib.core.AdviceContext;

/**
 * Created by lipan on 2017/9/24.
 * Describe:
 */
public class AccessLogAdviceNew extends AbstractAdviceInterceptor {

    @Override
    public void before(AdviceContext context) {
        System.out.println("AccessLogAdviceNew：begin invoke method:" + context.getMethod().getName());
        context.setAttribute("beginTime", System.currentTimeMillis());
    }

    @Override
    public void around(AdviceContext context) {
    }

    @Override
    public void after(AdviceContext context) {
        long beginTime = Long.parseLong(context.getAttribute("beginTime").toString());
        System.out.println("AccessLogAdviceNew：end invoke method:" + context.getMethod().getName() + "| " +
                "time=" + (System.currentTimeMillis() - beginTime) / 1000.0);
    }

    @Override
    public void handleException(AdviceContext context, Exception e) {
        System.out.println("AccessLogAdviceNew: invoke error. msg=" + e.getMessage());
    }

}
