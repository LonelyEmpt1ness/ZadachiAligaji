package day2.task1;

import java.util.Scanner;

public class Sanya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a < 4){
            System.out.println("Малоэтажный дом");
        } else if(a > 4 && a < 8){
            System.out.println("Среднеэтажный дом");
        } else if(a > 8 && a < 10){
            System.out.println("Многоэтажный дом");
        } else if(a != 1 && a != 10){
            System.out.println("Ошибка ввода");
        }
    }

}
