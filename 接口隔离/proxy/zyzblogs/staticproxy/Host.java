package cn.dada.接口隔离.proxy.zyzblogs.staticproxy;

/**
 * 功能和描述：真实角色，实现抽象角色对应的接口（Rent）
 **/
public class Host implements Rent
{
    public void rent()
    {
        System.out.println("房屋出租");
    }
}