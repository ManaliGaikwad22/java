public class secondLargestElement {
    public static int element(int[] a, int total)
    {
        int temp;
        for(int i =0; i<total; i++)
        {
            for(int j = i+1; j<total;j++)
            {
                if(a[i] > a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String[] args)
    {
        int a[] = {29,38,90,48,64};
        System.out.println("Second Largest number is: "+ element(a,5));
    }
}
