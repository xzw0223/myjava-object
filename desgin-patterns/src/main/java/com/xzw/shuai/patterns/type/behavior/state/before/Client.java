package com.xzw.shuai.patterns.type.behavior.state.before;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {


        ILift lift = new Lift();

        lift.setState( ILift.RUNNING_STATE);
        lift.open();
        lift.close();

        lift.run();

        lift.stop();

    }
}
