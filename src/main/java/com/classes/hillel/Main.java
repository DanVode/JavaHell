package main.java.com.classes.hillel;

import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите имя: ");
        String name = in.nextLine();
        System.out.print("Ведите возрост: ");
        int age = in.nextInt();
        System.out.print("Ведите рост: ");
        float height = in.nextFloat();
        System.out.printf("Имя: %s  Возрост: %d  Рост: %.2f \n", name, age, height);
        in.close();
    }
}
