package Lb_5;

public class Lexus extends Sedan implements SedanInt{
    private String typeLexus;

    public Lexus(int power, int weight, int maxSpeed, int length, String typeLexus) {
        super(power, weight, maxSpeed, length);
        this.typeLexus = typeLexus;
    }

    public String getTypeLexus() {

        return typeLexus;
    }

    public void setTypeLexus(String typeLexus) {

        this.typeLexus = typeLexus;
    }

    public String getDescriptionSedan() {
        return "This is Lexus. Cat has " + getPower() + " horse power. It's weight is " + getWeight() + " kilograms. " +
                "The maximum speed of car is " + getMaxSpeed() + " kilometers per hour. Its length is " + getLength() +
                " meters. His type is " + getTypeLexus() + "." ;
    }
}