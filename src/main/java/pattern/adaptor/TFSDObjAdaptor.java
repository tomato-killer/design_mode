package pattern.adaptor;

public class TFSDObjAdaptor implements SDCard {

    private TFCard tfCard;

    public TFSDObjAdaptor(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("read tf card with obj_adaptor");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("write tf card with obj_adaptor");
        tfCard.writeTF(msg);
    }
}
