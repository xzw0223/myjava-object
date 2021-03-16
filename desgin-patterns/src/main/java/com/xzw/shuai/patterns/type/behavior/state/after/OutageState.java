package com.xzw.shuai.patterns.type.behavior.state.after;

/**
 * @author DELL
 *  断电  什么都不做
 */
public class OutageState extends LiftState {
    @Override
    public void open() {
        System.out.println("停电");
        super.context.setLiftState(Context.OUTAGE_STATE);
    }

    @Override
    public void close() {
        System.out.println("停电");
        super.context.setLiftState(Context.OUTAGE_STATE);
    }

    @Override
    public void run() {
        System.out.println("停电");
        super.context.setLiftState(Context.OUTAGE_STATE);
    }

    @Override
    public void stop() {
        System.out.println("停电");
        super.context.setLiftState(Context.OUTAGE_STATE);
    }
}
