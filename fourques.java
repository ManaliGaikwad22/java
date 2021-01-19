import java.util.*;

public class fourques
{
    public static void main(String[] args)
    {
        int num=0;
        int sum=0;
        System.out.println("Input the number: ");
        {
            for(int i=0; i<6; i++)
            {
              Scanner sc = new Scanner(System.in);
              num = sc.nextInt();
              sum += num;
            }
            System.out.println("The sum of all the natural number is: "+ sum);
        }

    }
}
