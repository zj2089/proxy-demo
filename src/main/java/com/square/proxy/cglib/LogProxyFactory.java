package com.square.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author square
 */
public class LogProxyFactory implements MethodInterceptor {

    private Object target;

    public LogProxyFactory(Object target) {
        this.target = target;
    }

    public Object enhancer() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("start intercept");
        Object invoke = method.invoke(target, objects);
        System.out.println("end intercept");
        return invoke;
    }
}
