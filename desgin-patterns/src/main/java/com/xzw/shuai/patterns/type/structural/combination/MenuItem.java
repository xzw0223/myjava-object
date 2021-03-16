package com.xzw.shuai.patterns.type.structural.combination;

/**
 * @author DELL
 * 菜单项类 -- 叶子节点
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for(int i = 0; i<level; i++){
            System.out.print("  ");
        }
        System.out.println(name );
    }
}
