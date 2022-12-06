package Lb_1;

public class Lamborghini extends SportCar {
    private String typeLamborghini;

    public Lamborghini(int power, int weight, int price, int engineСapacity, String typeLamborghini) {
        super(power, weight, price, engineСapacity);
        this.typeLamborghini = typeLamborghini;
    }

    public String getTypeLamborghini() {

        return typeLamborghini;
    }

    public void setTypeLamborghini(String typeLamborghini) {

        this.typeLamborghini = typeLamborghini;
    }

    public String getDescription() {
        return "This is Lamborghini. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The price of this car is " + getPrice() + " dollars. Its engine capacity is " + getEngineСapacity() +
                " liters. It's type " + getTypeLamborghini();
    }
}
