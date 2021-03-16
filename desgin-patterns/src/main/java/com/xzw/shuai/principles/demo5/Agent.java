package com.xzw.shuai.principles.demo5;

/**
 * @author DELL
 * 经纪人
 */
public class Agent {

    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * 和粉丝见面的方法
     */
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }

    /**
     * 和公司洽淡的方法
     */
    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "公司洽谈");
    }

}
