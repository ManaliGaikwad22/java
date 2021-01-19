import java.util.*;

public class addtwomatrices
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int c,d;

        System.out.println("Input number of rows in the matrix: ");
        a = sc.nextInt();
        System.out.println("Input number of columns in the matrix: ");
        b = sc.nextInt();

        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] sum = new int[a][b];

        System.out.println("Enter elements in the first matrix:");

        for(c=0 ; c<a ; c++)
            for(d=0; d<b; d++)
                arr1[c][d] = sc.nextInt();

        System.out.println("Enter elements in the second matrix:");

        for(c=0 ; c<a ; c++)
            for(d=0; d<b; d++)
        arr2[c][d] = sc.nextInt();

        for ( c = 0 ; c < a ; c++ )
            for ( d = 0 ; d < b ; d++ )
                sum[c][d] = arr1[c][d] + arr2[c][d];

        System.out.println("Sum of the matrices are: ");

        for ( c = 0 ; c < a ; c++ )
        {
            for ( d = 0 ; d < b ; d++ )
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }


    }
}
