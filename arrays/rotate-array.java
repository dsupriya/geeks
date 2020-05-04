class RotateArray
{
    static void rotateArr(int a[], int d, int n)
    {
        // add your code here
        int temp[] = new int[d];
        int i=0;
        for(i=0;i<d;i++)
        {
            temp[i]=a[i];
        }
        for(i=0;i+d<n;i++)
        {
            a[i]=a[i+d];
        }
        for(int j=0;i<n&&j<d;i++,j++)
        {
            a[i]=temp[j];
        }
        /*for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }*/
    }
}
