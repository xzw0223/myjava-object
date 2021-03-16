package com.xzw.shuai.patterns.type.behavior.mediator;

/**
 * @author DELL
 * 具体中介者
 */
public class MediatorStructure extends Mediator {
    /**
     * 聚合房主
     */
    private HoseOwner hoseOwner;
    /**
     * 聚合租房者
     */
    private Tenant tenant;

    public HoseOwner getHoseOwner() {
        return hoseOwner;
    }

    public void setHoseOwner(HoseOwner hoseOwner) {
        this.hoseOwner = hoseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if (person == hoseOwner) {
            tenant.getMessage(message);
        }
        if (person == tenant) {
            hoseOwner.getMessage(message);
        }
    }

}
