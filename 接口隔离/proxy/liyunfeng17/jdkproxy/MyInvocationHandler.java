package cn.dada.接口隔离.proxy.liyunfeng17.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler
{
    private Object target;

    public MyInvocationHandler(Object target)
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("proxy start");
        Object result = method.invoke(target, args);
        return result;
    }
}