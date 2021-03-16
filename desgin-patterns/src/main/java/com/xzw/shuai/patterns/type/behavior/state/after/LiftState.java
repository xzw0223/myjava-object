package com.xzw.shuai.patterns.type.behavior.state.after;

/**
 * @author DELL
 * 抽象状态类
 */
public abstract class LiftState {
    /**
     * 声明环境角色变量
     */

    protected Context context;


    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯的操作
     */

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
