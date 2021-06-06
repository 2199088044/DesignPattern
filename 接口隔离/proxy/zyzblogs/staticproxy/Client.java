package cn.dada.接口隔离.proxy.zyzblogs.staticproxy;

public class Client
{
    public static void main(String[] args)
    {
        //定义一个真实角色
        Host host = new Host();
        //定义代理角色
        ProxyDemo proxyDemo = new ProxyDemo(host);
        //使用代理角色的实例去实现具体操作
        proxyDemo.rent();
    }
}