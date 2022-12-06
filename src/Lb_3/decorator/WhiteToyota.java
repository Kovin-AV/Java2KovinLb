package Lb_3.decorator;

import Lb_3.Toyota;

public class WhiteToyota implements Description{
    private final Toyota toyota;

    public WhiteToyota(Toyota toyota) {

        this.toyota = toyota;
    }

    @Override
    public String getDescription() {

        return this.toyota.getDescription() + " It's white.";
    }
}