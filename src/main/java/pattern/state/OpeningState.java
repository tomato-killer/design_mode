package pattern.state;

public class OpeningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯正在打开...");
    }

    @Override
    public void close() {
        context.setLiftState(Context.CLOSING_STATE);
        context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
