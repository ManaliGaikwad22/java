import java.lang.Math.*;
import java.util.*;

public class floatingpoint
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float n = sc.nextFloat();

        if (n == 0.0)
        {
            System.out.println("zero");
        }
        else if (n > 0.0)
        {
            System.out.println("Positive");
        }
        else if (n < 0.0)
        {
            System.out.println("Negative");
        }
        else if(n < 1)
        {
            System.out.println("Small");
        }
        else if(n > 1000000)
        {
            System.out.println("Large");
        }


    }



}
