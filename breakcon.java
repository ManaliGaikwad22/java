import java.util.*;

public class breakcon
{
    public static void main(String[] args)
    {
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        switch (num)
        {
            case '-':
                System.out.println("its over");
                break;
            case '+':
                System.out.println("good going");

            default:
                System.out.println("Invalid output");


        }
    }


}
