package com.fly.design.pattern.behavioral.chainOfResposibility.demo01;

/**
 * Created by fengxuguang on 2024/12/24 17:24
 */
public class Client {

    public static void main(String[] args) {
        ReimbursementHandler manager = new ManagerHandler();
        ReimbursementHandler departmentHead = new DepartmentHeadHandler();
        ReimbursementHandler finance = new FinanceHandler();

        manager.setSuccessor(departmentHead);
        departmentHead.setSuccessor(finance);

        ReimbursementRequest request1 = new ReimbursementRequest(900, "购买办公用品");
        ReimbursementRequest request2 = new ReimbursementRequest(2888, "参加培训");
        ReimbursementRequest request3 = new ReimbursementRequest(9999, "举办团建活动");

        manager.handlerRequest(request1);
        manager.handlerRequest(request2);
        manager.handlerRequest(request3);
    }

}
