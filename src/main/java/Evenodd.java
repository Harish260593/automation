import java.util.Scanner;
public class Evenodd {
    public static void main (String ags [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int c = sc.nextInt();

        if(c%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }

    }

}
