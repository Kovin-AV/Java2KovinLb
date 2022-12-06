package Lb_6;

import Lb_6.factory.CarFactory;
import Lb_6.factory.ItalianCarFactory;
import Lb_6.factory.GermanCarFactory;


public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = getCarFactory("Italian");


        FerrariInt ferrari = carFactory.getFerrari();
        LexusInt lexus = carFactory.getLexus();
        LamborghiniInt lamborghini = carFactory.getLamborghini();
        ToyotaInt toyota = carFactory.getToyota();

        System.out.println(ferrari.getDescription());
        System.out.println(lexus.getDescription());
        System.out.println(lamborghini.getDescription());
        System.out.println(toyota.getDescription());

    }

    public static CarFactory getCarFactory(String factoryName) {
        if (factoryName == null) {
            return null;
        }
        if (factoryName.equalsIgnoreCase("German")) {
            return new ItalianCarFactory();
        }
        else if (factoryName.equalsIgnoreCase("Italian")) {
            return new GermanCarFactory();
        }
        return null;
    }
}
