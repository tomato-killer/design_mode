package pattern.proxy;

public class ProxyStation implements SellTicketProxy{

    private TrainStation station = new TrainStation();
    @Override
    public String sell() {
        System.out.println("charge agent fee");
        return station.sell();
    }

    @Override
    public String sell0() {
        System.out.println("charge agent fee");
        return station.sell0();
    }
}
