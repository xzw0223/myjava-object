package com.xzw.shuai.patterns.type.behavior.memento.black_box;

import com.xzw.shuai.patterns.type.behavior.memento.white_box.RoleStateMemento;

/**
 * @author DELL
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    /**
     * 声明RoleStateMemento对象
     */
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
