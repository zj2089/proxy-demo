package com.square.proxy.jdk;

/**
 * @author square
 */
public class Main {
    public static void main(String[] args) {
        Service service = (Service) new LogProxyFactory().getProxyInstance(new ServiceImpl());
        System.out.println(service.getClass());
        service.add();
        service.update();
        service.delete();
    }
}
