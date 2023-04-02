package pattern.adaptor;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SDCard event: read msg ...... hello";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard event: write msg ...... write 'world'");
    }
}
