package pattern.responsibility;

public class DepartmentManager extends Handler{

    public DepartmentManager() {
        super(Handler.ONE, Handler.THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天，" + request.getContent() + ".");
        System.out.println("部门经理审批：同意");
    }
}
