package pattern.state;

public class ClosingState extends LiftState{
    @Override
    public void open() {
        context.setLiftState(Context.OPENING_STATE);
        context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯正在关闭...");
    }

    @Override
    public void run() {
        context.setLiftState(Context.RUNNING_STATE);
        context.getLiftState().run();
    }

    @Override
    public void stop() {
        context.setLiftState(Context.STOPPING_STATE);
        context.getLiftState().stop();
    }
}
