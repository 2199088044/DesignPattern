package cn.dada.接口隔离.proxy.liyunfeng17.jdkproxy;

public class IndexImpl implements IndexDao
{
    @Override
    public void selectByKey()
    {
        System.out.println("test");
    }
}
