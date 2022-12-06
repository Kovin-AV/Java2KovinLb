package Lb_5.factory;

import Lb_5.SedanInt;
import Lb_5.Lexus;
import Lb_5.Toyota;

import java.util.ArrayList;
import java.util.Random;

public class SedanFactory {

    public SedanInt getSedan(String SedanName) {
        Random random = new Random();
        if (SedanName == null){
            return null;
        }
        if (SedanName.equalsIgnoreCase("Lexus")) {
            return new Lexus(random.nextInt(50)+150, random.nextInt(1000) + 1000, random.nextInt(50) + 200, random.nextInt(2) + 5, getRandomTypeLexus());
        }
        else if(SedanName.equalsIgnoreCase("Toyota")){
            return new Toyota(random.nextInt(50)+140, random.nextInt(1000) + 1000, random.nextInt(50) + 200, random.nextInt(2) + 4, getRandomTypeToyota());
        }
        return null;
    }

    public static String getRandomTypeLexus() {
        ArrayList<String> listTypeLexus = new ArrayList<>();
        listTypeLexus.add("Lexus ES");
        listTypeLexus.add("Lexus LS");
        listTypeLexus.add("Lexus GS");
        return listTypeLexus.get(new Random().nextInt(3));
    }

    public static String getRandomTypeToyota() {
        ArrayList<String> listTypeToyota = new ArrayList<>();
        listTypeToyota.add("Toyota Yaris");
        listTypeToyota.add("Toyota Camry");
        listTypeToyota.add("Toyota Corolla");
        return listTypeToyota.get(new Random().nextInt(3));
    }
}
