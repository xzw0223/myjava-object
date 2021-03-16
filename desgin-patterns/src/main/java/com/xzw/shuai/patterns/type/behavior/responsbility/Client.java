package com.xzw.shuai.patterns.type.behavior.responsbility;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        // 创建请假条
        LeaveRequest leave = new LeaveRequest("张三", 3, "不想上班");

        // 创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        // 设置处理着链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 提交请假
        groupLeader.submit(leave);
    }
}
