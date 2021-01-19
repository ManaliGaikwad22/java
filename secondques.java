import java.util.*;

public class secondques
{
    public static void main(String[] args)
    {
        int nums = 10;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number: ");

        for (int num = 0; num < nums; num++)

        {
            total+=sc.nextInt();
        }
        System.out.println("Sum of all the numbers are: " + total);
        System.out.println("Average: " + (total/nums));
    }
}
