package com.company.plugadapter;

public class AmericanToEuropeanPlugAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    public AmericanToEuropeanPlugAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    public void plugIntoEuropeanSocket() {
        System.out.println("Using an adapter to plug American plug into a European socket.");
        americanPlug.plugIntoAmericanSocket();
    }
}
