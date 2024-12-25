package com.fly.design.pattern.behavioral.chainOfResposibility.demo01;

/**
 * Created by fengxuguang on 2024/12/24 17:23
 */
public class FinanceHandler extends ReimbursementHandler {
    @Override
    public void handlerRequest(ReimbursementRequest request) {
        System.out.println("财务部门处理报销请求: " + request.getDescription());
    }
}
