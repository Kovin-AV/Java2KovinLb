package Lb_3.decorator;

import Lb_3.Lexus;

public class BlackLexus implements Description{
    private final Lexus lexus;

    public BlackLexus(Lexus lexus) {

        this.lexus = lexus;
    }

    @Override
    public String getDescription() {

        return this.lexus.getDescription() + " It's black.";
    }
}
