package pattern.proxy.jdk_proxy;

import pattern.proxy.SellTicketProxy;
import pattern.proxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTicketProxy getProxyObject(){
        SellTicketProxy proxy = (SellTicketProxy) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("charge agent fee(jdk proxy)");
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
        return proxy;
    }
}
