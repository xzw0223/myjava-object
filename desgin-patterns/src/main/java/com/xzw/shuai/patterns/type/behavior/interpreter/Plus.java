package com.xzw.shuai.patterns.type.behavior.interpreter;

/**
 * @author DELL
 * 加法表达式类
 */
public class Plus extends AbstractExpression{
    /**
     * 加号左边的表达式
     */
    private AbstractExpression left;
    /**
     * 加号右边的表达式
     */
    private AbstractExpression right;

    @Override
    public int interpret(Context context) {
        // 将左边表达式结果进行相加
        int i = left.interpret(context) + right.interpret(context);
        System.out.println(
                this.getClass().getSimpleName()+
                "结果 = " + left.toString() +" " + right.toString() +"  = " + i
        );
        return i;
    }

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "("+left.toString()+"+"+right.toString()+")" ;
    }
}
