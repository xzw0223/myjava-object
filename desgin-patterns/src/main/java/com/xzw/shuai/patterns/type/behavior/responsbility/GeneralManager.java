package com.xzw.shuai.patterns.type.behavior.responsbility;

/**
 * @author DELL
 * 总经理
 */
public class GeneralManager extends Handler {


    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNumDay() +
                "天," + leaveRequest.getContent() + ".");
        System.out.println("总经理审批,同意");
    }
}
