package pattern.adaptor;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "TFCard event: read msg ...... hello";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard event: write msg ...... write 'world'");
    }
}
