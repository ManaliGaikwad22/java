//Write a Java program to remove the duplicate elements of a given array and return the new length of the array.

public class taskfoureight
{
    public static void main(String[] args)
    {
        int[] num = {10,20, 20, 30, 40, 40, 50};
        System.out.println("The length of original array is: " +num.length);
        System.out.println(" The Array elements are: ");

        for (int i=0; i<num.length; i++)
        {
            System.out.println(num[i]+ " ");
        }
        System.out.println("The new length of array is "+arr_sort(num));
    }

    public static int arr_sort (int[] num)
    {

        int index =1;
        for (int i =0; i < num.length; i++)
        {
            if(num[i] != num[index-1])
                num[index++] = num[i];
        }
        return index;

    }
}
