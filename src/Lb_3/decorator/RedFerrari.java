package Lb_3.decorator;

import Lb_3.Ferrari;

public class RedFerrari implements Description{
    private final Ferrari ferrari;

    public RedFerrari(Ferrari ferrari) {

        this.ferrari = ferrari;
    }

    @Override
    public String getDescription() {

        return ferrari.getDescription() + " It's red.";
    }
}