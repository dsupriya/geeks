public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
        int []arr = {5,4,1,2,3};
        //build the heap
        int n = arr.length;
        for(int i = (n/2)-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
        
        /*for(int i=n-1;i>=0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");*/
        int max = getMax(arr);
        System.out.println(max);
        removeMax(arr,4);
        max = getMax(arr);
        System.out.println(max);
        removeMax(arr,3);
        max = getMax(arr);
        System.out.println(max);
        
        
      
    }
    public static int getMax(int []arr)
    {
        return arr[0];
    }
    public static void removeMax(int []arr,int size)
    {
        int temp = arr[0];
        arr[0] = arr[size];
        arr[size] = temp;
        heapify(arr,size,0);
        
    }
    
    public static void heapify(int []arr, int end, int root)
    {
        int large = root;
        int l = 2*root+1;
        int r = 2*root+2;
        if(l<end && arr[l]>arr[large])
            large = l;
        if(r<end && arr[r]>arr[large])
            large = r;
        if(large!=root)
        {
            //swap
            int temp = arr[large];
            arr[large] = arr[root];
            arr[root] = temp;
            heapify(arr,end,large);
        }
        
    }
}  
