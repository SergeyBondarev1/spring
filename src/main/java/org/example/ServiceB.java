package org.example;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    private final ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
        this.serviceA.setServiceB(this);
    }
}