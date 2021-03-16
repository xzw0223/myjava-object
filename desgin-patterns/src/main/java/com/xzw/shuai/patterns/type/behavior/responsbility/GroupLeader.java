package com.xzw.shuai.patterns.type.behavior.responsbility;

/**
 * @author DELL
 * 小组长
 */
public class GroupLeader extends Handler {

    public GroupLeader(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNumDay() +
                "天," + leaveRequest.getContent() + ".");
        System.out.println("小组长审批,同意");
    }
}
