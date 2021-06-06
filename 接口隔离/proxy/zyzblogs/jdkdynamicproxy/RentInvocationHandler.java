package cn.dada.接口隔离.proxy.zyzblogs.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RentInvocationHandler implements InvocationHandler
{
    private Object target;

    public RentInvocationHandler(Object target)
    {
        this.target = target;
    }

    /**
     * @param proxy:代理类
     * @param method：代理类调用处理程序的方法对象
     * @param args：方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("这里模拟使用使用动态代理做的一些增强的操作......");
        //第一个参数表示真实对象(是target,而不是invoke方法的形参proxy),第二个参数表示method方法的参数
        Object result = method.invoke(target, args);
        return result;
    }
}