package Lb_6;

public abstract class Toyota extends Sedan {
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
}
