import java.util.*;

public class Divby3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if((num%3==0))
        {
            System.out.println("consultadd");
        }
        else
        {
            System.out.println("not divisible by 3");
        }


    }
}
