package pattern.mediator;

public class Client {

    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();

        Tenant tenant = new Tenant("zhangsan", mediator);

        HouseOwner houseOwner = new HouseOwner("lisi", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("我要租房");

        houseOwner.constact("我这有房");
    }
}
