package Lb_7;

import java.util.*;


public class Main {
    public static Iterator<Room> iterator;
    public static int squareFirstFloor;
    public static int squareSecondFloor;
    public static int squareThirdFloor;
    public static int squareСorridors;
    public static int squareKitchens;
    public static int squareLivings;

    public static void main(String[] args) {
        Room[] floor1 = new Room[5];
        ArrayList<Room> floor2 = new ArrayList<>();
        LinkedList<Room> floor3 = new LinkedList<>();



        for (int i = 0; i < 5; i++) {
            floor1[i] = new Room(getRandomTypeRoom(), getRandomSquareRoom());
            floor2.add(new Room(getRandomTypeRoom(), getRandomSquareRoom()));
            floor3.add(new Room(getRandomTypeRoom(), getRandomSquareRoom()));
        }
        System.out.println(sumSquare(floor1, floor2, floor3));

    }

    public static String sumSquare(Room[] floor1, ArrayList<Room> floor2, LinkedList<Room> floor3) {
        Room room;
        squareFirstFloor = 0;
        squareSecondFloor = 0;
        squareThirdFloor = 0;
        squareСorridors = 0;
        squareKitchens = 0;
        squareLivings = 0;

        iterator = Arrays.stream(floor1).iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareFirstFloor += room.getSquare();
            sumSquareTypeRoom(room);
        }

        iterator = floor2.iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareSecondFloor += room.getSquare();
            sumSquareTypeRoom(room);
        }
        iterator = floor3.iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareThirdFloor += room.getSquare();
            sumSquareTypeRoom(room);
        }
        return "Общая площадь здания: " + (squareFirstFloor + squareSecondFloor + squareThirdFloor) + "м^2\nПлощадь " +
                "первого этажа: " + squareFirstFloor + "м^2\nПлощадь второго этажа: " + squareSecondFloor +
                "м^2\nПлощадь третьего этажа: " + squareThirdFloor + "м^2\nПлощадь коридоров: " + squareСorridors +
                "м^2\nПлощадь кухонь: " + squareKitchens + "м^2\nПлощадь гостинных: " + squareLivings + "м^2";
    }

    public static void sumSquareTypeRoom(Room room){
        switch (room.getType()){
            case "Сorridor" : squareСorridors += room.getSquare();
                break;
            case "Kitchen" : squareKitchens += room.getSquare();
                break;
            case "Living" : squareLivings += room.getSquare();
                break;
        }
    }

    public static String getRandomTypeRoom() {
        ArrayList<String> listTypeRoom = new ArrayList<>();
        listTypeRoom.add("Сorridor");
        listTypeRoom.add("Kitchen");
        listTypeRoom.add("Living");
        return listTypeRoom.get(new Random().nextInt(3));
    }

    public static int getRandomSquareRoom() {

        return new Random().nextInt(10) + 20;
    }
}
