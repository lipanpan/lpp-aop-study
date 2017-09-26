package com.example.aop.javassist;

import com.example.aop.javassist.core.AbstractAdviceHandler;
import com.example.aop.javassist.core.AdviceContext;

/**
 * Created by lipan on 2017/9/26.
 * Describe:
 */
public class AccessLogAdviceNew extends AbstractAdviceHandler {

    @Override
    public void before(AdviceContext context) {
        System.out.println("AccessLogAdviceNew：begin invoke method:" + context.getMethod().getName());
        context.setAttribute("beginTime", System.currentTimeMillis());
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
