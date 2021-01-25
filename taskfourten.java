//Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.


import java.util.*;
import java.lang.*;

public class taskfourten
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 5, -4, 7, 8, -6};
        int size = arr.length;
        int l, r,min_sum, sum, min_l, min_r;

        if(size < 2)
        {
            System.out.println("Invalid Input");
            return;
        }
        min_l = 0;
        min_r = 0;
        min_sum = arr[0] + arr[1];

        for( l =0; l < size-1; l++)
        {
            for(r = l+1; r<size; r++)
            {
                sum = arr[1] + arr[r];
                if(Math.abs(min_sum) > Math.abs(sum))
                {
                    min_sum = sum;
                    min_l = l;
                    min_r = r;
                }
            }
        }
        System.out.println("The two elements whose sum is minimum are: " +arr[min_l]+ " and "+arr[min_r]);
    }

}
