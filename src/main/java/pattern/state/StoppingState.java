package pattern.state;

public class StoppingState extends LiftState{
    @Override
    public void open() {
        context.setLiftState(Context.OPENING_STATE);
        context.getLiftState().open();
    }

    @Override
    public void close() {
        context.setLiftState(Context.CLOSING_STATE);
        context.getLiftState().close();
    }

    @Override
    public void run() {
        context.setLiftState(Context.RUNNING_STATE);
        context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯正在停止...");
    }
}
