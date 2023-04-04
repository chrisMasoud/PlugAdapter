package com.company.plugadapter;

public class EuropeanDevice {
    private EuropeanSocket europeanSocket;

    public EuropeanDevice(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    public void use() {
        europeanSocket.plugIntoEuropeanSocket();
    }
}
