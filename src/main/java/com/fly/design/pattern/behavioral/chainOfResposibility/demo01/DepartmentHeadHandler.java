package com.fly.design.pattern.behavioral.chainOfResposibility.demo01;

/**
 * Created by fengxuguang on 2024/12/24 17:22
 */
public class DepartmentHeadHandler extends ReimbursementHandler {
    @Override
    public void handlerRequest(ReimbursementRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("部门主管处理报销请求: " + request.getDescription());
        } else {
            successor.handlerRequest(request);
        }
    }
}
