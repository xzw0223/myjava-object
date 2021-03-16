package com.xzw.shuai.patterns.type.behavior.state.after;

/**
 * @author DELL
 * 环境角色
 */
public class Context {
    /**
     * 定义对应状态的常量
     */
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static StoppingState STOPPING_STATE = new StoppingState();
    public final static OutageState OUTAGE_STATE = new OutageState();

    /**
     * 定义当前状态变量
     */
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void run() {
        liftState.run();
    }

    public void stop() {
        liftState.stop();
    }

}
