package pattern.responsibility;

public class GeneralManager extends Handler{

    public GeneralManager() {
        super(Handler.THREE, Handler.SERVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天，" + request.getContent() + ".");
        System.out.println("总经理审批：同意");
    }
}
