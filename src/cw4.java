package cw4;
import java.util.Scanner;
public class cw4
{
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj a");
        double a = scan.nextDouble();
        System.out.println("Podaj b");
        double b = scan.nextDouble();
        double x = b/a;
        System.out.println(x);

    }
}
