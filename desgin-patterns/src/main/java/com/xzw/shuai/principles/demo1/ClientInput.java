package com.xzw.shuai.principles.demo1;

/**
 * @author DELL
 * test
 */
public class ClientInput {
    public static void main(String[] args) {

        // 创建输入法对象
        SouGouInput souGouInput = new SouGouInput();
        // 创建皮肤对象
        DefaultSkin defaultSkin = new DefaultSkin();
        // 设置皮肤到属性中
        souGouInput.setAs(defaultSkin);


        XzwShuaiSkin xzwShuaiSkin = new XzwShuaiSkin();
        souGouInput.setAs(xzwShuaiSkin);

        // 显示皮肤
        souGouInput.display();
    }
}
