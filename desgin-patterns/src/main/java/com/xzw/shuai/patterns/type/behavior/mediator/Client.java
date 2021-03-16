package com.xzw.shuai.patterns.type.behavior.mediator;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediatorStructure mediator = new MediatorStructure();

        // 创建同事
        Tenant tenant = new Tenant("张三", mediator);
        HoseOwner hoseOwner = new HoseOwner("李四", mediator);


        mediator.setHoseOwner(hoseOwner);
        mediator.setTenant(tenant);

        tenant.constact("im张三,我想租房");
        hoseOwner.constact("im李四,这里有房子要出租");


    }
}
