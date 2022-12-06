package Lb_3.decorator;

import Lb_3.Ferrari;

public class YellowFerrari implements Description{
    private final Ferrari ferrari;

    public YellowFerrari(Ferrari ferrari) {

        this.ferrari = ferrari;
    }

    @Override
    public String getDescription() {

        return ferrari.getDescription() + " It's yellow.";
    }
}
