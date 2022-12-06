package Lb_6;

public abstract class Car {
    private int power;
    private int weight;

    public Car(int power, int weight) {
        this.power = power;
        this.weight = weight;
    }

    public int getPower() {

        return power;
    }

    public void setPower(int power) {

        this.power = power;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }
}

