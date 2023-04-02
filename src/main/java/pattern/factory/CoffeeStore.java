package pattern.factory;

public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //静态工厂实现
    public Coffee orderCoffee(String type) {
        Coffee coffee = CoffeeSimpleFactory.createCoffee(type);
        coffeePrint(coffee);
        return coffee;
    }

    //工厂方法实现
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffeePrint(coffee);
        return coffee;
    }


    private void coffeePrint(Coffee coffee) {
        coffee.addMilk();
        coffee.addSugar();
    }
}