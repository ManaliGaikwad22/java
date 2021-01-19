import java.util.*;

public class removeDuplicate
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int num= 0;
      System.out.println("List all the array elements");
      num = sc.nextInt();
      int arrayIn[] = new int[num];
      System.out.println("Enter the elements: ");

      for(int inc=0; inc<num; inc++)
      {
          arrayIn[inc] = sc.nextInt();
      }
      for(int o=0; o<num; o++)
      {
          for(int i=o+1; i<num;)
          {
              if(arrayIn[o] == arrayIn[i])
              {
                  for(int temp = i; temp<num; ++temp)
                  {
                      arrayIn[temp] = arrayIn[temp+1];
                  }
                  num = num - 1;
              }
              else
              i++;

          }
      }
      System.out.println("Elements are removing the duplicate values: ");
      for(int i=0; i<num;i++)
          System.out.println(arrayIn[i]);

  }
}

