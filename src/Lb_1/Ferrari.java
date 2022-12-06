package Lb_1;

public class Ferrari extends SportCar {
    private String typeFerrari;

    public Ferrari(int power, int weight, int price, int engineСapacity, String typeFerrari) {
        super(power, weight, price, engineСapacity);
        this.typeFerrari = typeFerrari;
    }

    public String getTypeFerrari() {

        return typeFerrari;
    }

    public void setTypeFerrari(String typeFerrari) {

        this.typeFerrari = typeFerrari;
    }

    public String getDescription() {
        return "This is Ferrari. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The price of this car is " + getPrice() + " dollars. Its engine capacity is " + getEngineСapacity() +
                " liters. It's type " + getTypeFerrari();
    }
}
