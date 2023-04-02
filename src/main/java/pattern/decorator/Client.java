package pattern.decorator;

public class Client {

    public static void main(String[] args) {
        FriedRice friedRice = new FriedRice();
        printDecorator(friedRice);

        Egg egg = new Egg(friedRice);
        egg.setPrice(5);
        printDecorator(egg);
        Egg egg2 = new Egg(egg);
        printDecorator(egg2);
    }

    private static void printDecorator(FastFood food){
        System.out.println(food.getDesc() + "_" + food.cost() + "元");
        System.out.println("==================================");
    }
}
