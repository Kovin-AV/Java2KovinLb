package Lb_6.German;

import Lb_6.Ferrari;
import Lb_6.FerrariInt;

public class GermanFerrari extends Ferrari implements FerrariInt {

    public GermanFerrari(int power, int weight, int price, int engineСapacity, String typeFerrari) {
        super(power, weight, price, engineСapacity,typeFerrari);
    }

    @Override
    public String getDescription() {
        return "This is German Ferrari. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The price of this car is " + getPrice() + " dollars. Its engine capacity is " + getEngineСapacity() +
                " liters. His type is " + getTypeFerrari();
    }
}
