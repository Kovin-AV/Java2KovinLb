package Lb_6.German;

import Lb_6.Toyota;
import Lb_6.ToyotaInt;

public class GermanToyota extends Toyota implements ToyotaInt {

    public GermanToyota(int power, int weight, int maxSpeed, int length, String typeToyota) {
        super(power, weight, maxSpeed, length,typeToyota);
    }

    @Override
    public String getDescription() {
        return "This is German Toyota. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The maximum speed of car is " + getMaxSpeed() + " kilometers per hour. Its length is " + getLength() +
                " meters. His type is " + getTypeToyota() + "." ;
    }
}
