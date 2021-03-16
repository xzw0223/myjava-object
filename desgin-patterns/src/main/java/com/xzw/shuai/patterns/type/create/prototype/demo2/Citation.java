package com.xzw.shuai.patterns.type.create.prototype.demo2;

/**
 * @author DELL
 * 嘉奖
 */
public class Citation implements Cloneable {
    /**
     * 嘉奖人名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show (){
        System.out.println(name +"同学获得嘉奖" );

    }
}
