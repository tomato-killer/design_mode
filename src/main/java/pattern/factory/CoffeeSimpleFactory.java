package pattern.factory;

public class CoffeeSimpleFactory {

    public static Coffee createCoffee(String type) {

        Coffee coffee = null;

        if ("american".equals(type)) {
            coffee = new AmericaCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("这种咖啡不会做");
        }
        coffee.getName();
        coffee.addMilk();
        return coffee;
    }
}
