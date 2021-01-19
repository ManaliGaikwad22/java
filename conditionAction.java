import java.util.*;

public class conditionAction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if(n%3==0)
        {
            System.out.println("NEW");
        }
        else if(n%2==0 && n>=2 && n<=5)
        {
            System.out.println("OLD");
        }
        else if(n%2==0 && n>=6 && n<=30)
        {
            System.out.println("NEW");
        }
        else if (n%2==0 && n>30)
        {
           System.out.println("OLD");
        }
    }
}
