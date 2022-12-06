package Lb_6;

public abstract class Lexus extends Sedan {
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
}
