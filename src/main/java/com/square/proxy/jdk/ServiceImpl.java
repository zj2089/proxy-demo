package com.square.proxy.jdk;

/**
 * @author square
 */
public class ServiceImpl implements Service {

    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
