package Lb_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Manufacturer mf = new Manufacturer();
        Consumer cr = new Consumer();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер склада: ");
        int n = in.nextInt();
        Storage st = new Storage(n);
        System.out.println("Размер склада: " + st.getLimit());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mf.produce(st);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    cr.consume(st);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}