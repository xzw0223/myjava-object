package com.xzw.shuai.patterns.type.behavior.memento.white_box;

/**
 * @author DELL
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    /**
     * 声明RoleStateMemento对象
     */
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
