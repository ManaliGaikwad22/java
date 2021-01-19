import java.util.*;

public class eightques
{
    public static void main(String[] args)
    {
        int in, year, cal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = sc.nextInt();

        if(year != 0)
        {
            in=(year%400==0?(cal=1):((year%100=0)?(cal=0):((year%4==0)?(cal=1):(cal=0))));
            if(in==1)
                System.out.println(year+ " is a leap year");
            else
                System.out.println(year+ "is not a leap year");
        }
        else
            System.out.println("year does not exists.");
    }
}
