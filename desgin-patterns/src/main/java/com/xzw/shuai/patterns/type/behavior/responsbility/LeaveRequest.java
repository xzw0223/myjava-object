package com.xzw.shuai.patterns.type.behavior.responsbility;

/**
 * @author DELL
 * 请假条
 */
public class LeaveRequest {

    private String name;
    /**
     * 请假天数
     */
    private int numDay;
    /**
     * 请假内容
     */
    private String content;

    public LeaveRequest(String name, int numDay, String content) {
        this.name = name;
        this.numDay = numDay;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumDay() {
        return numDay;
    }

    public void setNumDay(int numDay) {
        this.numDay = numDay;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
