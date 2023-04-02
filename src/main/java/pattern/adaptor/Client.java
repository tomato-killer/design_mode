package pattern.adaptor;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();

        printAdaptor(computer.readSD(sdCard));
        //类适配器模式，不符合合成复用原则
        printAdaptor(computer.readSD(new TFSDAdaptor()));
        //对象适配器
        printAdaptor(computer.readSD(new TFSDObjAdaptor(new TFCardImpl())));

    }


    private static void printAdaptor(String msg){
        System.out.println(msg);
        System.out.println("==================================");
    }
}
