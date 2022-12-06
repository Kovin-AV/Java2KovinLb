package Lb_5.factory;


import Lb_5.SportCarInt;
import Lb_5.Ferrari;
import Lb_5.Lamborghini;

import java.util.ArrayList;
import java.util.Random;

public class SportCarFactory {


    public SportCarInt getSportCar(String SportCarName){
        Random random = new Random();
        if (SportCarName == null){
            return null;
        }
        if (SportCarName.equalsIgnoreCase("Ferrari")) {
            return new Ferrari(random.nextInt(100)+500, random.nextInt(200) + 1200, random.nextInt(20000) + 60000, random.nextInt(4) + 4, getRandomTypeFerrari());
        }
        else if(SportCarName.equalsIgnoreCase("Lamborghini")){
            return new Lamborghini(random.nextInt(100)+500, random.nextInt(200) + 1200, random.nextInt(20000) + 60000, random.nextInt(4) + 4, getRandomTypeLamborghini());
        }
        return null;
    }

    public static String getRandomTypeFerrari() {
        ArrayList<String> listTypeFerrari = new ArrayList<>();
        listTypeFerrari.add("Ferrari LaFerraari");
        listTypeFerrari.add("Ferrari Roma");
        listTypeFerrari.add("Ferrari Spider");
        return listTypeFerrari.get(new Random().nextInt(3));
    }

    public static String getRandomTypeLamborghini() {
        ArrayList<String> listTypeLamborghini = new ArrayList<>();
        listTypeLamborghini.add("Lamborghini Huracan");
        listTypeLamborghini.add("Lamborghini Aventador");
        listTypeLamborghini.add("Lamborghini Gallardo");
        return listTypeLamborghini.get(new Random().nextInt(3));
    }
}
