package pattern.order;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command{

    //持有命令的接受者
    private Cook cook;
    private Order order;

    public OrderCommand(Cook cook, Order order) {
        this.cook = cook;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getRestTabNum() + "桌的订单");
        Map<String, Integer> foodDir = order.getFoodDir();

        Set<String> keySet = foodDir.keySet();
        for (String foodName : keySet) {
            cook.cookFood(foodName, foodDir.get(foodName));
        }
        System.out.println(order.getRestTabNum() + "桌的订单已完成");
    }
}
