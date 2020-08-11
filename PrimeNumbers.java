import java.util.Scanner;
public class PrimeNumbers {
    int num;
    static int temp=1;
    public static void main(String... args)
    {   
        Scanner in=new Scanner(System.in);
        PrimeNumbers obj=new PrimeNumbers();
       while(temp==1){
        System.out.println("Enter a number to find whether it is prime or not");
        obj.num=in.nextInt();
        if (obj.num == 1||obj.num==2||obj.num==3) {
            System.out.println("---It is a prime number---");
        }else{
        for(int i=2;i<=obj.num/2;i++)
        { 
            if(obj.num%i==0)
            {
                System.out.println("---Isn't a prime number---");
                break;
            }
            else 
            {System.out.println("---It is a prime number---");
            break;}
        }
    }System.out.print("If you want to find for other numbers too enter 1 or enter any other key to exit:");
     temp=in.nextInt();
    }
    System.out.println("Thank you for using.\n--Have a grat day--");
}
}