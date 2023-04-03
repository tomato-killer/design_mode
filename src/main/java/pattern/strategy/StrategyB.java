package pattern.strategy;

public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满200减30");
    }
}
