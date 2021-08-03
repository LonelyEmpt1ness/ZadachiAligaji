package day2.task4;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y;
        while (sc.hasNext()){
            double x = sc.nextDouble();
            if(x >= 5){
              y = (x * x - 10) / (x + 7);
            } else if (x > -3 && x < 5){
              y = (x + 3) * (x * x - 2);
            } else{
              y = 420;
            }
            System.out.println(y);
        }
        sc.close();
    }

}
