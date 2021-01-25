//Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
//
//Sample array: [1,2,4,5,6]
//
//Target value: 6.


import java.util.*;

public class taskfournine
{
    public static ArrayList<Integer> sum_of_array(final List<Integer> a, int b)
    {
        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);

        for(int i=0; i < a.size(); i++)
        {
            if(my_map.containsKey(a.get(i)))
            {
              int index = my_map.get(a.get(i));
              result.set(0, index);
              result.set(1,i);
              break;
            }
            else
            {
                my_map.put(b-a.get(i),i);
            }
        }
        return result;

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> my_array = new ArrayList<Integer>();
        my_array.add(1);
        my_array.add(2);
        my_array.add(4);
        my_array.add(5);
        my_array.add(6);
        int target = 6;
        ArrayList<Integer> result = sum_of_array(my_array, target);
        for(int i: result)
            System.out.println("Index: " +i+ " ");



    }
}
