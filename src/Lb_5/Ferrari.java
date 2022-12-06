package Lb_5;

public class Ferrari extends SportCar implements SportCarInt{
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

    public String getDescriptionSportCar() {
        return "This is Ferrari. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The price of this car is " + getPrice() + " dollars. Its engine capacity is " + getEngineСapacity() +
                " liters. His type is " + getTypeFerrari();
    }
}