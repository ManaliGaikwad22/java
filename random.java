import java.util.*;

public class random
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the letter: ");
        char ch = sc.next().charAt(0);

        if(ch=='r' || ch=='a'|| ch=='n'||ch=='d'||ch=='o'||ch=='m')
        {
            System.out.println("Found");
        }
        else if(ch=='R' || ch=='A'|| ch=='N'||ch=='D'||ch=='O'||ch=='M')
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
