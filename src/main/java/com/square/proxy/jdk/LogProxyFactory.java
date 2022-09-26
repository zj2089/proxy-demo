package com.square.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author square
 */
public class LogProxyFactory {
    public Object getProxyInstance(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new LogInvocationHandler(target));
    }
}
