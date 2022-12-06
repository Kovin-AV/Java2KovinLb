package Lb_6;

public abstract class SportCar extends Car {
    private int price;
    private int engineСapacity;

    public SportCar(int power, int weight, int price, int engineСapacity) {
        super(power, weight);
        this.price = price;
        this.engineСapacity = engineСapacity;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public int getEngineСapacity() {

        return engineСapacity;
    }

    public void setEngineСapacity(int engineСapacity) {

        this.engineСapacity = engineСapacity;
    }

}