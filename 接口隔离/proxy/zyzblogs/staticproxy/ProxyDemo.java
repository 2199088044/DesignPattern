package cn.dada.接口隔离.proxy.zyzblogs.staticproxy;

/**
 * 代理角色：同真实角色实现同一个接口
 */
public class ProxyDemo implements Rent
{
    private Host host;

    public ProxyDemo()
    {
    }

    public ProxyDemo(Host host)
    {
        this.host = host;
    }

    public void setHost(Host host)
    {
        this.host = host;
    }

    public void rent()
    {
        seeHouse();
        host.rent();
        fee();
    }


    //代理角色附带（增强）的一些功能
    private void seeHouse()
    {
        System.out.println("带租客看房子");
    }

    private void fee()
    {
        System.out.println("收取中介费");
    }
}