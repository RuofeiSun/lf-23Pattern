/**
 * @Author: srf
 * @Date: 2023/12/27 9:34
 * @description:
 */
public class InterpreterPatternDemo {

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John是男性吗? " + isMale.interpret("John"));
        System.out.println("Julie是已婚女性吗? " + isMarriedWoman.interpret("Married Julie"));
    }

}
