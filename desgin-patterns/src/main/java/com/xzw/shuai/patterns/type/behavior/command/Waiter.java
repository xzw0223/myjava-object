package com.xzw.shuai.patterns.type.behavior.command;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author DELL
 * 服务员  请求者角色
 */
public class Waiter {
    /**
     * 持有多个命令
     */

    private List<Command> commands = new ArrayList<>();

    /**
     *  设置命令对象
     */
    public void setCommand(Command command) {
        commands.add(command);
    }

    /**
     * 发起命令的方法
     */
    public void orderUp(){
        System.out.println("服务员: 大哥 新订单来了呢");
        // 遍历list
        commands.forEach(command -> {
            if(command!=null){
                command.execute();
            }
        });
    }
}
