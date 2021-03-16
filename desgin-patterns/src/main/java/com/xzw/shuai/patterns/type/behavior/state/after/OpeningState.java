package com.xzw.shuai.patterns.type.behavior.state.after;

/**
 * @author DELL
 */
public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        // 调用当前状态中context中的close方法
        super.context.close();
    }

    @Override
    public void run() {
        // 不能运行 什么都不做
    }

    @Override
    public void stop() {
        // 什么都不做
    }
}
