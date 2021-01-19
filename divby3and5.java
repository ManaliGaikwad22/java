import java.util.*;

public class divby3and5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if((num%3==0)&&(num%5==0))
        {
            System.out.println("Java training");
        }
        else
        {
            System.out.println("Consultadd JAVA Training");
        }


    }
}
