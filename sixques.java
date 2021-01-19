import java.util.*;

public class sixques
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the 2nd number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the 3rd number: ");
        double num3 = sc.nextDouble();

        if(num1<num2 && num2<num3)
        {
            System.out.println("INCREASING");
        }
        else if (num1>num2 && num2>num3)
        {
            System.out.println("DECREASING");
        }
        else
        {
            System.out.println("Neither increasing nor decreasing order ");
        }

    }
}
