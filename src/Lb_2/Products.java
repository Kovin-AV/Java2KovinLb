package Lb_2;

public class Products {
    private int id;

    public Products(int id) {

        this.id = id+1;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @Override
    public String toString() {
        return "продукт №: " + id;
    }
}
