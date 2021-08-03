package day2.task3;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (a < b){

            a++;

            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");

            }
        }
    }
}