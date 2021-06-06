package cn.dada.接口隔离.proxy.liyunfeng17.jdkproxy;

import java.lang.reflect.Proxy;

public class Test
{
    public static void main(String[] args)
    {
        IndexDao indexDao = new IndexImpl();
        IndexDao impl = (IndexDao)Proxy.newProxyInstance(indexDao.getClass().getClassLoader(),indexDao.getClass().getInterfaces(),new MyInvocationHandler(indexDao));
        impl.selectByKey();
    }
}