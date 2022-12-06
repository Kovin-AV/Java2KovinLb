package Lb_6.Italian;

import Lb_6.Toyota;
import Lb_6.ToyotaInt;

public class ItalianToyota extends Toyota implements ToyotaInt {

    public ItalianToyota(int power, int weight, int maxSpeed, int length, String typeToyota) {
        super(power, weight, maxSpeed, length,typeToyota);
    }

    @Override
    public String getDescription() {
        return "This is Italian Toyota. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The maximum speed of car is " + getMaxSpeed() + " kilometers per hour. Its length is " + getLength() +
                " meters. His type is " + getTypeToyota() + "." ;
    }
}
