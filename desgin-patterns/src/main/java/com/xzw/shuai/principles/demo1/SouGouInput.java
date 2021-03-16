package com.xzw.shuai.principles.demo1;

/**
 * sg 输入法
 * @author DELL
 */
public class SouGouInput {

    private  AbstractSkin as;

    public void setAs(AbstractSkin as) {
        this.as = as;
    }
    public void display(){
        as.display();
    }

}
