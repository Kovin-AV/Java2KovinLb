package Lb_3.decorator;

import Lb_3.Lamborghini;

public class RedLamborghini implements Description {
    private final Lamborghini lamborghini;

    public RedLamborghini(Lamborghini lamborghini) {

        this.lamborghini = lamborghini;
    }

    @Override
    public String getDescription() {

        return lamborghini.getDescription() + " It's red.";
    }
}