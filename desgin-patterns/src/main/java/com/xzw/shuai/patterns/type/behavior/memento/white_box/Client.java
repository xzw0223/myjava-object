package com.xzw.shuai.patterns.type.behavior.memento.white_box;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("before ------------------");
        // 创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();


        // 对数据进行备份
        // 创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("after -------------------");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("recover -----------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();







    }
}
