package com.xzw.shuai.patterns.type.behavior.memento.white_box;

/**
 * @author DELL
 * 游戏角色  -- 发起人角色
 */
public class GameRole {
    /**
     * 生命力
     */
    private int vit;
    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;


    /**
     * 初始化内部状态的功能
     */
    public void initState() {
        vit = 100;
        atk = 100;
        def = 100;
    }

    /**
     * 战斗的方法
     */
    public void fight() {
        vit = 0;
        atk = 0;
        def = 0;
    }

    /**
     * 保存角色状态功能
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }
    public void stateDisplay(){
        System.out.println("生命力 = " + vit);
        System.out.println("攻击力 = " + atk);
        System.out.println("防御力 = " + def);
    }
    /**
     * 恢复角色状态
     */
    public void recoverState(RoleStateMemento roleStateMemento) {
        // 将备忘录的状态复制给当前对象
        atk = roleStateMemento.getAtk();
        vit = roleStateMemento.getVit();
        def = roleStateMemento.getDef();
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
