/* Swap two numbers using third variable as result name and do the same task without using any third variable. */


import java.util.*;

class SwapNum {
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        {   //using third variable
            System.out.println("Before swapping the value of a: " + a + ", b: " + b);
            c = a;
            a = b;
            b = c;

            System.out.println("After swapping the value of a: " + a + ", b: " + b);
        }
    }
}
