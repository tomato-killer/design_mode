package pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import pattern.proxy.TrainStation;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject(){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(this);
        TrainStation proxy = (TrainStation) enhancer.create();
        return proxy;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("charge agent fee(cglib proxy)");

        Object obj = method.invoke(station, objects);
        return obj;
    }
}
