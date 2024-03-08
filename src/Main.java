//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
            double r, a;
            System.out.println("Radius: ");
            r = in.nextDouble();
            final double pi = 22.0/7.0;
            a = pi * r * r;

            System.out.println("The Area of the circle with radius " + r + ": " + a);


    }
}