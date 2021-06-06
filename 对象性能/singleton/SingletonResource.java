package cn.dada.对象性能.singleton;

public class SingletonResource {
    private SingletonResource() {
    }

    // volatile：禁止指令重排序
    private static volatile Resource instance;

    public static Resource getInstance() {
        if (instance == null) {
            // 注意：不是Resource.class
            synchronized (SingletonResource.class) {
                if (instance == null) {
                    instance = new Resource();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Thread.currentThread().getName() + getInstance())).start();
        }
    }

    public static class Resource {
    }
}
