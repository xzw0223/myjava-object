package com.xzw.shuai.patterns.type.structural.combination;

/**
 * @author DELL
 */
public class Client {

    public static void main(String[] args) {

        // 创建菜单树

        Menu m1 = new Menu("菜单管理", 2);
        m1.add(new MenuItem("页面访问", 3));
        m1.add(new MenuItem("展开菜单", 3));
        m1.add(new MenuItem("编辑菜单", 3));
        m1.add(new MenuItem("删除菜单", 3));
        m1.add(new MenuItem("新增菜单", 3));

        Menu m2 = new Menu("权限管理", 2);
        m2.add(new MenuItem("页面访问", 3));
        m2.add(new MenuItem("提交保存", 3));

        Menu m3 = new Menu("角色管理", 2);
        m3.add(new MenuItem("页面访问", 3));
        m3.add(new MenuItem("新增角色", 3));
        m3.add(new MenuItem("修改角色", 3));


        Menu menu = new Menu("系统关系", 1);

        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.print();


    }

}
