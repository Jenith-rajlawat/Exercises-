import java.util.Scanner;

public class Percentage {
    static int max = 0;

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.println("|||||||||||CBSE Percentile Calculation|||||||||||||");
        System.out.println("Assign total marks for which the subject was taken:");
        max = in.nextInt();
        System.out.print("Enter the marks for English subject:");
        double num1 = in.nextDouble();
        System.out.println("Marks for English subject:" + num1);
        System.out.print("Enter the marks for Mathematics subject:");
        double num2 = in.nextDouble();
        System.out.println("Marks for Mathematics subject:" + num2);
        System.out.print("Enter the marks for Physics subject");
        double num3 = in.nextDouble();
        System.out.println("Marks for Physics subject:" + num3);
        System.out.print("Enter the marks for Programming subject:");
        double num4 = in.nextDouble();
        System.out.println("Marks for first subject:" + num4);
        System.out.print("Enter the marks for OOP subject:");
        double num5 = in.nextDouble();
        System.out.println("Marks for OOP subject:" + num5);
        double total = num1 + num2 + num3 + num4 + num5;
        double average = total / 5;
        double percentage = (total / (max * 5)) * 100;
        System.out.print("Average number you achieved in all subjects:" + average);
        System.out.print("\nPercentage:" + percentage + "%");
        System.out.print("\nThankyou for using");

    }
}