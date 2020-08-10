import java.util.Scanner;
public class Remainder
{   static int num;
    static int ex=1;
   public static void main(String... args)
   {   while(ex==1){
       Scanner in=new Scanner(System.in);
    System.out.print("Enter a number to check whether it is even or odd: ");
        num=in.nextInt();
        if(num%2==0)
        {
            System.out.println("----------Totally Even---------");
            }
        else{
            System.out.println("----------No doubt it's odd-----------");
        }
        System.out.print("Do you want to try it with another number ?");
        System.out.print("If yes enter '1' otherwise enter '2' to exit: ");
        ex=in.nextInt();
    }
    System.out.println("\t--Thanks for using our small oddeven finder-- \n\t```Have a great day```");

   }

}