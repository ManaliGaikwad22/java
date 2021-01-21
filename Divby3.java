/* Write a program in JAVA to print a number is divisible by 3 it should print “Consultadd” as a string 

If a number is divisible by 5 it should print “JAVA Training” as a string 

If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string. 

rform the following operation*/ 

import java.util.*;

public class Divby3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if((num%3==0))
        {
            System.out.println("consultadd");
        }
        else
        {
            System.out.println("not divisible by 3");
        }


    }
}
