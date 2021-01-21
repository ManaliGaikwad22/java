/* Write a java program to get the difference between
the largest and the smallest values in an array of integers.
The length of the array must be 1 and above
 */
import java.util.Arrays;

public class differensmalllarge
{
    public static void main(String[] args)
    {
        int[] arr = {9,3,1,8,5};
        System.out.println("Enter the number: " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The Difference between the largest and the smallest number: " +(max-min));
    }
}