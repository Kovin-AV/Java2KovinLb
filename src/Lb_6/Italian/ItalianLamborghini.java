package Lb_6.Italian;

import Lb_6.Lamborghini;
import Lb_6.LamborghiniInt;

public class ItalianLamborghini extends Lamborghini implements LamborghiniInt {

    public ItalianLamborghini(int power, int weight, int price, int engineСapacity, String typeLamborghini) {
        super(power, weight, price, engineСapacity,typeLamborghini);
    }

    @Override
    public String getDescription() {
        return "This is Italian Lamborghini. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The price of this car is " + getPrice() + " dollars. Its engine capacity is " + getEngineСapacity() +
                " liters. His type is " + getTypeLamborghini();
    }
}
