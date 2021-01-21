/* Write a program to complete the task given below: 

Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z. 

Use z for adding 30 into it and print the final result by using variable results. */


import java.util.*;

public class addNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 1st number: ");
        int i1 = sc.nextInt();

        System.out.println("Enter the value of 1st number: ");
        int i2 = sc.nextInt();


        int z = i1 + i2;
        int result = z + 30;

        System.out.println("The value is: " + result);


    }
}
