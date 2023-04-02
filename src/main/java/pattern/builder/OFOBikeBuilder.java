package pattern.builder;

public class OFOBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("塑料车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
