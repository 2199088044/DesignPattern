package cn.dada.接口隔离.proxy.zyzblogs.cglibdynamicproxy;

public class CGLibTest
{
    public static void main(String[] args)
    {
        Host host = new Host();
        RentMethodInterceptor rentMethodInterceptor = new RentMethodInterceptor();
        Host cgLibProxy = (Host) rentMethodInterceptor.getInstance(host);
        cgLibProxy.rent();
    }
}