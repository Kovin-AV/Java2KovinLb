package Lb_6.Italian;

import Lb_6.Ferrari;
import Lb_6.FerrariInt;

public class ItalianFerrari extends Ferrari implements FerrariInt {

    public ItalianFerrari(int power, int weight, int price, int engineСapacity, String typeFerrari) {
        super(power, weight, price, engineСapacity,typeFerrari);
    }

    @Override
    public String getDescription() {
        return "This is Italian Ferrari. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The price of this car is " + getPrice() + " dollars. Its engine capacity is " + getEngineСapacity() +
                " liters. His type is " + getTypeFerrari();
    }
}
