package com.square.proxy.cglib;

/**
 * @author square
 */
public class Main {
    public static void main(String[] args) {
        Service cglibService = (Service) new LogProxyFactory(new Service()).enhancer();
        System.out.println(cglibService.getClass());

        cglibService.add();
        cglibService.update();
        cglibService.delete();
    }
}
