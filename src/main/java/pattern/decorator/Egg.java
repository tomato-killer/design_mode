package pattern.decorator;

public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }


    @Override
    public float cost() {
        return super.getPrice() + getFastFood().cost();
    }


    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
