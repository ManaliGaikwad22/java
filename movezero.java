import java.util.*;

 public class movezero
 {
     public static void main(String[] args)
     {
         int[] arr= {0,9,0,2,3,0,0,8};
         int i=0;
         System.out.println("The number of Array: ");
          for(int n: arr)
              System.out.println(n+" ");

          for(int j=0, l =arr.length; j < l ;)
          {
              if(arr[j]==0)
                  j++;
              else
              {
                  int t = arr[i];
                  arr[i]=arr[j];
                  arr[j]=t;
                  i++;
                  j++;
              }
          }
          while (i<arr.length)
              arr[i++] =0;
          System.out.println(" After moving all the zero at the end of the array: ");
          for(int n:arr)
              System.out.println(n+" ");
          System.out.println("\n");
     }

}
