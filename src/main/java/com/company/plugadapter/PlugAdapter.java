package com.company.plugadapter;

public class PlugAdapter {

    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPowerPlug();
        EuropeanSocket europeanSocket = new AmericanToEuropeanPlugAdapter(americanPlug);
        EuropeanDevice europeanDevice = new EuropeanDevice(europeanSocket);
        europeanDevice.use();
    }
}
