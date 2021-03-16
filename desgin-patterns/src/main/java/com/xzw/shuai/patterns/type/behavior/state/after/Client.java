package com.xzw.shuai.patterns.type.behavior.state.after;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        // 创建环境对象
        Context context = new Context();

        // 设置当前电梯状态
        context.setLiftState(new OutageState());
        context.run();


        context.open();
        context.stop();

        context.close();



    }
}
