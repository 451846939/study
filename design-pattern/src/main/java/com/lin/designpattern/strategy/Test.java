package com.lin.designpattern.strategy;

public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        man.trip(TransportType.CAR.getTransport());
        System.out.println("-------------------------");
        man.trip(TransportType.WALK.getTransport());
        System.out.println("-------------------------");
        man.trip(TransportType.AIRCRAFT.getTransport());
    }
}
