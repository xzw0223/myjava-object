package com.xzw.shuai.principles.demo5;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setCompany(new Company("百科"));
        agent.setFans(new Fans("李克"));
        agent.setStar(new Star("王老五"));

        agent.meeting();

        agent.business();
    }
}
