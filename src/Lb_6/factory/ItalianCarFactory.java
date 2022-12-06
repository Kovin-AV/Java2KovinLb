package Lb_6.factory;

import Lb_6.*;
import Lb_6.Italian.ItalianToyota;
import Lb_6.Italian.ItalianLexus;
import Lb_6.Italian.ItalianFerrari;
import Lb_6.Italian.ItalianLamborghini;

import java.util.ArrayList;
import java.util.Random;

public class ItalianCarFactory implements CarFactory {
    private final Random random = new Random();

    @Override
    public FerrariInt getFerrari() {
        return new ItalianFerrari(random.nextInt(100)+500, random.nextInt(200) + 1200, random.nextInt(20000) + 60000, random.nextInt(4) + 4, getRandomTypeFerrari());
    }

    @Override
    public LexusInt getLexus() {
        return new ItalianLexus(random.nextInt(50)+150, random.nextInt(1000) + 1000, random.nextInt(50) + 200, random.nextInt(2) + 5, getRandomTypeLexus());
    }

    @Override
    public LamborghiniInt getLamborghini() {
        return new ItalianLamborghini(random.nextInt(100)+500, random.nextInt(200) + 1200, random.nextInt(20000) + 60000, random.nextInt(4) + 4, getRandomTypeLamborghini());
    }

    @Override
    public ToyotaInt getToyota() {
        return new ItalianToyota(random.nextInt(50)+140, random.nextInt(1000) + 1000, random.nextInt(50) + 200, random.nextInt(2) + 4, getRandomTypeToyota());
    }

    public String getRandomTypeLexus() {
        ArrayList<String> listTypeLexus = new ArrayList<>();
        listTypeLexus.add("Lexus ES");
        listTypeLexus.add("Lexus LS");
        listTypeLexus.add("Lexus GS");
        return listTypeLexus.get(new Random().nextInt(3));
    }

    public String getRandomTypeToyota() {
        ArrayList<String> listTypeToyota = new ArrayList<>();
        listTypeToyota.add("Toyota Yaris");
        listTypeToyota.add("Toyota Camry");
        listTypeToyota.add("Toyota Corolla");
        return listTypeToyota.get(new Random().nextInt(3));
    }

    public String getRandomTypeFerrari() {
        ArrayList<String> listTypeFerrari = new ArrayList<>();
        listTypeFerrari.add("Ferrari LaFerraari");
        listTypeFerrari.add("Ferrari Roma");
        listTypeFerrari.add("Ferrari Spider");
        return listTypeFerrari.get(new Random().nextInt(3));
    }

    public String getRandomTypeLamborghini() {
        ArrayList<String> listTypeLamborghini = new ArrayList<>();
        listTypeLamborghini.add("Lamborghini Huracan");
        listTypeLamborghini.add("Lamborghini Aventador");
        listTypeLamborghini.add("Lamborghini Gallardo");
        return listTypeLamborghini.get(new Random().nextInt(3));
    }
}
