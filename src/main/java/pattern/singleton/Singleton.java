package pattern.singleton;


public class Singleton {

    private static boolean flag = false;

    // 防止反射破坏单例模式
    private Singleton() {
        synchronized (Singleton.class) {
            if (flag)
                throw new RuntimeException("只能初始化一次");
            flag = true;
        }
    }

    private static Singleton instance;

    /**
     * 懒汉式,双重检查锁
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {

                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    /**
     * 懒汉式，静态内部类，JVM在加载外部类时不会加载静态内部类，只有内部类的属性和方法被调用时才会被加载
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInnerInstance() {
        return SingletonHolder.INSTANCE;
    }


    // 防止序列化破坏单例模式，在反序列化调用readObject方法时会调用该方法返回对象
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }

}
