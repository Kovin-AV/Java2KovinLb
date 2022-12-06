package Lb_5;

public class Toyota extends Sedan implements SedanInt{
    private String typeToyota;

    public Toyota(int power, int weight, int maxSpeed, int length, String typeToyota) {
        super(power, weight, maxSpeed, length);
        this.typeToyota = typeToyota;
    }

    public String getTypeToyota() {

        return typeToyota;
    }

    public void setTypeToyota(String typeToyota) {

        this.typeToyota = typeToyota;
    }

    public String getDescriptionSedan() {
        return "This is Toyota. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The maximum speed of car is " + getMaxSpeed() + " kilometers per hour. Its length is " + getLength() +
                " meters. His type is " + getTypeToyota() + "." ;
    }
}
