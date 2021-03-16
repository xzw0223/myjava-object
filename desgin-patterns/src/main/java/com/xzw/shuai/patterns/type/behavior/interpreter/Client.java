package com.xzw.shuai.patterns.type.behavior.interpreter;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        // 创建环境对象
        Context context = new Context();

        // 创建多个变量

        Variable a = new Variable("a");
        context.assign(a, 1);
        Variable b = new Variable("b");
        context.assign(b, 2);
        Variable c = new Variable("c");
        context.assign(c, 3);
        Variable d = new Variable("d");
        context.assign(d, 4);
        Variable e = new Variable("e");
        context.assign(e, 5);
        Variable f = new Variable("f");
        context.assign(f, 6);

        // 获取抽象语法树  6+4-2-3
        AbstractExpression abstractExpression =
                new Plus(f,
                        new Minus(new Minus(d,b), c));

        int interpret = abstractExpression.interpret(context);
        System.out.println(interpret);
        System.out.println(abstractExpression.toString());
    }}
