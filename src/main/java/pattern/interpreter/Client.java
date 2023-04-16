package pattern.interpreter;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        AbstractExpression expression = new Minus(a, new Plus(new Minus(b, c), d));

        int result = expression.interpret(context);
        System.out.println(expression + " = " + result);
    }
}
