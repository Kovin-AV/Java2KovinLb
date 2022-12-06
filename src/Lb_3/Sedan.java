package Lb_3;

public abstract class Sedan extends Car {
    private int maxSpeed;
    private int length;

    public Sedan(int power, int weight, int maxSpeed, int length) {
        super(power, weight);
        this.maxSpeed = maxSpeed;
        this.length = length;
    }

    public int getMaxSpeed() {

        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {

        this.maxSpeed = maxSpeed;
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public abstract String getDescription();
}

