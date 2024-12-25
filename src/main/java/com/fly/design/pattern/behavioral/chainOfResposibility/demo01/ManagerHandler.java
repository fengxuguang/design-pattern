package com.fly.design.pattern.behavioral.chainOfResposibility.demo01;

/**
 * Created by fengxuguang on 2024/12/24 17:16
 */
public class ManagerHandler extends ReimbursementHandler {
    @Override
    public void handlerRequest(ReimbursementRequest reimbursementRequest) {
        if (reimbursementRequest.getAmount() <= 1000) {
            System.out.println("经理处理报销请求: " + reimbursementRequest.getDescription());
        } else {
            successor.handlerRequest(reimbursementRequest);
        }
    }
}
