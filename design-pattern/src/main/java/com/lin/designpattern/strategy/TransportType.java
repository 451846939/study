package com.lin.designpattern.strategy;

public enum TransportType {

    CAR(new Car()),AIRCRAFT(new Aircraft()),WALK(new Walk());

    private Transport transport;

    TransportType(Transport transport){
        this.transport=transport;
    }

    public Transport getTransport() {
        return transport;
    }

}
