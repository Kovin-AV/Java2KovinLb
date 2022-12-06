package Lb_3;

import Lb_3.decorator.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = in.nextInt();
        showCar(randomCar(n));
    }

    public static ArrayList<Description> randomCar(int n) {
        Random random = new Random();
        ArrayList<Description> CarArray = new ArrayList<>();
        Lexus lexus;
        Toyota toyota;
        Ferrari ferrari;
        Lamborghini lamborghini;


        for (int i = 0; i < n; i++) {
            switch (random.nextInt(4)){
                case 0 : {
                    lexus = new Lexus(random.nextInt(50)+150, random.nextInt(1000) + 1000, random.nextInt(50) + 200, random.nextInt(2) + 5, getRandomTypeLexus());
                    CarArray.add((random.nextInt(2) == 0 ? new BlackLexus(lexus) : new WhiteLexus(lexus)));
                    break;
                }
                case 1 : {
                    toyota = new Toyota(random.nextInt(50)+140, random.nextInt(1000) + 1000, random.nextInt(50) + 200, random.nextInt(2) + 4, getRandomTypeToyota());
                    CarArray.add((random.nextInt(2) == 0 ? new WhiteToyota(toyota) : new BlackToyota(toyota)));
                    break;
                }
                case 2 : {
                    ferrari = new Ferrari(random.nextInt(100)+500, random.nextInt(200) + 1200, random.nextInt(20000) + 60000, random.nextInt(4) + 4, getRandomTypeFerrari());
                    CarArray.add((random.nextInt(2) == 0 ? new YellowFerrari(ferrari) : new RedFerrari(ferrari)));
                    break;
                }
                case 3 : {
                    lamborghini = new Lamborghini(random.nextInt(100)+500, random.nextInt(200) + 1200, random.nextInt(20000) + 60000, random.nextInt(4) + 4, getRandomTypeLamborghini());
                    CarArray.add((random.nextInt(2) == 0 ? new RedLamborghini(lamborghini) : new BluyLamborghini(lamborghini)));
                    break;
                }
            }
        }
        return CarArray;
    }

    public static void showCar(ArrayList<Description> CarArray) {
        int num = 0;
        for (Description description : CarArray) {
            num++;
            System.out.println(+ num + ". " + description.getDescription());
        }
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
