package pattern.proxy;

import pattern.proxy.jdk_proxy.ProxyFactory;

public class Client {

    public static void main(String[] args) {

        //静态代理方法
        ProxyStation static_proxy = new ProxyStation();
        printTicket(static_proxy);

        //jdk动态代理方法
        ProxyFactory jdk_factory = new ProxyFactory();
        SellTicketProxy jdk_proxy = jdk_factory.getProxyObject();
        printTicket(jdk_proxy);

        pattern.proxy.cglib_proxy.ProxyFactory cglib_factory = new pattern.proxy.cglib_proxy.ProxyFactory();
        SellTicketProxy cglib_proxy = cglib_factory.getProxyObject();
        printTicket(cglib_proxy);
    }


    private static void printTicket(SellTicketProxy proxy){
        String ticket = proxy.sell();
        System.out.println(ticket);
//        String ticket0 = proxy.sell0();
//        System.out.println(ticket0);
    }
}
