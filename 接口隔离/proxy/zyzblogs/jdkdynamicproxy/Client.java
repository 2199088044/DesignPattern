package cn.dada.接口隔离.proxy.zyzblogs.jdkdynamicproxy;

import java.lang.reflect.Proxy;

public class Client
{
    public static void main(String[] args)
    {
        //定义一个真实对象
        Host host = new Host();

        //创建代理类对象
        RentInvocationHandler rentInvocationHandler = new RentInvocationHandler(host);

        //利用Proxy.newProxyInstance生成代理类
        //第一个参数：真实类对象的类加载器:host.getClass().getClassLoader()
        //第二个参数：真实类对象的所有的接口:host.getClass().getInterfaces()
        //第三个参数：代理类对象:rentInvocationHandler
        Rent rent = (Rent) Proxy.newProxyInstance(host.getClass().getClassLoader(),host.getClass().getInterfaces(),rentInvocationHandler);
        rent.rent();
    }
}