package Lb_6;

public abstract class Ferrari extends SportCar {
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
}