package com.xzw.shuai.patterns.type.behavior.responsbility;

/**
 * @author DELL
 * 抽象处理者
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;



    /**
     * 领导处理天数区间
     */
    private int numStart;
    private int numEnd;

    /**
     * 声明上级领导 -- 后继者
     */

    private Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    /**
     * 设置上级
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


    /**
     * 各级领导处理的方法
     *
     * @param leaveRequest ..
     */
    protected abstract void handlerLeave(LeaveRequest leaveRequest);

    public final void submit(LeaveRequest leaveRequest) {
        // 该领导审批
        this.handlerLeave(leaveRequest);
        // 如果有上级领导, 并且请假天数大于该领导最大请假天数
        if(this.nextHandler!=null&& leaveRequest.getNumDay()>this.numEnd){
            // 提交该上级处理
            this.nextHandler.submit(leaveRequest);
        }else {
            System.out.println("流程结束 ! ");
        }
    }
}
