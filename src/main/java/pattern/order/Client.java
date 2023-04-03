package pattern.order;

public class Client {

    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setRestTabNum(1);
        order1.setFood("手撕包菜", 1);
        order1.setFood("可乐", 2);

        Order order2 = new Order();
        order2.setRestTabNum(2);
        order2.setFood("油焖大虾", 1);
        order2.setFood("八二年拉菲", 1);

        Cook cook = new Cook();

        OrderCommand command1 = new OrderCommand(cook, order1);
        OrderCommand command2 = new OrderCommand(cook, order2);

        Waitor waitor = new Waitor();
        waitor.setCommands(command1);
        waitor.setCommands(command2);

        waitor.orderUp();
    }
}
