package Lb_5;

import Lb_5.factory.SedanFactory;
import Lb_5.factory.SportCarFactory;

public class Main {

    public static void main(String[] args) {
        SedanFactory sedanFactory = new SedanFactory();
        SedanInt sedan1 = sedanFactory.getSedan("Lexus");
        SedanInt sedan2 = sedanFactory.getSedan("Toyota");

        SportCarFactory sportcarFactory = new SportCarFactory();
        SportCarInt sportcar1 = sportcarFactory.getSportCar("Ferrari");
        SportCarInt sportcar2 = sportcarFactory.getSportCar("Lamborghini");

        System.out.println("1. " + sedan1.getDescriptionSedan());
        System.out.println("2. " + sedan2.getDescriptionSedan());

        System.out.println("3. " + sportcar1.getDescriptionSportCar());
        System.out.println("4. " + sportcar2.getDescriptionSportCar());

    }

}
