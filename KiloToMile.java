import java.util.Scanner;

public class KiloToMile {
    // 1 KILOMETER=0.621371
    final static double cons = 0.621371;
    static double num;

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.println("|||||||||||||KILOMETER TO MILES OR MILES TO KILOMETER|||||||||||||||");
        System.out.println("Function :\n 1)kilometer --> Mile\n 2)Mile --> kilometer");
        int a = in.nextInt();
        System.out.print("Input your number:");
        num = in.nextInt();
        if (a == 1) {

            System.out.println("The Mile value is:" + kiloToMile(num));
        } else {
            System.out.println("The Kilometer value is:" + mileToKilo(num));

        }

    }

    public static double mileToKilo(double num) {
        double ans = num / cons;
        return ans;
    }

    public static double kiloToMile(double num) {
        double ans = num * cons;
        return ans;
    }

}
