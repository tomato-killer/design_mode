package pattern.interpreter;

public class Variable extends AbstractExpression{

    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }
}
