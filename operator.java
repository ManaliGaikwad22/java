import java.util.*;

public class operator
{
    public static void main(String[] args)
    {
        System.out.println("Enter one operation from +, -, *, /");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result =0;

        switch(ch)
        {
            case '+':
            result=(a+b);
            break;

            case '-':
            result=(a-b);
            break;

            case '*':
            result=(a*b);
            break;

            case '/':
            result=(a/ b);
            break;

            default:
                System.out.println("Invalid input");
        }
        System.out.println(result);
    }
}
