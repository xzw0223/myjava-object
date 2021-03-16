package com.xzw.shuai.patterns.type.create.prototype.demo1;

/**
 * @author DELL
 */
public class RealizeType  implements Cloneable {
    public RealizeType(){
        System.out.println("构造方法调用成功");
    }
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("复制成功");
        return (RealizeType) super.clone();

    }

}
