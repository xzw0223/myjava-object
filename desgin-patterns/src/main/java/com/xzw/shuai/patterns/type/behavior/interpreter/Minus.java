package com.xzw.shuai.patterns.type.behavior.interpreter;

/**
 * @author DELL
 * 减法表达式
 */
public class Minus extends AbstractExpression {
    /**
     * - 左边的表达式
     */
    private AbstractExpression left;
    /**
     * - 右边的表达式
     */
    private AbstractExpression right;

    @Override
    public int interpret(Context context) {
        // 将左边表达式结果进行相加
        int i = left.interpret(context) - right.interpret(context);
        System.out.println(
                this.getClass().getSimpleName()+
                "结果 = " + left.toString() +" " + right.toString() +"  = " + i
        );
        return i;
    }

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "("+left.toString()+"-"+right.toString()+")" ;
    }
}
