package pattern.combination;

public class Client {

    public static void main(String[] args) {

        Menu menuManagement = new Menu("菜单管理", 2);
        menuManagement.add(new MenuItem("页面访问", 3));
        menuManagement.add(new MenuItem("展开菜单", 3));
        menuManagement.add(new MenuItem("编辑菜单", 3));
        menuManagement.add(new MenuItem("删除菜单", 3));
        menuManagement.add(new MenuItem("新增菜单", 3));
        Menu privilegeManagement = new Menu("权限管理", 2);
        privilegeManagement.add(new MenuItem("页面访问", 3));
        privilegeManagement.add(new MenuItem("提交保存", 3));
        Menu roleManagement = new Menu("角色管理", 2);
        roleManagement.add(new MenuItem("页面访问" ,3));
        roleManagement.add(new MenuItem("新增角色" ,3));
        roleManagement.add(new MenuItem("修改角色" ,3));

        Menu sysManagement = new Menu("系统管理", 1);

        sysManagement.add(menuManagement);
        sysManagement.add(privilegeManagement);
        sysManagement.add(roleManagement);

        sysManagement.print();
    }
}
