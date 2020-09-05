// { Driver Code Starts
import java.util.*;
class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            hs.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
    public void heapSort(int arr[], int n)
    {
        GfG g = new GfG();
        g.buildHeap(arr, n);
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            g.heapify(arr, i, 0);
        }
    }
}


// } Driver Code Ends


class GfG
{
    void buildHeap(int a[], int n)
    {
        
        for(int i=(n/2)-1;i>=0;i--)
            heapify(a,n,i);
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int a[], int n, int i)
    {
        int large = i;
    int l = 2*i+1;
    int r = 2*i+2;
    if(l<n && a[l]>a[large])
       large = l;
        
    if(r<n && a[r]>a[large])
        large = r;
        
    if(i!=large)
    {
        int temp = a[i];
        a[i] = a[large];
        a[large] =temp;
        heapify(a,n,large);
    }
    }
 }
 
 
