package pattern.responsibility;

public abstract class Handler {

    protected final static int ONE = 1;
    protected final static int THREE = 3;
    protected final static int SERVEN = 7;

    private int startDate;
    private int endDate;

    //声明后续者
    private Handler nextHandler;

    public Handler(int startDate) {
        this.startDate = startDate;
    }

    public Handler(int startDate, int endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleLeave(LeaveRequest request);

    public final void submit(LeaveRequest request){
        this.handleLeave(request);

        if (this.nextHandler != null && request.getNum() > this.endDate){
            this.nextHandler.handleLeave(request);
        }else{
            System.out.println("流程结束！");
        }
    }
}
