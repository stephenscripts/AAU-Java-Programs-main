//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       /*
       Assignment();
        double r, a;
        System.out.println("Radius: ");
        r = in.nextDouble();
        final double pi = 22.0/7.0;
        a = pi * r * r;

        if (a > 10){
            int t = 'A' + 1;
            System.out.println(String.format("Hey, Do you miss me? %s", t));
            System.out.println("Hey, Do you miss me? " + t);
        }

        System.out.println("The Area of the circle with radius " + r + ": " + a);

        double testFloat = 1.56E-7;
        System.out.println(testFloat);*/

        //xTry();
        //fibunacci();
        //zeroMaxNumbers();
        frequency();


    }
    public static void xTry(){
                Scanner scanner = new Scanner(System.in);
                int money = scanner.nextInt(), display;


                //TODO: put your code here
                if (money % 5 != 0){
                    System.out.println("Cannot be processed!");
                }else{
                    while(money > 0){
                        if (money >= 100){
                            display = money/100;
                            money = money - (100 * display);
                            System.out.println(100 + "euros " + display);
                        }else if(money >= 50){
                            display = money/50;
                            money = money - (50 * display);
                            System.out.println(50 + "euros " + display);
                        }else if(money >= 20){
                            display = money/20;
                            money = money - (20 * display);
                            System.out.println(20 + "euros " + display);
                        }else if (money >= 10){
                            display = money/10;
                            money = money - (10 * display);
                            System.out.println(10 + "euros " + display);
                        }else{
                            display = money/5;
                            money = money - (5 * display);
                            System.out.println(5 + "euros " + display);
                        }
                    }
                }
            }

    public static void Assignment() {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        //TODO: put your code here

        if (money % 5 > 0) {
            System.out.println("Cannot be processed!");
            money = 0;
        }
        while (money > 0) {
            if (money > 100 && money % 5 == 0) {
                int resultant = money / 100;
                money = money - resultant * 100;
                System.out.println("100 Euro: " + resultant);
            }
            if (money > 50 && money % 5 == 0) {
                System.out.println("50 Euro: " + 1);
            }
            if (money > 20 && money % 5 == 0) {
                System.out.println("20 Euro: " + 1);
            }
            if (money > 10 && money > 5) {
                System.out.println("10 Euro: " + 1);
            }
            if (money == 5) {
                System.out.println("5 Euro: " + 1);
            }

        }
    }

    public static void fibunacci(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0){
            System.out.print("Invalid");
        }else {
            int[] f = new int[n + 2];
            f[0] = 0;
            f[1] = 1;
            int i = 2;
            int j = 0;
            while(i < f.length){
                f[i] = f[i - 1] + f[i - 2];
                i++;
            }
            int x = 0;
            do{
                System.out.print(f[x] + " ");
                x++;
            }while(x < f.length-1);
        }
    }

    public static void zeroMaxNumbers(){
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[100];

        int n = 1;
        for (int i = 0; n != 0; i++) {
            n = in.nextInt();
            numbers[i] = n;
        }

        // Find the highest value in the ArrayList
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value
        int index = 0;
        for(int i = 0; i < numbers.length; i++){
            int x = numbers[i];
            if(x > max && x != 0){
                max = x;
                index = i+1;
            }
        }
        System.out.println("Biggest number = " + max + " at position " + index);
    }

    public static void factorial(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // n!
        int factorial = 1;
        for(int i = 1; i<=n; i++){
            factorial *=i;
        }
        System.out.println(factorial);
    }

    public static void frequency(){
        Scanner scanner = new Scanner(System.in);
        long in = scanner.nextLong();

        int[] digits = new int[10];

        if (in < 0){
            System.out.println("Only Positive Long values are allowed\n\nPress Enter to exit");
            System.exit(0);
        }else {
            for (int i = 0; in >= 1; i++){
                int x;
                long y = in%10;
                in = in/10;
                x = (int)y;
                digits[x] += 1;
            }
            for (int i = digits.length -1; i >= 0; i--){
                //System.out.println(digits[i]);
                if (digits[i] > 0)
                    System.out.println(i + " occurs " + digits[i] + " time(s)");
            }
        }
    }
}