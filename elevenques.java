import java.util.*;

public class elevenques
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();
        if(Math.abs(num1-num2) <= 0.01)
        {
            System.out.println("They are same numbers");
        }
        else{
            System.out.println("They are different numbers");
        }
    }
}
