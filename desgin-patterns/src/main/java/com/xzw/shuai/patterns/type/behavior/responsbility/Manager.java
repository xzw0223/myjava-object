package com.xzw.shuai.patterns.type.behavior.responsbility;

/**
 * @author DELL
 * 经历
 */
public class Manager extends Handler {


    public Manager() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNumDay() +
                "天," + leaveRequest.getContent() + ".");
        System.out.println("经理审批,同意");
    }
}
