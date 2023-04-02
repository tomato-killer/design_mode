package pattern.decorator;

public class FriedNoodle extends FastFood{

    public FriedNoodle(){
        super(1, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}