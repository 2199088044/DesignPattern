package cn.dada.接口隔离.proxy.zyzblogs.cglibdynamicproxy;

//基于CGLib的动态代理是没有接口的限制的,这里不声明接口,直接给出被代理类
public class Host
{
    public void rent()
    {
        System.out.println("租房子");
    }
}