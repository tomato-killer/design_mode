package pattern.proxy;

public class TrainStation implements SellTicketProxy{
    @Override
    public String sell() {
        return "this ticket was bought at the Train Station";
    }

    @Override
    public String sell0() {
        return "this ticket was bought at the Train Station ...... sell0";
    }
}
