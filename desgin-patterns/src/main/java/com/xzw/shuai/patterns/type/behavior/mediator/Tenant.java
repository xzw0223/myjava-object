package com.xzw.shuai.patterns.type.behavior.mediator;

/**
 * @author DELL
 * 具体同事角色
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }


    /**
     * 沟通的方法 和中介联系
     */
    public void constact(String msg){
        mediator.constact(msg,this);
    }

    /**
     *  获取信息
     */

    public void getMessage(String msg){
        System.out.println("租房者"+name +",获取到的信息是:"+msg);
    }
}
