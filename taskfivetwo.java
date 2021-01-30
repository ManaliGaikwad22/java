import java.util.*;

public class taskfivetwo {
    public static void main(String[] args)
    {
        int[] arr = {5,23,6,1,4};
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum=0;
        for(int i = 0; i<arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if (arr[i] != min && arr[i] != max) {
                 sum = sum + arr[i];
            }
        }
        
        System.out.println("The largest value: " +min);
        System.out.println("The smalles value: " +max);
        System.out.println("The result of the rest of the values are: "+ sum);
    }
}
