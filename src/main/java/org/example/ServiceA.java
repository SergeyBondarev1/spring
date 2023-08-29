package org.example;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    private ServiceB serviceB;

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}