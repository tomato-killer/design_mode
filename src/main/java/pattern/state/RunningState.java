package pattern.state;

public class RunningState extends LiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    @Override
    public void stop() {
        context.setLiftState(Context.STOPPING_STATE);
        context.getLiftState().stop();
    }
}
