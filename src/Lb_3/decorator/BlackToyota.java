package Lb_3.decorator;

import Lb_3.Toyota;

public class BlackToyota implements Description{
    private final Toyota toyota;

    public BlackToyota(Toyota toyota) {

        this.toyota = toyota;
    }

    @Override
    public String getDescription() {

        return this.toyota.getDescription() + " It's Black.";
    }
}