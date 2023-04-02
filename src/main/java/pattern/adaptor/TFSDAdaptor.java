package pattern.adaptor;

public class TFSDAdaptor extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("read tf card with adaptor");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("write tf card with adaptor");
        writeTF(msg);
    }
}
