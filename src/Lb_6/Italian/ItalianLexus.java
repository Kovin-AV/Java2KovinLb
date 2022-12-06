package Lb_6.Italian;

import Lb_6.Lexus;
import Lb_6.LexusInt;

public class ItalianLexus extends Lexus implements LexusInt {

    public ItalianLexus(int power, int weight, int maxSpeed, int length, String typeLexus) {
        super(power, weight, maxSpeed, length,typeLexus);
    }

    @Override
    public String getDescription() {
        return "This is Italian Lexus. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The maximum speed of car is " + getMaxSpeed() + " kilometers per hour. Its length is " + getLength() +
                " meters. His type is " + getTypeLexus() + "." ;
    }
}