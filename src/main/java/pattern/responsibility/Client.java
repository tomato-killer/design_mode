package pattern.responsibility;

public class Client {

    public static void main(String[] args) {
        LeaveRequest request1 = new LeaveRequest("zhangsan", 1, "病假");
        LeaveRequest request2 = new LeaveRequest("zhangsan", 5, "病假");

        GroupLeader groupLeader = new GroupLeader();
        DepartmentManager departmentManager = new DepartmentManager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(departmentManager);
        departmentManager.setNextHandler(generalManager);

        groupLeader.submit(request1);
        groupLeader.submit(request2);
    }
}
