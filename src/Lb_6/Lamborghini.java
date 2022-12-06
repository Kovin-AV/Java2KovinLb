package Lb_6;

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
}